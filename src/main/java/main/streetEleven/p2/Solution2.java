package main.streetEleven.p2;

public class Solution2 {
    // there are N empty glasses with a capcity of 1, 2, ..., N liters.
    // you want to pour exactly K liters of water into the glasses.
    // each glass may be either full or empty.
    // what is the minimum number of glasses that you need to contain K liters of water?
    // for example, given N = 5 and K = 8, the function should return 2. there are five glasses of capcity 1, 2, 3, 4, 5.
    // you can two glasses with capacity 3 and 5 to hold 8 liters of water.
    // given N = 4 and K = 10, the function should return 4. you must use all the glasses to contain 10 liters of water.
    // given N = 1 and K = 2, the function should return -1. there is only one glass with capacity 1, so you cannot pour 2 liters of water.
    // given N = 10 and K = 5, the function should return 1. you can use one glass with capacity 5 to hold 5 liters of water.
    public int solution(int N, int K) {
        int count = 0;
        int sum = 0;
        for (int i = N; i > 0; i--) {
            if (sum + i <= K) {
                sum += i;
                count++;
            }
        }
        if (sum == K) {
            return count;
        } else {
            return -1;
        }
    }
}
