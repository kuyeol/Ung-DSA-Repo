package org.acme;

import org.acme.entity.Obj;

public class OtherMain {



    public static void main(String[] A){
     Main a =new Main();

        System.out.println(a.name()+" == a");
        System.out.println(a.pri()+" == a");

        System.out.println(Obj.publicName);
        Main.obj.setPrivateName("asdfasdf");
        System.out.println(Main.obj.publicName);
        System.out.println(Main.obj.getPrivateName());




    }
}
