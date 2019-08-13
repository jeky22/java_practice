import java.util.*;

public class collection {
    public static void main(String[] args) {
        // list에 값을 넣어주는 작업
        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");

        // list2에 값을 넣어주는 작업
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49);
        list2.add(900);
        list2.add(123);
        list2.add(23);

        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("str", list); // str이라는 key로 list 넣어주기
        map.put("integer", list2); // integer이라는 이름으로 list2 넣어주기

        ArrayList<String> outlist01 = new ArrayList<String>();
        outlist01 = (ArrayList<String>)map.get("str"); // 값을 뽑아줄 때 타입을 지정해주고 뽑아주어야 한다.

        ArrayList<Integer> outlist02 = new ArrayList<Integer>();
        outlist02 = (ArrayList<Integer>)map.get("integer"); // key 값이 integer인 것을 찾아서 값을 뽑아내준다.

        for(String a : outlist01) {
            System.out.println(a);
        }

        System.out.println("**********");

        for(int b : outlist02) {
            System.out.println(b);
        }
    }
}