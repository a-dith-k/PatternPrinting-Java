public class CharacterHalfPyramid {

     static  void printPattern(int rows){
        for(int i=1;i<=rows;i++){
               for(int j=1; j<i; j++){
                   System.out.print((char)(j+64));
               }
               System.out.println();
        }
    }

    public static void main(String[] args) {

        printPattern(6);

        Integer a=67;
       String s=a.toString();


    }
}
