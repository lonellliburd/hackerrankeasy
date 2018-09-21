https://www.hackerrank.com/challenges/time-conversion/problem

static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] parts = s.split(":");
        String offset;
        StringBuilder sb = new StringBuilder();

        if(parts[2].contains("AM")){
            offset = String.valueOf(Integer.valueOf(parts[0]) % 12);
            offset = offset.length() > 1 ? offset : "0"+offset;
            parts[2] = parts[2].replace("AM", "");
        } else{
            offset = String.valueOf(12 + Integer.valueOf(parts[0]) % 12);
            parts[2] = parts[2].replace("PM", "");
        }

        sb.append(offset).append(":").append(parts[1]).append(":")
                .append(parts[2]);
        return sb.toString();
    }
