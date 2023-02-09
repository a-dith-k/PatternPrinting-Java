public class VerticalStarPyramid {

    public static void printPattern(int  rows){

        for(int i=1; i<=rows; i++){
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
        }


        for(int i=rows-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(6);
    }
}
