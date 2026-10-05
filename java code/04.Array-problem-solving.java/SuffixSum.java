public class SuffixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] suffix=new int[arr.length];
        suffix[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int x:suffix)
            System.out.print(x+" ");
    }
}
