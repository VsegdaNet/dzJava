package homework2;

import java.util.Arrays;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        task1();
    }
    private static void task1() {

        String[] Students = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        System.out.println(Arrays.toString(Students));
        String[] name = Students[0].split(":");
        String[] country = Students[1].split(":");
        String[] city = Students[2].split(":");
        String[] age = Students[3].split(":");

        String propusk = "null";
        StringBuilder writeFile = new StringBuilder();
        if (!Objects.equals(name[1], propusk)) {
            writeFile.append(" " + Students[0]);}
        if (!Objects.equals(country[1], propusk)) {
            writeFile.append(" " + Students[1]);}
        if (!Objects.equals(city[1], propusk)) {
            writeFile.append(" " + Students[2]);}
        if (!Objects.equals(age[1], propusk)) {
            writeFile.append(" " + Students[3]);}
        System.out.println("SELECT * FROM USER " + writeFile);

    }

}