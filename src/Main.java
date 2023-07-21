import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Hina", 26, "JS"));
        students.add(new Student("Haru", 20, "JAVA"));
        students.add(new Student("Aiza", 15, "JS"));
        students.add(new Student("Fuga", 21, "JAVA"));
        students.add(new Student("Aika", 22, "JS"));

        System.out.println(students);
        sortMethod(students);
        ageMethod(students);
        aaMethod(students);
//        for (int i = 0; i < students.size(); i++) {
//            if(){
//
//            }
//        }

//        int a = 5;
//        Integer b = 7;oni menyautcya pod capotom
//        System.out.println(a+b);

//        System.out.println(Integer.parseInt("10")+4);//зменил String na int

//        ArrayList<Integer> interger = new ArrayList<>();
//        interger.add(9);
//        interger.add(3);
//        interger.add(4);
//        System.out.println(interger.get(2));//toString est pod kapotom
//        for (int a : interger) {
//            System.out.println("wo "+a);
//        }


//        MyArreyList myArreyList=new MyArreyList();
//        myArreyList.add("sfg");
//        myArreyList.add(85);
//        ArrayList<Person> peole = new ArrayList<>();
//        peole.add(new Person("nikn",5));//wo


//        ArrayList<Integer> number = new ArrayList<>();
//        for (int i = 0; i <10 ; i++) {
//            number.add(1,0);
//        } System.out.println(number);

//        Random random = new Random();
//        ArrayList<Integer> randomNumbers= new ArrayList<>();
//        for (int i = 0; i <50; i++) {
//            randomNumbers.add(random.nextInt(1,100));
//        }
//        System.out.println("first arrayList  : "+randomNumbers);
//
//
//        ArrayList<Integer> takSan = new ArrayList<>();
//        ArrayList<Integer>jupSan = new ArrayList<>();
//
//        for (Integer r:randomNumbers) {
//            if(r%2==0){
//               takSan.add(r);
//            } else {
//                jupSan.add(r);
//            }
//        }
//        System.out.println("Tak sandar: "+takSan);
//        System.out.println("Jup sandar: "+jupSan);
//
    }

    public static void sortMethod(ArrayList<Student> students) {
        ArrayList<Student> js = new ArrayList<>();
        ArrayList<Student> java = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup().equalsIgnoreCase("JS")) {
                js.add(students.get(i));
            } else if (students.get(i).getGroup().equalsIgnoreCase("JAVA")) {
                java.add(students.get(i));
            }
        }
        System.out.println("------------------------");
        System.out.println("js group");
        System.out.println(js);
        System.out.println("------------------------");
        System.out.println("java group");
        System.out.println(java);
    }

    public static void ageMethod(ArrayList<Student> students) {
        ArrayList<Student> sovershennoLetniyePoshty = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 19 && students.get(i).getAge() < 23) {
                sovershennoLetniyePoshty.add(students.get(i));
            }
        }
        System.out.println("------------------------");
        System.out.println("Age method ");
        System.out.println(sovershennoLetniyePoshty);
    }

    public static void aaMethod(ArrayList<Student> students) {
        ArrayList<Student> aaName = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().startsWith("A")) {
                aaName.add(students.get(i));
            }
        }
        System.out.println("------------------------");
        System.out.println("Name method ");
        System.out.println(aaName);
    }
}