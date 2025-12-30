public class MultipleParameters {
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        int result=add(10, 5);
        System.out.println(result);
        int result1=add(5,10);
        System.out.println(result1);
    }
}
