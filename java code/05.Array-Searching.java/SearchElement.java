public class SearchElement {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int searchElement=20;
        for(int i=0;i<arr.length;i++){
            if(searchElement==arr[i]){
                System.out.println("element found");
                return;
            }
        }
        System.out.println("element is not found");
    }
}