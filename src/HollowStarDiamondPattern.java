public class HollowStarDiamondPattern {

    public static void printPattern(int rows){
        int ctrl=-1;
        for(int i=1;i<=rows;i++){
            for (int space=1; space<=rows-i; space++){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int space=1; space<=ctrl; space++){
                System.out.print(" ");
            }
            ctrl=ctrl+2;

            if(i>1&&i<=rows){

                System.out.print("*");
            }

            System.out.println();


        }
         ctrl=rows;
        for(int i=1;i<rows;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int space=ctrl; space>=1; space--){
                System.out.print(" ");
            }
            ctrl=ctrl-2;
            if(i<rows-1)
            System.out.print("*");


            System.out.println();


        }

    }

    public static void main(String[] args) {

        printPattern(5);

    }

}
