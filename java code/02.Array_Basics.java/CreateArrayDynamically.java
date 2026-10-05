import java.util.Scanner;
public class CreateArrayDynamically {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size1:");
        int size=sc.nextInt();
        int[] marks=new int[size];
        System.out.println("enter the marks::");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
}