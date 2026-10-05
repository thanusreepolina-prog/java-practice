import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the number:");
        int num=sc.nextInt();
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
    
}
