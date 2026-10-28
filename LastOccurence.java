 public static int LO(int arr[], int target){
	   
	   int low = 0, high = arr.length-1, value = -1 , mid;
      
       while(low<=high){
		   mid = low+(high-low)/2;
		   if(arr[mid]==target ){
			   value= mid;
			   low = mid+1;
		   }
		   else if(arr[mid]<target){
			   low = mid+1;
		   }
		   else{
			   high = mid-1;
		   }
	   }
      return value;		   
    }