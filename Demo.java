// import java.util.StringTokenizer;

// public class Demo {
//     public static void main(String[] args) {
//         // Create a string to tokenize
//         String text = "This is a sample sentence, and we will tokenize it.";

//         // Create a StringTokenizer with a specified delimiter (in this case, space and comma)
//         StringTokenizer tokenizer = new StringTokenizer(text, " ,");

//         // Iterate through the tokens and print them
//         while (tokenizer.hasMoreTokens()) {
//             String token = tokenizer.nextToken();
//             System.out.println(token);
//         }
//     }
// }


    class A{
        int i=20;

    }
    class Demo extends A{
        int i=30;
        void var(){
            System.out.println("i:"+i);
            System.out.println("i:"+super.i);

        }
    
    public static void main(String[] args) {
        Demo b= new Demo();
        b.var();

    }
}