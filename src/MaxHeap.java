import java.util.ArrayList;

public class MaxHeap<E extends Comparable<E>> implements Heap<E> {
    private ArrayList<E> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public void add(E element) {
        this.heap.add(element);
        this.heapifyUp(this.size()-1);
    }

    @Override
    public E peek() {
        if (heap.isEmpty()) {
            return null;
        } else {
            return heap.get(0);
        }
    }

    public E poll() {
        if (heap.isEmpty()) {
            return null; // Возвращаем null, так как куча пуста
        }

        E root = heap.get(0);

        // Перемещаем последний элемент кучи на место корня
        heap.set(0, heap.get(size() - 1));
        heap.remove(size() - 1);

        // Вызываем heapifyDown для восстановления свойств Max-Heap
        heapifyDown(0);

        return root;

    }

    private void heapifyUp(int index) {
        while(index > 0 && getParent(index).compareTo(heap.get(index)) <= 0) {
            int parentAt = getParentIndex(index);
            swap(index, parentAt);
            index = parentAt;
        }
    }

    private void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largest = index;

        if (leftChild < size() && heap.get(leftChild).compareTo(heap.get(largest)) > 0) {
            largest = leftChild;
        }

        if (rightChild < size() && heap.get(rightChild).compareTo(heap.get(largest)) > 0) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int index, int parentIndex) {
        E current = heap.get(index);
        heap.set(index, heap.get(parentIndex));
        heap.set(parentIndex, current);
    }

    private E getParent(int index) {
        return heap.get(getParentIndex(index));
    }

    private int getParentIndex(int index) {
        return (index-1)/2;
    }

    @Override
    public String toString() {
        return "MaxHeap{" +
                "heap=" + heap +
                '}';
    }
}
