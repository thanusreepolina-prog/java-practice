import java.util.Scanner;
public class Fibonnaci{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    int first=0;
    int second=1;
    for(int i=1;i<=num;i++){
        System.out.print(first + " ");
        int next=first+second;
        first=second;
        second=next;
    }
}
}