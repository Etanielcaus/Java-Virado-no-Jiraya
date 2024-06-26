package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("123", "Xiaomi");
        SmartPhone s2 = new SmartPhone("321", "Apple");
        SmartPhone s3 = new SmartPhone("456", "Samsung");

        List<SmartPhone> smartPhones = new ArrayList<>();
        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);

//        smartPhones.clear();

        String noSerialNumber = "123";
        for (SmartPhone smartPhone : smartPhones) {
            if (!smartPhone.getSerialNumber().equals(noSerialNumber)) {
                System.out.println(smartPhone);
            }
        }
        SmartPhone s4 = new SmartPhone("4567", "Pixel");

        System.out.println(smartPhones.contains(s4));

        int i = smartPhones.indexOf(s4);
        System.out.println(i);
    }
}
