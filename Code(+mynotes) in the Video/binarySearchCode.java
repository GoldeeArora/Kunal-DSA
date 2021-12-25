class binarySearchCode{
    public static void main(String[] args)
    {
 int[] a ={1,2,3,4,5,6};
 int target =4;
 int v=binarySearch(a,target);
 System.out.println(v);
    }
    // return the index
    // return -1 if not found
    static int binarySearch(int []a,int target){
        int start =0;
        int end = a.length-1;
       
        while(start<=end)
    {
       // m = (start+end)/2; 
       // might be possible that start and end value is too high that it exceeds the range of int
    //    To solve the above problem we can do something like this
       int m=start +(end-start)/2;
        if(target==a[m]){
            return m;
        }
        else if(a[m]>target)
        end=m-1;
        else 
        start = m+1;

    }
    return -1;
    }
}