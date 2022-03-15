package variables;

public class JavaPractice2 {
    static int count = 0;
     public void increment(){
         count++;
     }

    public static void main(String[] args) {
         //this is a static method
     JavaPractice2 obj1 = new JavaPractice2();
     JavaPractice2 obj2 = new JavaPractice2();
     obj1.increment();
     obj2.increment();

        System.out.println("obj1: count is ="+obj1.count);
        System.out.println("obj2 : count is="+obj2.count);



    }


}
