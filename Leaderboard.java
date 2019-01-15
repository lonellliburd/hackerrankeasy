https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
// Climbing the Leaderboard

public class Leaderboard {
  static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] res = new int[alice.length];
        int index = 0;
        int mid = -1;
        boolean found;
        int[] positions = new int[scores.length+1];
        int lo;

        positions[0] = scores[0];
        for (int j = 1; j < scores.length; j++){
            if (scores[j] != positions[index]){
                positions[++index] = scores[j];
            }
        }
        int hi = index + 1;
        index = 0;
        for (int i = 0; i < alice.length; i++){
            if (alice[i] <= positions[hi]){ //function can work without the if and else if conditions. These just guarantee 
                res[index++] = hi+1;          // best case runtime is O(k). Worst case O(klogn), where k is the no. of scores
            } else if  (alice[i] >= positions[0]){ //for alice. n is the number of scores on the leaderboard.
                res[index++] = 1;
            } else {
                found = false;
                lo = 0;
                while ( lo <= hi) {
                    mid = (lo + hi) / 2;
                    if (positions[mid] == alice[i]){
                        res[index++] = mid + 1;
                        hi = mid;
                        found = true;
                        break;
                    }

                    if (alice[i] < positions[mid]){
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
                if (!found) {
                    if (alice[i] < positions[mid]){
                        res[index++] = (mid + 1) + 1;
                        positions[mid+1] = alice[i];
                        hi = mid + 1;
                    } else {
                        res[index++] = (mid) + 1;
                        positions[mid] = alice[i];
                        hi = mid;
                    }
                }
            }
        }

        return res;

    }

} 
