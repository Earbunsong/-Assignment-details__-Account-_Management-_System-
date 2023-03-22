import java.text.Collator;
import java.util.*;

    class Student{
        int id;
        String name;
        float[] scores;
        float average;

        public Student(int id, String name, float average) {
            this.id = id;
            this.name = name;
            this.average = average;
        }

        @Override
        public String toString() {
            return "\n Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", average=" + average +
                    '}';
        }
    }
    public class Test2 {
        public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>(){{
//            add("Rose");  //1
//            add("Lisa");
//            for (int i = 0; i < 4; i++){
//                add("Black pink");
//            }
//        }};
//        names.add("Nita");  //2
//        names.add("Jennie");
//        names.add("Jisoo");
//
//        ArrayList<Integer> values = new ArrayList<>(List.of(12, 13, 14, 15));  //3
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));  //4
//
//        System.out.println(names);
//        System.out.println(values);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>(List.of(81, 28, 45, 34, 11));
//        System.out.println("First element is : " + list.get(0));
//        list.set(list.size()-1, 99);
//        Collections.sort(list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("ArrayList of list : " +list);

            ArrayList<Student> students = new ArrayList<>(){{
                add(new Student(1001, "Lisa", 60));
                add(new Student(1002, "Jennie", 61));
                add(new Student(1003, "Jisoo", 62));
                add(new Student(1004, "Rose", 63));

            }};

            Collections.sort(students, new Comparator<Student>() {  //sort by id
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.id - o1.id;
                }
            });
            System.out.println("------------------ Sort by id ------------------------");
            System.out.println("Here are all the students : \n" + students);

            System.out.println("------------------ Sort by average ------------------------");
            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return (int)(o2.average - o1.average);  //thom tov toch
                }
            });
            System.out.println("Here are all the students : \n" + students);

        }
    }
