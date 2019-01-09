//https://www.hackerrank.com/challenges/frequency-queries/problem
public class FrequencyQueries {
  static List<Integer> freqQuery(List<int[]> queries) {
        Map<Long, Long> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        Map<Long, Long> freqCount = new HashMap<>();


        for (int i = 0; i < queries.size(); i++){
            int []innerList = queries.get(i);
            int q = innerList[0];
            long num = innerList[1];

            if (q == 1){
                long count = 1;
                long currCount = 0;
                if (map.get(num) != null){
                    currCount = map.get(num);
                    count = map.get(num) + 1;
                }
                if (freqCount.get(currCount) != null){
                    long val = freqCount.get(currCount);
                    val -= 1;
                    freqCount.put(currCount, val);
                }

                long newFreq = 1;
                if (freqCount.get(count) != null){
                    newFreq = freqCount.get(count) + 1;
                }
                freqCount.put(count, newFreq);


                map.put(num, count);
            } else if (q == 2){
                long currCount;
                if (map.get(num) != null){
                    long count = map.get(num);
                    if (count > 0){
                        currCount = count;
                        count -= 1;
                        map.put(num, count);

                        if (freqCount.get(currCount) != null){
                            long val = freqCount.get(currCount);
                            val -= 1;
                            freqCount.put(currCount, val);
                        }

                        long newFreq = 1;
                        if (freqCount.get(count) != null){
                            newFreq = freqCount.get(count) + 1;
                        }
                        freqCount.put(count, newFreq);
                    }
                }
            }
            else if (q == 3){
                if (freqCount.get(num) == null){
                    result.add(0);
                } else {
                    if (freqCount.get(num) > 0){
                        result.add(1);
                    } else {
                        result.add(0);
                    }
                }
            }
        }


        return result;

    }
  }
