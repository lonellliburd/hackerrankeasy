//https://www.hackerrank.com/challenges/a-very-big-sum/problem

static long aVeryBigSum(long[] ar) {
        long bigSum = 0;
        for(int i=0; i<ar.length; i++){
            bigSum += ar[i];
        }
        return bigSum;
    }
