package org.acme.entity;

public class Obj {
    public static String publicName="objpublic";

    private static String privateName="objprivate";



    public Obj(){}



    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }



public static void main(String[] a){

    System.out.println(publicName);
    System.out.println(privateName);

}







}
