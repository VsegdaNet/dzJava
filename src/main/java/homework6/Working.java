package homework6;

import java.util.*;
public class Working {
    private Set<Specification> notebooks = new HashSet<>();
    private List<Standard> criterionList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void printList() {
        for (Specification notebook : notebooks) {
            if (specIsCorrect(notebook)) {
                System.out.println(notebook);
            }
        }
    }
    public boolean specIsCorrect(Specification notebook){

        for (Standard criterion : criterionList){
            Object valueLaptop = null;

            if (criterion.property.equals("name")){
                valueLaptop = notebook.getName();
            }else if (criterion.property.equals("price")){
                valueLaptop = notebook.getPrice();
            }else if (criterion.property.equals("madeByCompany")){
                valueLaptop = notebook.getMadeByCompany();
            }else if (criterion.property.equals("madeInCountry")){
                valueLaptop = notebook.getMadeInCountry();
            }else if (criterion.property.equals("os")){
                valueLaptop = notebook.getOS();
            }else if (criterion.property.equals("volumeRAM")){
                valueLaptop = notebook.getVolumeRAM();
            }else if (criterion.property.equals("dateOfProduced")){
                valueLaptop = notebook.getDateOfProduced();
            }else {
                continue;
            }

            if (criterion.value != null && !criterion.value.equals(valueLaptop)){
                return false;
            }

            if (criterion.maxValue != null && criterion.maxValue < Double.parseDouble(Objects.toString(valueLaptop))){
                return false;
            }

            if (criterion.minValue != null && criterion.minValue > Double.parseDouble(Objects.toString(valueLaptop))){
                return false;
            }
        }

        return true;
    }

    public Working(Set<Specification> notebooks) {
        scanner = new Scanner(System.in);
        this.notebooks = notebooks;
    }

    public Working(Set<Specification> notebooks, List<Standard> criterionList) {
        scanner = new Scanner(System.in);
        this.notebooks = notebooks;
        this.criterionList = criterionList;
    }
    public int getCriteria(){
        String text = "Выберите цифру, соответствующую критерию: ";

        List<String> properties = propertiesForFilter();

        for (int i = 0; i < properties.size(); i++)
        {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }

        System.out.println(text);

        int value = scanner.nextInt();

        return value;
    }

    public String getPropertyDescription(String property){

        Map<String, String> descriptionsProperties = descriptionsProperties();

        return descriptionsProperties.get(property);

    }

    public Map<String, String> descriptionsProperties(){
        Map<String, String> map = new HashMap<>();

        map.put("name", "Название ноутбука");
        map.put("price", "цена");
        map.put("madeByCompany", "Компания производитель");
        map.put("madeInCountry", "Страна производитель");
        map.put("os", "оперативная система");
        map.put("volumeRAM", "объем жесткого диска");
        map.put("dateOfProduced", "дата производства");

        return map;

    }

    public List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("price");
        list.add("madeByCompany");
        list.add("madeInCountry");
        list.add("os");
        list.add("volumeRAM");
        list.add("dateOfProduced");

        return list;
    }

    public String getOperations(){

        String text = "Выберите опрерацию: \n " +
                "1. Добавить критерий \n " +
                "2. Вывести список \n " +
                "3. Завершить";

        System.out.println(text);

        return scanner.next();
    }

    public Set<String> quantitativeSelection(){
        Set<String> set = new HashSet<>();
        set.add("price");
        set.add("volumeRAM");
        set.add("dateOfProduced");

        return set;
    }

    public Set<String> stringSelection(){
        Set<String> set = new HashSet<>();

        set.add("name");
        set.add("madeByCompany");
        set.add("madeInCountry");
        set.add("os");

        return set;
    }
    public void start(){

        boolean flag = true;
        while (flag){

            String operation = getOperations();
            if (operation.equals("3")){
                flag = false;
                scanner.close();
            }else if(operation.equals("1")){

                int criterion = getCriteria();
                List<String> properties = propertiesForFilter();
                if (criterion - 1 < 0 || criterion - 1 > properties.size() - 1){
                    System.out.println("Введено некорректное значение");
                    continue;
                }
                String property = properties.get(criterion - 1);
                Standard criterionObject = null;
                try {
                    if (quantitativeSelection().contains(property)){
                        criterionObject = Standard.startGetting(scanner, property, true);
                    }else {
                        criterionObject = Standard.startGetting(scanner, property, false);
                    }
                }catch (Exception e){
                    System.out.println("Ошибка при выборе критерия");
                    continue;
                }
                if (criterionObject != null){
                    System.out.println("Критерий добавлен");
                    criterionList.add(criterionObject);
                }
            }
            else if (operation.equals("2")){
                printList();
            }
        }
    }

}