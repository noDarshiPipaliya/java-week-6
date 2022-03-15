package variables;

public class MyMethod {

    static int a = 10;//static variable
    static String name = "Devanshi"; // static variable
    static int A = 20;// instance variable
    String name1 = "Pipaliya";// instance variable
    private Object args;


    public static void main(String[] args) {
        System.out.println(a);//10
        System.out.println(name);//Devanshi
        MyMethod test = new MyMethod();//object
        System.out.println(test.name1);//Pipaliya
    }

    //instance method
    public void test(){
        //via classname
        System.out.println(MyMethod.a);
        System.out.println(name);
    }

    }

