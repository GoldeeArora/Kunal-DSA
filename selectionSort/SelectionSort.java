import java.util.*;
class SelectionSort{
    public static void main(String[] args)
    {
        int[] a = {5,3,2,1,4};
        for(int i =0;i<a.length;i++)
        {
            int last = a.length-1-i; //refer to notebook why - i
            int maxItem = Max(a,0,last); //search for the maximum element in the range 0-last
            swap(a,maxItem,last);
// System.out.println(Arrays.toString(a));

        }
System.out.println(Arrays.toString(a));
    }
    // This function will give the index of the maximum element 
    public static int Max(int[] a , int start,int end)
    {
    int max = start;
    for(int i =0;i<=end;i++)
    {
        if(a[i]>a[max])
        max = i;

    }
    return max;
    }
    //swap
    public static void swap(int[] a,int x,int y)
    {
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
