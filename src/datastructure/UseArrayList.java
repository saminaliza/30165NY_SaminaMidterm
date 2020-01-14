package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Robb");
        myList.add("Jon");
        myList.add("Sansa");
        myList.add("Rickon");
        myList.add("Bran");
        myList.add("Arya");

        System.out.println("_____after adding the list of Strings using for each loop____");
        for (String str : myList)
            System.out.println(str);

        System.out.println("_____after removing the list of Strings using for each loop____");
        myList.remove(0); //removing by index number
        myList.remove("Rickon"); //removing by object

        for (String str : myList)
            System.out.println(str);

        System.out.println("____retrieving data using while loop with iterator____");
        Iterator itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
