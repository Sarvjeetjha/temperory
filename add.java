class A{
	int x,y,z;
	void get(){
		x=5;
		y=10;
              }
         void sum(){
	z=x+y;}
          void print(){
	System.out.println(z);}}

class add{
	public static void main(String s[]){
		A obj=new A();
		obj.get();
		obj.sum();
		obj.print();
		System.out.println("hello");}}