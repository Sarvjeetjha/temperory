class Table{
	int x,i;
	
	void get(){
		x=5;}
	void print_table(){
		for(i=1;i<=10;i++){
			System.out.println(x+'+'+i+'='+ x*i);}}}
public class table{
	public static void main(String s[]){
		
		static int a = 5;
		Table obj=new Table();
		obj.get();
		obj.print_table();
		System.out.println(a); 
		}
	System.out.println(a);}