//https://www.hackerrank.com/challenges/grading/problem

static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        for(int i=0; i<grades.length; i++){
            if (grades[i] < 38){
                continue;
            }
            
            if ((grades[i]+1) % 5 == 0){
                grades[i] += 1;
            } else if ((grades[i]+2) % 5 == 0){
                grades[i] += 2;
            }
        }
        
        return grades;

    }
