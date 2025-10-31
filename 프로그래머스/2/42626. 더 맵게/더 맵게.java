import java.util.*;

class Solution {
   public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 배열의 모든 원소를 큐에 추가
        for (int s : scoville) {
            queue.add(s);
        }

        int count = 0;

        // 큐의 최소값이 K 이상이 될 때까지 반복
        while (!queue.isEmpty() && queue.peek() < K) {
            if (queue.size() < 2) {
                // 섞을 재료가 2개 미만이면 불가능
                return -1;
            }

            int first = queue.poll();
            int second = queue.poll();

            int mixed = first + (second * 2);
            queue.add(mixed);
            count++;
        }

        return count;
    }
}