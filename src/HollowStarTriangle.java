public class HollowStarTriangle {

    public static void printPattern(int rows){

        for (int i=0; i<rows; i++){
            for(int space=1; space<rows-i; space++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
