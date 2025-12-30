public class Overloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
static double add(double a, double b){
        return a+b;
}
public static void main(String[] args){
        int result1 = add(10,23);
        int result2 = add(18, 15);
        double result3 = add(15.0, 18.0);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
}
}
