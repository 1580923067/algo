package test;

import java.util.*;

public class ConsistentHash<T> {
    private final int numberOfReplicas;
    private final SortedMap<Integer,T> circle=new TreeMap<>();

    public ConsistentHash(int numberOfReplicas, Collection<T> nodes){
        this.numberOfReplicas=numberOfReplicas;
        for (T node : nodes) {
            add(node);
        }
    }

    public void add(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            String nodestr=node.toString()+i;
            int hashcode=nodestr.hashCode();
            System.out.println("hashcode: "+ hashcode);
            circle.put(hashcode,node);
        }
    }

    public void remove(T node){
        for (int i = 0; i < numberOfReplicas; i++) {
            circle.remove((node.toString()+i).hashCode());
        }
    }

    public T get(Object key){
        if (circle.isEmpty()){
            return null;
        }
        int hash=key.hashCode();
        System.out.println("hashcode----->:"+hash);
        if (!circle.containsKey(hash)){
            SortedMap<Integer,T> tailMap=circle.tailMap(hash);
            hash=tailMap.isEmpty()? circle.firstKey() :tailMap.firstKey();
        }
        return circle.get(hash);
    }

    public long getSize(){
        return circle.size();
    }

    public void testBalance(){
        Set<Integer> sets=circle.keySet();
        SortedSet<Integer> sortedSets=new TreeSet<>();
        for (Integer hashCode : sortedSets) {
            System.out.println(hashCode);
        }

        System.out.println("---each loaction's distance are follow: ---");

        Iterator<Integer> it=sortedSets.iterator();
        Iterator<Integer> it2=sortedSets.iterator();
        if (it2.hasNext()){
            it2.next();
        }
        long keyPre,keyAfter;
        while (it.hasNext()&&it2.hasNext()){
            keyPre= it.next();
            keyAfter=it2.next();
            System.out.println(keyAfter-keyPre);
        }
    }

    public static void main(String[] args) {
        Set<String> nodes=new HashSet<>();
        nodes.add("A");
        nodes.add("B");
        nodes.add("C");

        ConsistentHash<String> consistentHash=new ConsistentHash<>(2,nodes);
        consistentHash.add("D");

        System.out.println("hash circle size: "+consistentHash.getSize());
        System.out.println("location of each node are follows: ");
        consistentHash.testBalance();

        String node=consistentHash.get("apple");
        System.out.println("node---------->: "+node);

    }
}
