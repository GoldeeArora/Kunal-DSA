import java.util.*;
class disappearedK{
    public static void main(String[] args)
    {
        int[] a = {1,1};
List<Integer> n = new ArrayList<Integer>();
n=findDisappearedNumbers(a);
System.out.println(Arrays.deepToString(n.toArray())); //To print the array list in array form
    }
     public static void swap(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> n = new ArrayList<Integer>();
        int i =0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            swap(nums,i,correct);
            else
                i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if((j+1)!=nums[j])
                n.add(j+1);
        }
        return n;
    }
}