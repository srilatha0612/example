public class SetGet extends Thread {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(3);
        System.out.println(Thread.currentThread().getPriority());
    }
}

