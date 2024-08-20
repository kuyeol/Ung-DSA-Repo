package org.acme.ds.Linear;

import java.util.Arrays;

public class ArrayEx {

    int a, b[], c[][];
    int     a1;
    int[]   b1;
    int[][] c1;


    static int[]     intArr;
    static short[][] shortArr;
    static short     s, aas[][];
    short     s1;
    short[][] aas1;

    static class Point {
        public Point() {
        }

        int x, y;

        public Point(int x) {
            this.x = x;
        }
    }

    static class PointExtend extends Point {
        int color;


        public PointExtend(int i) {
            this.x = x;
        }
    }

    public static void main(String[] a) {
        intArr = new int[5];
        shortArr = new short[5][5];
//s=new Short("d");
        aas = new short[5][5];

//
//        System.out.println(intArr);
//        System.out.println(shortArr);
//        System.out.println(s);
//        System.out.println(aas);


        //Array register
        int[] intA = new int[10];

        PointExtend[] pe = new PointExtend[10];
        Point[] pa = pe;
        pa[1] = new PointExtend(1);
        //pa[0]=new PointExtend(1);
        System.out.println(pa[1] == null);
        if (pa[0] == null)
            try {

                pa[0] = new Point();
            } catch (ArrayStoreException e) {
                System.out.println(e);
            }


        int[][] arr2d = {{0, 1}, {3, 7, 2, 8, 8}};
        for (int[] ea : arr2d) {
            for (int e : ea) {
                System.out.println(e);
            }
        }

        int m=2;
        int n=4;

        int[][] myarr = new int[m][n];
        System.out.println("--------------");

        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j <n ; j++) {
                myarr[i][j] = j;
                System.out.print(myarr[i][j]);
            }
        }
int[][] clon=myarr.clone();

        System.out.println("\n"+"a"+clon[0][0]);

//        // Array Loop access
//        for (int i = 0 ; i < intA.length ; i++) intA[i] = i*2;
//
//        int sum=0;
//        //Array sum logic e->sum+ -> e/ intA <-> e
//        for(int e: intA) sum += e;
//        System.out.println(sum);
////Array output
//
//        for(int out :intA) System.out.print(out);
//        System.out.println("");
//for (int i=0;i<intA.length;i++) System.out.print(intA[i]);

    }

}
