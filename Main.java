import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop(11, "Lenovo", "Ideapad-100", "black", 15.6, 8, 128, "Windows");
        Laptop lap2 = new Laptop(25, "Apple", "MacBook Pro 13", "silver", 13.3, 8, 256, "macOS");
        Laptop lap3 = new Laptop(36, "Asus", "VivoBook 14", "grey", 14.0, 8, 256, "Windows");
        Laptop lap4 = new Laptop(47, "Aser", "Nitro 5", "black", 15.6, 8, 256, "Windows");
        Laptop lap5 = new Laptop(57, "Lenovo", "V15 ADA", "grey", 15.6, 4, 256, "Windows");
        Laptop lap6 = new Laptop(99, "Apple", "MacBook Pro 13", "white", 13.3, 8, 256, "macOS");
        Laptop lap7 = new Laptop(98, null, null, "green", null, 16, 128, "Windows");
        lap7.setBrand("Xiaomi");

        var laptops = new HashSet<Laptop>(Arrays.asList(lap1, lap2, lap3, lap4, lap5, lap6, lap7));
        System.out.println(laptops);
        
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Scanner scn = new Scanner(System.in);
        Integer num = scn.nextInt();
        if (num == 1 || num == 2) {
            System.out.println("Введите минимальное значение параметра");
            Integer min = scn.nextInt();
            if (num == 1) {
                for (var element : laptops) {
                    if (element.getRam() >= min) {
                        System.out.println(element);
                    }
                }
            }
            else{
                for (var element : laptops) {
                    if (element.getHardDiskSpace() >= min) {
                        System.out.println(element);
                    }
                }
            }
        } 
        else {
            System.out.println("Введите наименование параметра");
            scn.nextLine();
            String param = scn.nextLine();
            if (num == 3) {
                for (var element : laptops) {
                    if (element.getOperatingSystem().equals(param)) {
                        System.out.println(element);
                    }
                }
            }
            else{
                for (var element : laptops) {
                    if (element.getColor().equals(param)) {
                        System.out.println(element);
                    }
                }
            }
        }
        scn.close();
    }
}
