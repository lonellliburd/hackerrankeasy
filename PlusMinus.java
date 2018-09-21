//https://www.hackerrank.com/challenges/plus-minus/problem

static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat(".000000");
        df.setRoundingMode(RoundingMode.UP);
        double pos = 0; 
        double neg = 0;
        double zero = 0;
        for(int i=0; i<arr.length; i++){
            pos += arr[i] > 0 ? 1 : 0;
            neg += arr[i] < 0 ? 1 : 0;
            zero += arr[i] == 0 ? 1 : 0;
        }
        
        System.out.println(df.format(pos/arr.length));
        System.out.println(df.format(neg/arr.length));
        System.out.println(df.format(zero/arr.length));

    }
