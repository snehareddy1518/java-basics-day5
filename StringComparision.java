public class StringComparision {
    public static void main(String[] args){
        String s1 = new String("Java");
        String s2 = new String("JAVA");
        /*System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); //equals method to compare the strings in java*/
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
