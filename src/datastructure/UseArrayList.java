package datastructure;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) throws SQLException {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        connectToMySQL();

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
    public static void connectToMySQL () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/midterm?serverTimezone=UTC";
        String user = "samin";
        String password = "sam10cked";

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, user, password);

            statement = (Statement) connection.createStatement();

            String query = "insert into useArrayList (id, method_used, data_set, result_set) values (01, 'add', 'ArrayList<String> myList', 'str');";
            ResultSet resultSet = statement.execute(query);
            //statement.execute(query);
            System.out.println("query added");

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Something might have went wrong with connection");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ((java.sql.Statement) statement).close();
            connection.close();
        }
    }

}
