public class split {
    public static void main(String[] args){
        String s1 = "Java,Python,C++";
        //storing in string arry
        String[] arr= s1.split(",");
        for(String lang:arr){
            System.out.println(lang);
        }
    }
}
