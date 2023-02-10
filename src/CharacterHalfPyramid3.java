public class CharacterHalfPyramid3 {

    public  void printPattern(int rows){


        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


    }

}
