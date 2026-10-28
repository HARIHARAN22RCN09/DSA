public static int ub(int[] arr, int target){
 
   int low = 0, high = arr.length-1, value = arr.length;
   
     /* if(arr.length==0||arr[0]>target){
     return -1;
   }                         // There is no need for -1 because when the first element is greather than the
                  target that is also satisfies the condition for "Upper Bound"
   else{*/
     while(low<=high){
	   
	   int mid = low+(high-low)/2;	 
	   if(arr[mid]> target){
	     value = mid;
		 high = mid -1;
		 }
	   else{
	     low = mid+1;
	   }
	 }
    return value;
   //}
   
   
 }