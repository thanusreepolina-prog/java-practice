public class AverageArrayElements {
    public static void main(String[] args) {
        int sumOfEle=0;
        int[] arr={10,20,30,40,50};
        int noOfEle=arr.length;
        for(int i=0;i<arr.length;i++){
            sumOfEle=sumOfEle+arr[i];
        }
        double avg=sumOfEle/noOfEle;
        System.out.println("average of values::"+avg);
    }
}
