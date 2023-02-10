public class HollowStarTriangle {

    public static void printPattern(int rows){

        for (int i=1; i<=rows; i++){

            for(int space=rows; space>=i; space--){
                System.out.print(" ");

            }
            System.out.print("*");
            if(i>1&&i<=rows){
                for(int space=2;space<(2*i)-1;space++){
                    if(i==rows){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(10);
    }
}
