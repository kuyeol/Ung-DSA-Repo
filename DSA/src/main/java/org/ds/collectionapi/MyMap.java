package org.ds.collectionapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {


    public void setNodeMap() {
    }

    public static void main(String[] A) {

        HashMap<String, Double> nodeMap = new HashMap<String, Double>();
        nodeMap.put("MacBook", 1000.0);
        nodeMap.put("IpadPro", 1000.0);
        nodeMap.put("lamborgini", 1000.0);
        nodeMap.put("MacBookAir", 1000.0);

        Set<Map.Entry<String, Double>> setMap = nodeMap.entrySet();
for (Map.Entry<String,Double> me :setMap){
    System.out.println("product \t"+me.getKey());
    System.out.println("VALUE"+"\t $ "+me.getValue()+"Won");
}

    }

}
