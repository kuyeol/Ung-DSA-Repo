package org.acme.ds.collections.collection;

import java.util.LinkedList;
import java.util.Random;

public class LINKEDLIST {

    static class UserRegister {


        Random random = new Random(999);

        private Long idNumber;
        private String name;
        private int age;


        public UserRegister() {

        }


        public UserRegister(Long id, String name, int age) {
            this.name = name;
            this.idNumber = id;
            this.age = age;
        }

        public Long generateId() {
            Long id = Long.valueOf(name.hashCode() + age);
            this.idNumber = id;
            return idNumber;
        }

        public UserRegister(String name, int age) {
            this.name = name;
            this.age = age;
            this.idNumber = generateId();
        }

        public void setIdNumber(Long idNumber) {
            this.idNumber = idNumber;
        }

        public void getName(String name) {
            this.name = name;
        }

        public String toString() {
            return "\n" + "id\t : " + idNumber + "\n" + "name\t : " + name + "\n" + "age\t : " + age + "\n";
        }

    }

    public static void main(String[] a) {


        LinkedList<UserRegister> user = new LinkedList<>();
        user.add(new UserRegister("aa", 32));
        user.add(new UserRegister("ab", 32));
        user.add(new UserRegister("ac", 32));
        user.add(new UserRegister("abc", 32));
        System.out.println("\t" + user + "\n");


        int i = 0;
        for (UserRegister u : user) {
            i++;
            System.out.println("[" + i + "] NAME : " + u.name + u + "----------\n");

        }


    }


}