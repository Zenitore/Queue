public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> i  = new Queue<>();
        i.enqueue(6);
        i.enqueue(7);
        i.enqueue(8);
        System.out.println(i.peek());
        System.out.println(i.dequeue());
        System.out.println(i.size());
        System.out.println(i.isEmpty());
        i.dequeue();
        i.dequeue();
        System.out.println(i.isEmpty());

    }
}
