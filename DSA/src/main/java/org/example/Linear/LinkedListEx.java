package org.example.Linear;

import java.util.LinkedList;

//Dynamic Data Structure
public class LinkedListEx {

  public LinkedListEx() {
  }



  public LinkedList<String> tableIndex() {
    //first delete poll
    //last delete pop
    // first insert push
    //last insert add

    LinkedList<String> link = new LinkedList<String>();
    link.add("0");
    link.add("1");
    link.add("2");
    link.add("4");
    link.push("11");
    link.poll();
    System.out.println(link);


    return link;
  }
}
