package Arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String[] args) {


        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};


        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("John","Chris","Eric","Luke"));

        //Get element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        //Get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());


        //Add an element
        //You can't do that with Arrays
        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(4));

        //Set an element
        friendsArray[0]="Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0,"Carl");
        System.out.println(friendsArrayList.get(0));

        //Remove an element
        //Can't do this with Arrays
        friendsArrayList.remove("chris");
        System.out.println(friendsArrayList.get(0));

        //Print
        System.out.println(friendsArray);
        System.out.println(friendsArrayList);


    }

}
