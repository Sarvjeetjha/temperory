class Student_record{
    String name;
    String fathers_name;
    int age;
    Student_record(){
        String name="mohan";
        String fathers_name="Shyam";
        int age=50;
        System.out.println("your name:-->"+name);
        System.out.println("your fathers name:-->"+fathers_name);
        System.out.println("your age:-->"+age);
    }
    Student_record(String n,String f,int a){
        name =n;
        fathers_name=f;
        age=a;
        System.out.println("your name:-->"+name);
        System.out.println("your fathers name:-->"+fathers_name);
        System.out.println("your age:-->"+age);
    }
    Student_record(Student_record s2){
        this.name=s2.name;
        this.fathers_name=s2.fathers_name;
        this.age=s2.age;
        System.out.println("your name:-->"+name);
        System.out.println("your fathers name:-->"+fathers_name);
        System.out.println("your age:-->"+age);
    }

}

class Student{
    public static void main(String[]rgs){
            // System.out.println("printing value using default constructer");
            Student_record s1=new Student_record();
            // System.out.println("printing value using parametrized con");
            Student_record s2=new Student_record("sarvjeet","Narayan jha",20);
            Student_record s3=new Student_record(s2);
            

    }
};