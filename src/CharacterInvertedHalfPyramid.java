import java.awt.font.FontRenderContext;

public class CharacterInvertedHalfPyramid {

    public static void printPattern(int rows){


        for (int i=1; i<=rows; i++){
            for(int j=rows; j>=i; j--){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(5);
    }
}
