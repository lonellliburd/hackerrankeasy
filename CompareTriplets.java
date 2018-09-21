//https://www.hackerrank.com/challenges/compare-the-triplets/problem

static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoints = 0;
        int bPoints = 0;
        List<Integer> points = new ArrayList<>();
        for(int i=0; i<a.size(); i++){
            aPoints += a.get(i) > b.get(i) ? 1 : 0;
            bPoints += b.get(i) > a.get(i) ? 1 : 0;
        }
        points.add(aPoints);
        points.add(bPoints);
        return points;

    }
