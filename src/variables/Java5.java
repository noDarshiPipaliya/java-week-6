package variables;

public class Java5 {

    // java programme to swap two variables
    public static void main(String[] args) {

        int x = 100;
        int y = 200;

        System.out.println("before swap");
        System.out.println("x="+x);
        System.out.println("y="+y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("after swap");
        System.out.println("x = "+x);
        System.out.println("y = "+y);

    }

}
