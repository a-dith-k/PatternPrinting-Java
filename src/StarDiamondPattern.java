public class StarDiamondPattern {

    public static void printPattern(int rows){

        for(int i=1; i<=rows; i++){
            for(int space=1; space<=rows-i; space++){
                 System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.print('\n');

        }


        for(int i=rows-1; i>=1; i--){
            for(int space=1; space<=rows-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        printPattern(5);
    }
}
