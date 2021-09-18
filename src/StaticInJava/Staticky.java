package StaticInJava;



// Static method main class in icinde olmayan degeri (variable) main classin icerisinde calistirmak icin kullanilir.

public class Staticky {

    static int a = 0;
    static int months = 12;


    public static void main(String[] args) {

        int b = 1;
        //Staticky s = new Staticky();  > Bu yontem public class da Static yazmadan kullanilabilen ikinci bir yontemdir.
        //System.out.println(s.a);

        System.out.println(months + b);





    }
}
