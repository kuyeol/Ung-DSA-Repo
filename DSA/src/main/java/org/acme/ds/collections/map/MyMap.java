package org.acme.ds.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.acme.entity.CommandCenter;

public class MyMap {
    Set<String> dd = new HashSet<>();

    public void setNodeMap() {
    }

    public static void main(String[] A) {

        CommandCenter cc = new CommandCenter();
        cc.setId(12L);
        System.out.println(cc.getId());


        HashMap<String, Double> nodeMap = new HashMap<String, Double>();
        nodeMap.put(new String("MacBook1"), new Double(1000.110));
        nodeMap.put("IpadPro", 1000.0);
        nodeMap.put("lamborgini", 1000.0);
        nodeMap.put("MacBookAir", 1000.0);
System.out.println(nodeMap+"nodeMap");


        Set<Map.Entry<String, Double>> setMap = nodeMap.entrySet();
        
        for (Map.Entry<String, Double> me : setMap) {
            System.out.print("\t"+me.getKey()+" : ");
            System.out.println("\t$" + me.getValue() + "Won");
        }
System.out.println(setMap);
    }

}
