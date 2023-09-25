class calculate{
    void Sum(int a ,int b){
        System.out.println("base class  " );
    }
    void Sum(int a ,int b,int c){
        System.out.println("Sum  is " +(a+b+c));
    }
    void Sum(float a ,int b){
        System.out.println("Sum  is " +(a+b));
    }
    void Sum(int a ,float b){
        System.out.println("Sum  is " +(a+b));
    }
    
}
class Findsum  extends calculate{
    void Sum( int a ,int b){
        super.Sum(a,b);
        System.out.println("Sum is derived class "+(a+b));
    }
}
class OverloadiingOverridding {
    public static void main(String [] args){
    Findsum d1=new Findsum();
    d1.Sum(1,2);
    d1.Sum(2,3,8);
}}
