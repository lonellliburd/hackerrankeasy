//https://www.hackerrank.com/challenges/staircase/problem

static void staircase(int n) {
        for(int i=1; i<=n; i++){
                for(int j=(n-i); j>0; j--){
                   System.out.printf(" ");
                }
                printStars(i);
            }
    }
    
    static void printStars(int n){
        for(int i=0; i<n; i++){
            System.out.printf("#");
        }
        System.out.println("");
    }
