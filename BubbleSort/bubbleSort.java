import java.lang.*;
import java.util.*;
// big O(N2) complexity in general 
// for the best case (when the array is already sorted ) loops runs only one time;
class bubbleSort{
    public static void BSort(int[] arr)
    { boolean swapped;//if the array is already sorted then DRY
        for(int i =0;i<arr.length;i++) //this loop is only for counting no. of time sorting must take place 
        {
            swapped = false;
            for(int j=1;j<arr.length-i;j++) //this will compare the elements one by one
            // refer to notes for -i significance
            { 
                if(arr[j]<arr[j-1])
                {
                   int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }

            }
if(!swapped)
break;
        }
        // System.out.println(Arrays.toString(arr));
    }
public static void main(String[] args)
{
    int[] arr = {3,4,2,1,7,5};
    BSort(arr);
    System.out.println(Arrays.toString(arr));
}
}