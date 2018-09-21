//https://www.hackerrank.com/challenges/birthday-cake-candles/problem

static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int tallest = ar[ar.length-1];
        int count = 0;
        
        for(int i=ar.length-1; i>=0; i--){
            if (ar[i] == tallest){
                count++;
            } else {
                break;
            }
        }
        
        return count;
    }
