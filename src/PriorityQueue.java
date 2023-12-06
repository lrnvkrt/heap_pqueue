import java.util.LinkedList;

public class PriorityQueue <E extends Comparable<E>> implements AbstractQueue<E> {
    //элементы с более низкими значениями (манимальными) имеют более высокий приоритет
    private LinkedList<E> priorityQueue;

    public PriorityQueue() {
        this.priorityQueue = new LinkedList<>();
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    @Override
    public void add(E element) {
        if (priorityQueue.isEmpty()) {
            priorityQueue.add(element);
        } else {
            int index = 0;
            // если element меньше элемента в priorityQueue.get(index),
            // то он имеет более высокий приоритет и должен быть вставлен перед ним в очередь
            while (index < priorityQueue.size() && element.compareTo(priorityQueue.get(index)) > 0) {
                index++;
            }
            priorityQueue.add(index, element);
        }
    }

    @Override
    public E peek() {
        if (priorityQueue.isEmpty()) {
            return null;
        }
        return priorityQueue.getFirst();
    }

    @Override
    public E poll() {
        if (priorityQueue.isEmpty()) {
            return null;
        }
        return priorityQueue.removeFirst();
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "priorityQueue=" + priorityQueue +
                '}';
    }
}
