package org.acme;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Eightten {
    public static void main(String[] a) {

        System.out.println(getPossibleState(11));
    }

    public static List<Integer> getPossibleState(int noOf) {
        return IntStream.rangeClosed(0, noOf-1).boxed().map(i -> noOf - i).filter(newHeap -> newHeap >= 0).collect(Collectors.toList());
    }


}
