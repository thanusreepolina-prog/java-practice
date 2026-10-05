import java.util.Scanner;
public class Armstrong{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    while(n>0){
        int d=n%10;
        sum=sum+d*d*d;
        n=n/10;
    }
    if(sum==temp)
        System.out.print("armstrong number");
    else
        System.out.print("not armstrong number");
}
}