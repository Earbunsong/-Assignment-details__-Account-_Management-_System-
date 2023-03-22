import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

    public class GenericTest2 {
        public static void main(String[] args) {
            HashSet<String> hashSet = new HashSet<>(){{
                add("value");
                add("value");
                add("something");
                add("another things");
            }};

            //System.out.println("HashSet element are : " + hashSet);
            ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 7));
            System.out.println("Value : " + arrayList);
            HashSet<Integer> uniqueList = new HashSet<>(arrayList);
            System.out.println("Value after cast : " + uniqueList);

            arrayList = new ArrayList<>(uniqueList);
            arrayList.set(arrayList.size()-1, 10); //update tam index
            System.out.println(arrayList.indexOf(2));
            System.out.println(arrayList.remove(1));
            System.out.println("Array list now : " + arrayList);
        }
    }
