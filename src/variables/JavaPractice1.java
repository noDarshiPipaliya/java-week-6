package variables;

public class JavaPractice1 {
    // instance variables is also called global variables
    int a = 10;
    String name = "Devanshi";// instance variable


    public void method(){
        // local vari
        // ables
        int b = 20;
        System.out.println(b);

    }

    public static void main(String[] args) {
     JavaPractice1 obj = new JavaPractice1();
        System.out.println(obj.a);
        obj.method();


    }


}
