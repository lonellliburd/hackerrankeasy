//https://www.hackerrank.com/challenges/mini-max-sum/problem


static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        int j = arr.length-1;
        
        for(int i=0; i<4; i++){
            minSum += arr[i];
            maxSum += arr[j];
            j--;
        }
        
        System.out.printf("%s %s", minSum, maxSum);

    }
