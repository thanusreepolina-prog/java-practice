import java.util.Scanner; 
public class InvertedReverseNumberTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}