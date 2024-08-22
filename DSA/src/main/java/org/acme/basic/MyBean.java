package org.acme.basic;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.time.Instant;

public class MyBean extends Canvas implements Serializable {

    private boolean rectangular;
    private int R, G, B;
    private MyBean color;

    public MyBean() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                change();
            }
        });
        rectangular = false;
        setSize(200, 100);
        change();

    }

    public MyBean(int r, int g, int b) {
        this.R = r;
        this.B = b;
        this.G = g;
    }

    //class inner chain method logic
    private MyBean randomColor() {

        int r, g, b;
        r = (int) (255 * Math.random() % Instant.now().toEpochMilli());
        g = (int) (255 * Math.random() % Instant.now().getNano());
        b = (int) (255 * Math.random() % Instant.now().hashCode());
        System.out.println(r);
        System.out.println(g);
        System.out.println(b);
        return new MyBean(r, g, b);
    }

    public static void main(String[] a) {
        MyBean bean = new MyBean();


        bean.change();
    }

    public void change() {
        color = randomColor();
        repaint();
//change call-> randomColor -> repaint()
    }


    public boolean getRectangular() {
        return rectangular;
    }

    public void setRectangular(boolean flag) {
        this.rectangular = flag;
        repaint();
    }







    /*end line*/

}


