//https://www.hackerrank.com/challenges/diagonal-difference/problem

static int diagonalDifference(int[][] arr) {
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i=0, j=0; i<arr[0].length; i++, j++){
            leftSum += arr[i][j];
        }
        
        for(int i=0, j=arr[0].length-1; i<arr[0].length; i++, j--){
            rightSum += arr[i][j];
        }
        
        return Math.abs(leftSum - rightSum);

    }
