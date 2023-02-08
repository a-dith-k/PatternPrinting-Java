import java.util.Scanner;

public class NumberPattern {

    public static void printPattern(int rows){

        for (int i=0;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int space=1;space<=2*(rows-i);space++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print");
        int rows=sc.nextInt();

        printPattern(rows);

    }
}
