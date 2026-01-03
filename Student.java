public class Student {
    String name;
    int age;
    Student(String n, int a){
        name = n;
        age = a;
    }
    public static void main(String[] args){
        Student obj = new Student("Sneha", 20);
        System.out.println(obj.name+ "\n"+obj.age);
    }
}
