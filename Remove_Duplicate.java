package Arrays;

public class Remove_Duplicate {

    public static void main(String[] ags){
        int arr [] = {1,1,2,2,3,4,4,5};
        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
int uniqueCount = i+1;
System.out.println("Unique Element ");
for(int k=0; k<uniqueCount; k++){
    System.out.println(arr[k]);
}
    }
    
}
