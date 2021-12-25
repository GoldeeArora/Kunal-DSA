// In the last program we were aware of the fact that we are taking an array which is ascending in order
// what if we did not know about the order of the array (ascending or descending)
class OrderAgnosticBinarySearch{
    public static void main(String[] args)
{
 int[] a ={6,5,4,3,2,1};
 int target =4;
 int v=OrderAgnosticBS(a,target);
 System.out.println(v);
}
 static int OrderAgnosticBS(int []a,int target){
        int start =0;
        int end = a.length-1;
       
       boolean isAsc = a[start]<a[end];
        while(start<=end)
    {
       // m = (start+end)/2; 
       // might be possible that start and end value is too high that it exceeds the range of int
    //    To solve the above problem we can do something like this
       int m=start +(end-start)/2;
        if(target==a[m]){
            return m;
        }
        if(isAsc)
        {
        if(a[m]>target)
        end=m-1;
        else 
        start = m+1;
        }
        else{
        if(a[m]>target)
        end=m-1;
        else 
        start = m+1;
        }
    }
    return -1;
    }
}