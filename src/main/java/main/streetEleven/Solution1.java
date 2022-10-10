package main.streetEleven;

class Solution1 {

    // Create binary
    public String createBinary(int number) {
        String binary = "";
        while (number > 0) {
            binary = (number % 2) + binary;
            number = number / 2;
        }
        return binary;
    }

//    public int solution(int[] A) {
//        int max = 0;
//        for (int i = 0; i < A.length; i++) {
//            int count = 0;
//            for (int j = 0; j < A.length; j++) {
//                if ((A[i] & A[j]) > 0) {
//                    count++;
//                }
//            }
//            if (count > max) {
//                max = count;
//            }
//        }
//        return max;
//    }

    // And is a standard bitwise operator.
    // the and operation can be extended to N integers, for example: 01100 AND 10101 AND 00100 = 00100
    // because AND of 01100 and 10101 is 00100, and AND of 00100 and 00100 is 00100.
    // given an array A consisting of N Integers, returns the size of the largest possible subset of A such that And of all its elements is greater than 0.
    // If there is no such subset, the function should return 0.
    // For example, given A = [13, 7, 2, 8, 3], the function should return 3, because the largest possible subset is {13, 7, 3}, and 13 & 7 & 3 = 1.
    // For example, given A = [1, 2, 4, 8], the function should return 1, because there is no subset such that And of all its elements is greater than 0.
    // For example, given A = [16, 16], the function should return 2, because the largest possible subset is {16, 16}, and 16 & 16 = 16.
    public int solution(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            int count = 1;
            int value = A[i];
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    if ((value & A[j]) > 0) {
                        value = value & A[j];
                        count++;
                    }
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}