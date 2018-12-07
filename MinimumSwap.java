//https://www.hackerrank.com/challenges/minimum-swaps-2/problem
//Solution O(n)

static int minimumSwaps(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int numSwap = 0;
        int i;

        for (i = 0;  i < arr.length; i++) {
            map.put(arr[i], i);
        }

        int swapWith;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                swapWith = map.get(i+1);
                swap(arr, i, swapWith);
                map.replace(arr[i], i);
                map.replace(arr[swapWith],  swapWith);
                numSwap++;
            }
        }

        return numSwap;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
