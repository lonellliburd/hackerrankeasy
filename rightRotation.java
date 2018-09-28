//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

static int[] rightRotation(int A[], int K){
        int length = A.length;
        int [] copy = new int[length];
        int i, j;

        if (length == K || length == 0){
            return A;
        }

        K = K > length ? K % length : K;

        for (i = length - K, j=0; i < length; i++, j++){
            copy[j] = A[i];
        }

        for (i=0; j < length; j++, i++){
            copy[j] = A[i];
        }

        return copy;

    }
