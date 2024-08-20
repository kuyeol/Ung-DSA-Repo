package org.acme.ds.Linear;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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



public static void main(String[] args) {


    List<String> hanwaEagles = new LinkedList<>();
    hanwaEagles.add("|H|KIM,0");
    hanwaEagles.add("|H|PARK,1");
    hanwaEagles.add("|H|LEE,2");
    hanwaEagles.add("|H|CHOI,3");
    hanwaEagles.add("|H|WOO,4");
  System.out.println("hanwa Team Members : "+hanwaEagles +"\nLinkedList");

  System.out.println();
  
  List<String> LAdagers = new LinkedList<>();

  LAdagers.add("|LA|asdf,0");
  LAdagers.add("|LA|neyo,1");
  LAdagers.add("|LA|kanye,2");
  LAdagers.add("|LA|liljon,3");
  LAdagers.add("|LA|usher,4");
  System.out.println("LAdagers : "+LAdagers +"\nLinkedList");

  ListIterator<String> listiterator = hanwaEagles.listIterator();
  Iterator<String> iterator = LAdagers.iterator();
  int i =0;
  while (iterator.hasNext()) {
    if (listiterator.hasNext()) {
      listiterator.next();
    }

    listiterator.add("water_mark"+i);
    listiterator.add(iterator.next());
    i++;
  }

  System.out.println("mixed"+hanwaEagles);


  List<String> romoveDupicate= new LinkedList<>();
  romoveDupicate.add("KIM,0");

  hanwaEagles.removeAll(romoveDupicate);
  System.out.println("\nremove dupicate"+hanwaEagles);

}



}
