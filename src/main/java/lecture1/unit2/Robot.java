package lecture1.unit2;

public class Robot {

    static int a = 4;
    static int b = 6;

    public static void main(String[] args) {

//        int a = 3;
//        int b = 5;
//
//        int c = a + b;



       // System.out.println(a + b);

       // System.out.println(sum(a,b));

        print(sum(a,b));
    }


    public static int sum(int a, int b){
//        int c = a + b;
//        return c;
        return a + b;
    }

    public static void print(int c){
        System.out.println(c);
    }


}
