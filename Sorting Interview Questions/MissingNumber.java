class MissingNumber{
    public static void main(String[] args)
    {

int[] a = {3,0,1};
int answer = missingNumber(a);
System.out.println(answer);
    }
     public static void swap(int[] a,int first,int second)
    {
        int temp = a[first];
        a[first]=a[second];
        a[second] = temp;
    }
   
    public static int missingNumber(int[] nums) {
        int i =0;
        int t = 10001;
       while(i<nums.length)
       {
           if(nums[i]==i)
               i++; //element is at the right index
           else{
               if(nums[i]<nums.length)
              swap(nums,i,nums[i]);
               else
              { t=i; //this will store the index where the nums.length element is at after sorting the whole array
                   i++;
              }    
           }
       }
 if(t==10001)
     return nums.length;//if t is not changed then the nums.length element is not present 
        
     return t;   
    }
}