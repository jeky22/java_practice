import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class practice_collection2 {
    public static void main(String[] args) {

        //선언부
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(19);
        list1.add(20);
        list1.add(30);
        list1.add(12);
        list1.add(40);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(48);
        list2.add(20);
        list2.add(10);
        list2.add(32);
        
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(99);
        list3.add(23);
        list3.add(123);
        
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(49);
        list4.add(22);
        list4.add(45);
        list4.add(12);
        
        /*Mango : 39, 20, 30, 12, 40 Apple : 48, 20, 10, 32 
        Banana : 99, 23,123 Melon : 49, 22, 45, 12 ❖  */
        
        //hmap.put(key,value)
        HashMap<String, List> hmap = new HashMap();
        hmap.put("Mango", list1);
        hmap.put("Apple", list2);
        hmap.put("Banana", list3);
        hmap.put("Melon", list4);

        ArrayList<Integer> val_list= new ArrayList<Integer>();

        Set keySet = hmap.keySet();
        System.out.println(keySet.getClass());

        // for(String key : keySet)
        // {
        //     val_list=(ArrayList<Integer>)hmap.get(key);
        //     for(int value : val_list)
        //     {
        //         System.out.println(value);
        //     }
        // }
       
        // list 출력
        // for(int result : [])
        // {
        //     System.out.println(result);
        // }
       
   
    }
}