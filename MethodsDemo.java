public class MethodsDemo {
    int classlevelVariable=004; //we can access anywhere
    void method(){
    //int add(int a, int b) {
        MethodsDemo obj1=new MethodsDemo();
        //class level variable can access anywhere
        //System.out.println(obj.classlevelVariable);
        //int c = a + b;
        //return c;
    }
    public static void main(String[] args){
        MethodsDemo obj = new MethodsDemo();
        obj.method();
       // int result = obj.add(10,20);
        //System.out.println(result);
        System.out.println(obj.classlevelVariable);
    }
}
