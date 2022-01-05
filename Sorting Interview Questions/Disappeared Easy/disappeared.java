// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// check kunal sir's code it's more simpler
import java.util.*;
class disappeared{
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
            if(nums[i]==i+1)
                i++;
            else if(nums[nums[i]-1]!=nums[i])
                swap(nums,i,(nums[i]-1));
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