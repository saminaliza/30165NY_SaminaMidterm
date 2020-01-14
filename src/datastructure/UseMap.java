package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        Map<String, List<String>> list = new HashMap<String, List<String>>();
        String studentName1 = "John";
        String studentName2 = "Marry";
        String studentName3 = "Joey";

        List<String> student1Info = new LinkedList<String>();
        student1Info.add("100-01 persons blvd");
        student1Info.add("abc@gmail.com");

        List<String> student2Info = new LinkedList<String>();
        student2Info.add("178-02 merrick blvd");
        student2Info.add("efg@gmail.com");

        List<String> student3Info = new LinkedList<String>();
        student3Info.add("150-90 31st street");
        student3Info.add("xyz@gmail.com");


        list.put(studentName1, student1Info);
        list.put(studentName2, student2Info);
        list.put(studentName3, student3Info);

        System.out.println("_____retrieving data using for each loop_____");

        for (Map.Entry m : list.entrySet()) {
            System.out.println("Key = " + m.getKey() + " , " + "Value = " + m.getValue());
        }

        System.out.println("_____retrieving data using while loop with Iterator_____");

        Iterator<Map.Entry<String, List<String>>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + " , " + "Value= " + entry.getValue());
        }
    }

}
