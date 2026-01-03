public class Member {
        //Attributes(Variables)
        String name;
        int age;
        //Methods(functions)
        void displayInfo() {
            System.out.println("Your name is: " + name);
            System.out.println("Your age: " + age);
        }
        public static void main(String[] args){
        Member obj = new Member();
        obj.name="Sneha Reddy";
        obj.age=20;
        obj.displayInfo();
    }
}
