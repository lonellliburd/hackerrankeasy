static int[] rotLeft(int[] a, int d) {
        int last = a.length-1;
        int [] temp = new int[d];

        for(int i=0; i<d; i++){
            temp[i] = a[i];
        }

        for(int k=d; k<=last; k++){
            a[k-d] = a[k];
        }

        for(int j=a.length-d, i=0; j<a.length; j++, i++){
            a[j] = temp[i];
        }
        return a;
    }
