package Arrays;

import java.util.*;

public class Union_2_Array {

    int arr1[] = {1,2,3,4};
    int arr2[] = {3,4,5,6};

    HashSet <Integer> set = new HashSet<>();

    for(int num1 : arr1){
        set.add(num1);
    }
    for(int num2:arr2){
        set.add(num2);
    }
    System.out.println(set);
}
