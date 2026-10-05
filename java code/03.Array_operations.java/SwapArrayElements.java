public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int pos1=2;
        int pos2=4;
        System.out.println("before swapping");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
        System.out.println();
        System.out.println("after swapping");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
