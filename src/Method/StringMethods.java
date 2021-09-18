package Method;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Billy Bob Joe";

        System.out.println("Name " + name);
        System.out.println("Uppercase:" + name.toUpperCase());   //Buyuk harfle yazmak
        System.out.println("Lowercase:" + name.toLowerCase());   //Kucuk harfle Yazmak
        System.out.println("Fist char:" + name.charAt(0));       //Ilk harfi yazmak
        System.out.println("Legnth:" + name.length());           //Uzunluk
        System.out.println("Last char: " + name.charAt(12));     //Son harfi yazmak icin
        System.out.println("Substring: " + name.substring(10, 13)); //Istenilen aralikdaki degeri yazmak icin


    }
}

