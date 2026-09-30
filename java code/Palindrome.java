import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    int temp=num;
    int reverse=0;
    while(num!=0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
    }
    if(reverse==temp){
        System.out.println("palindrome");
    }else{
        System.out.print("not palindrome");
    }
}
}