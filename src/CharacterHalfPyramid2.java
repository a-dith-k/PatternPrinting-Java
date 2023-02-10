public class CharacterHalfPyramid2 {

    public static void printPattern(int rows){

        for(int i=rows; i>=1; i--){
             for(int j=1; j<=i; j++){
                 System.out.print((char)(j+64)+" ");
             }
             System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(7);
    }
}
