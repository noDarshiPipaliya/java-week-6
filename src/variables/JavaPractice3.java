

package variables;

public class JavaPractice3 {

    //instance variable
    int a = 10;
    String name = "Devanshi";//instance variable
    static int b = 20;// static variable


    public static void main(String[] args) {
        JavaPractice3 obj = new JavaPractice3();//object
        System.out.println(obj.a);//10
        obj.test();//10,Devanshi
        System.out.println(obj.name);// Devanshi

    }

    // instance method
    public void test() {
        // instance area
        System.out.println(a);//10
        System.out.println(name);//Devanshi
    }

}
