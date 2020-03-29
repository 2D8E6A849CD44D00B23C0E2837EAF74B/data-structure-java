package com.maxwit;

public class SequentialListMain {
    public static void main(String[] args) {
        SequentialList<Integer> sequentialList1 = new SequentialList<Integer>();
        for(Integer x = 11; x < 16; x++) {
            sequentialList1.insert(x);
        }
        sequentialList1.traversal(x -> System.out.println(x));

        System.out.println("-------------------------------");

        SequentialList<String> sequentialList2 = new SequentialList<String>();
        try {
            for (Integer x = 1; x < 8; x++) {
                sequentialList2.insert(x + ": ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.fillInStackTrace());
        }

        System.out.println("-------------------------------");

        sequentialList2.forEach(x -> System.out.println(x));

        try {
            String x = sequentialList2.get(9);
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("-------------end--------------");
    }
}
