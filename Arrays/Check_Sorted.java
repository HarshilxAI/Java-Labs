package Arrays;

public class Check_Sorted {
    public static void main(String[] args){

        int arr[] = {10,20,30,25,45};
        boolean inSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                inSorted=false;
                break;
            }
        }
System.out.println(inSorted);

    }
    
}
