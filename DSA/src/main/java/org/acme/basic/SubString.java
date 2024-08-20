package org.acme.basic;

public class SubString {


    public static void main(String... a) {


//        String aa="public";
//        String as="qwerty";
//        getCha(aa,as);

        autoPrint(21);


    }

    static String ms(String m) {
        System.out.println(m);
        return m;
    }

    static String autoPrint(int n) {
        System.out.println();

        if (n == 0) {
            return ms("The End");
        }

        System.out.print("Call of Parameter Number : ");
        System.out.println(n);
        return autoPrint(n - 1);
    }

    static void getCha(String full, String sub) {
        System.out.println(full);
        System.out.println(sub);

        for (int i = 0; i < sub.length(); i++) {
            char s = sub.charAt(i);
            System.out.println("\t[ " + i + " : " + s + " ] ");
        }

    }


}
