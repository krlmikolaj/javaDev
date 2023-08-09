import java.util.PriorityQueue;

public class StonesWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b-a);
        for (int each : stones) {
            heap.add(each);
        }

        while(heap.size() > 1) {
            int top1 = heap.poll();
            int top2 = heap.poll();
            int diff = Math.abs(top1 - top2);

            if(diff != 0){
                heap.add(diff);
            }
        }
        if(heap.size() != 0) {
            return heap.poll();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
}
