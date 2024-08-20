package org.acme;

import org.acme.entity.Obj;

public class Main {


   static Obj obj=new Obj();

    public static String name(){

        return obj.publicName;
    }
public static String pri(){
//obj.setPrivateName("----------");

        return obj.getPrivateName();
}

public static void main(String[] a){

        Obj o = new Obj();

    System.out.println(name());
    System.out.println(pri());
o.publicName="swap";

    System.out.println(o.publicName);
    System.out.println(o.getPrivateName());


    System.out.println();
}

}
