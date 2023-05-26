package homework6;
import java.util.HashSet;
import java.util.Set;


//public class LaptopMajor {


public class LaptopMajor {
    public static void main(String[] args) {
        Set<Specification> set = new HashSet<>();
        set.add(new Specification("Laptop 1", 52000, "ASUS", "China", "Windows11", 256, 2021));
        set.add(new Specification("Laptop 2", 58000, "HP", "Lipetsk", "Linux", 128, 2018));
        set.add(new Specification("Laptop 3", 91000, "MSI", "Korea", "Windows11", 512, 2023));
        set.add(new Specification("Laptop 4", 15000, "Upiter", "Minsk", "Windows7", 128, 2010));

        Working operation = new Working(set);
        operation.start();
    }

}

