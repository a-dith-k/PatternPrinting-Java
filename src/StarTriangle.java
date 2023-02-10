public class StarTriangle {
     int a;
     void printPattern(int rows){
        for(int i=1;i<=rows;i++){
            for(int space=rows;space>i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarTriangle r=new StarTriangle();
        r.printPattern(5);
        StarTriangle s=new StarTriangle();
        s.printPattern(19);
        System.exit(0);

    }

}
