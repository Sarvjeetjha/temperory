import java.util.Scanner;

class MultiplyMatrix {
    public int a[][] = new int[3][3];
    public int b[][] = new int[3][3];
    public int mul[][] = new int[3][3];

    void input(int r, int c) {
        System.out.println("enter element in first matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner s1 = new Scanner(System.in);
                a[i][j] = s1.nextInt();
            }

        }
        System.out.println("enter element in second matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner s1 = new Scanner(System.in);
                b[i][j] = s1.nextInt();
            }

        }

    }

    void display() {
        System.out.println("printing first matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("\n");

        }
        System.out.println("printing second matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("\n");

        }

    }
    void multiply(int r,int c){
        int sum;
        for (int i = 0; i < 3; i++) {
           
            for (int j = 0; j < 3; j++) {
                 sum=0;
                for(int k=0;k<3;k++){
                   sum=sum + (a[i][k]*b[k][j]); 
                }
                mul[i][j]=sum;
            }
            

        }
    }
    void MulDisplay(int r,int c){
        System.out.println("Sum of matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mul[i][j] + "  ");
            }
            System.out.println("\n");


    }
}}

class matrixMultiply extends MultiplyMatrix {

    public static void main(String[] args) {
        MultiplyMatrix s1 = new MultiplyMatrix();
        s1.input(3, 3);
        s1.display();
        s1.multiply(3,3);
        s1.MulDisplay(3, 3);
    }

}
