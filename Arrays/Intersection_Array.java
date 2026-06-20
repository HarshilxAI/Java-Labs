package Arrays;
import java.util.*;

public class Intersection_Array{
    public static void main(String[] args){
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};

        HashSet <Integer>set = new HashSet<>();

        for(int num1:arr1){
            set.add(num1);
        }

        for(int num:arr2){
            if(set.contains(num)){
                System.out.println(num);  
            }
        }
    }
}