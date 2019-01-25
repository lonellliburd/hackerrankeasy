static int[] rotLeft(int[] a, int d) {
        int [] res = new int[a.length];

        int i = 0;
        while (i < a.length){
            res[i] = a[d];
            i++;
            d = (d + 1) % a.length; 
        }

        return res;
    }
