public class Main {
    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.add(7);
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.add(9);
        maxHeap.add(3);
        System.out.println(maxHeap);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(8);
        System.out.println(priorityQueue);

        SecondPriorityQueue<Integer> secondPriorityQueue = new SecondPriorityQueue<>();
        secondPriorityQueue.add(4);
        secondPriorityQueue.add(5);
        secondPriorityQueue.add(3);
        secondPriorityQueue.add(1);
        secondPriorityQueue.add(8);
        System.out.println(secondPriorityQueue);
        System.out.println(secondPriorityQueue.getAllSortedElements());
    }
}