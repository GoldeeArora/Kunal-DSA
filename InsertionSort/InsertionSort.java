import java.util.*;
class InsertionSort{
    public static void main(String[] args)
    {
        int[] a = {5,4,2,1,3};
        for(int i =0;i<a.length-1;i++)//it will work till length-2(refer to notes)
        {
            // it will perform the no. of sorting algo
            for(int j=i+1;j>0;j--)//(it will sort from 0-i+1)
            {
                if(a[j-1]>a[j])
               { swap(a,j,j-1);}
                else //if the j>j-1 then j-2 will be less than j-1 and j because they are sorted Ps: here j represents element at j
               {  break;}
            }

        // System.out.println(Arrays.toString(a));

        }
        System.out.println(Arrays.toString(a));

    }
    public static void swap(int[] a,int x,int y){
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
        // System.out.println(Arrays.toString(a));
    }
}