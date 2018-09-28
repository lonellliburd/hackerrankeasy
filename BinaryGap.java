//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/


static int binaryGap(int N){
        String bin = decToBinString(N);
        int lo = 0;
        int hi = bin.length() - 1;
        int start = 0;
        int count = 0;
        int max = 0;

        while (lo < hi){
            if (bin.charAt(lo) == '1') {
                start = lo + 1;
                while (start < hi && bin.charAt(start) == '0'){
                    count++;
                    start++;
                }
                if (start >= hi && bin.charAt(hi) != '1'){
                    count = 0;
                }
            }
            max = count > max ? count : max;
            count = 0;
            lo = start;
        }

        return max;
    }
    
static String decToBinString(int n){
        StringBuilder sb = new StringBuilder();

        while (n > 0){
            sb.append(n%2);
            n = n/2;
        }

        return sb.reverse().toString();
    }
