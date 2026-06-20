package Arrays;

public class Frequency_Element {

    public static void main(String[]args){
        int [] arr = {1,2,3,2,1,3,4};
    int target = 2;
int count = 0;
for (int i=0; i<arr.length; i++){
    if(arr[i] == target){
        count++;
    }
}
System.out.println(count);
}
    }
    

