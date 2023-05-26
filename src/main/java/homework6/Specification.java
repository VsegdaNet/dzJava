package homework6;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Specification {

    private String name;
    private int price;
    private String madeByCompany;
    private String madeInCountry;
    private int dateOfProduced;
    private String os;
    private int volumeRAM;

    public Specification(String name, int price, String madeByCompany, String madeInCountry,  String os, int volumeRAM, int dateOfProduced){
        this.name = name;
        this.price = price;
        this.madeByCompany = madeByCompany;
        this.madeInCountry = madeInCountry;
        this.os = os;
        this.volumeRAM = volumeRAM;
        this.dateOfProduced = dateOfProduced;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("price");
        list.add("madeByCompany");
        list.add("madeInCountry");
        list.add("os");
        list.add("volumeRAM");
        list.add("dateOfProduced");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "Цена:" + price +
                ", Производитель: " + madeByCompany +
                ", Страна: " + madeInCountry +
                ", Операционная Система: " + os +
                ", Объем ОП: " + volumeRAM +
                ", Дата производства: " + dateOfProduced;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getMadeByCompany(){
        return madeByCompany;
    }
    public void setMadeByCompany(String madeByCompany){
        this.madeByCompany = madeByCompany;
    }

    public String getMadeInCountry(){
        return madeInCountry;
    }
    public void setMadeInCountry(String madeInCountry){
        this.madeInCountry = madeInCountry;
    }


    public int getDateOfProduced(){
        return dateOfProduced;
    }
    public void setDateOfProduced(int dateOfProduced){
        this.dateOfProduced = dateOfProduced;
    }

    public String getOS(){
        return os;
    }
    public void setOS(String os){
        this.os = os;
    }

    public int getVolumeRAM(){
        return volumeRAM;
    }
    public void setVolumeRAM(int volumeRAM){
        this.volumeRAM = volumeRAM;
    }
}