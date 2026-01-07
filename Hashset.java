import java.util.ArrayList;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();
        //Arraylist<Integer> list= new ArrayList<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
         //Size
       System.out.println("size of set is : " + set.size());

        //searxch contains
    //     if(set.contains(1)) {
    //         System.out.println("set cintains 1");
    //     }
    //     if(!set.contains(6)){
    //         System.out.println("does not contain");
    //     }
    
    
    //  //Delete
    //    set.remove(1);
    //    if(!set.contains(1)) {
    //        System.out.println("does not contain 1-we deleted 1");
    //    }
//Print all elements
       System.out.println(set);



     }
}
