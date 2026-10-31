public class SearchElementInRotatedShortedArr {
    public static int searchElement(int nums[] , int k){
		
	int low = 0, high = nums.length-1;
	while(low<=high){
		int mid = low+ (high-low)/2;
		if(nums[mid]==k){
			return mid;
		}
		if(nums[low]<=nums[mid]){ //shorted first half
			 // pobability of the value lies on first half
			 
			 if(k>=nums[low]&&k<nums[mid]){
				 high =mid-1;
			 }
			 else{
				 low= mid+1;
			 }
			
		}	
		else{                   // shorted second half
           if(k<=nums[high]&&k>nums[mid]){
				low=mid+1;
			}
			else {
				high =mid-1;
			}
		}
	   
	}
		
    return -1;
	}
}
