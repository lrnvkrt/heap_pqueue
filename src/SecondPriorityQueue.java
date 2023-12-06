import java.util.ArrayList;

public class SecondPriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {
    //элементы с более высокими значениями (максимальными) имеют более высокий приоритет
    private MaxHeap<E> priorityQueue;

    public SecondPriorityQueue() {
        this.priorityQueue = new MaxHeap<>();
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    @Override
    public void add(E element) {
        priorityQueue.add(element);
    }

    @Override
    public E peek() {
        return priorityQueue.peek();
    }

    @Override
    public E poll() {
        return priorityQueue.poll();
    }

    public ArrayList<E> getAllSortedElements() {
        ArrayList<E> sortedElements = new ArrayList<>();
        while (size() > 0) {
            sortedElements.add(poll());
        }
        return sortedElements;
    }

    @Override
    public String toString() {
        return "SecondPriorityQueue{" +
                "priorityQueue=" + priorityQueue +
                '}';
    }
}
