import java.util.Scanner;

class Test{
    public static void main(String args[]){
        String s;
        System.out.println("enter string");
        Scanner s1=new  Scanner(System.in);
        s=s1.nextLine();
        int i=0;
        int e=s.length()-1;
        while(i<e){
            if(s.charAt(i)!=s.charAt(e)){
                
                System.out.println("not pallindrom");
                break;
            }
            i++;
            e--;
        }
        System.out.println(" pallindrom");


    }
}