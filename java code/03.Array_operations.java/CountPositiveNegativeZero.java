public class CountPositiveNegativeZero {
    public static void main(String[] args){
    int arr[]={-1,2,-1,1,0,0,-5,-3,1,0,3,0};
    int posCount=0;
    int negCount=0;
    int zeroCount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            posCount++;
        }
        else if(arr[i]<0){
            negCount++;
        }else{
            zeroCount++;
        }
    }
    System.out.println("number of positive values:"+posCount);
    System.out.println("number of negative values:"+negCount);
    System.out.println("number of zero values:"+zeroCount);   
}}