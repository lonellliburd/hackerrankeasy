//https://www.hackerrank.com/challenges/sparse-arrays/problem#!

static int[] matchingStrings(String[] strings, String[] queries) {
        Map<Integer, List<String>> map = new HashMap<>();

        for(int i=0; i<strings.length; i++){
            List<String> str = map.get(strings[i].length());
            if (str == null){
                str = new ArrayList<>();
            }
            str.add(strings[i]);

            map.put(strings[i].length(), str);
        }

        int[] count = new int[queries.length];

        for(int j=0; j<queries.length; j++){
            List<String> s = map.get(queries[j].length());
            count[j] = s != null ? Collections.frequency(s, queries[j]) : 0;
        }

        return count;
    }
