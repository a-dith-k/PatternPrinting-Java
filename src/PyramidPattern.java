public class PyramidPattern {

    public static void printPattern(int rows){
         int m;
        for(int i=1;i<=rows;i++){
            for(int space=1;space<=rows-i;space++){
                System.out.print(" ");
            }
            for(int j=i;j<i*2;j++){
                System.out.print(j);

            }
            m=(i*2)-1;
            for(int k=1 ;k<=i-1;k++){
                System.out.print(--m);
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(5);
    }
}
