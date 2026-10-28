public int LB(int target, int[] arr) {
    int l = 0, h = arr.length-1;
    
      int v = arr.length;
    while (l <= h) {
        int m =(h + l) / 2;

        if (arr[m] >= target) {
           v = m;
            h = m-1 ;
        } else {
            l = m +1;
        }
    }

    return v;
}