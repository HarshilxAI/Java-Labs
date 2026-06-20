package Arrays;

public class Move_All_Zero_End {

    public static void main(String[] args){

        int [] arr = {0,1,0,3,12};
        int [] result = new int [arr.length];
        int index = 0;

        for(int i = 0; i<arr.length; i++){

            if(arr[i]!=0){
                result [index] = arr[i];
                index++;
            }
        }
        for(int num: result){
            System.out.println(num);
        }
    }
    
}
