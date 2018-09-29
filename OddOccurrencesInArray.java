//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/

static int oddMan(int A[]){
        if (A.length == 0){
            return 0;
        }

        Arrays.sort(A);
        int length = A.length;
        int i = 0;
        int j = i + 1;

        while(i < length - 1){
            if (A[i] != A[j]){
                if (A[j] == A[j+1]){
                    return A[i];
                } else {
                    return  A[j];
                }
            }
            i+= 2;
            j = i + 1;
        }

        return A[length-1];
    }
