public class GetSet extends Thread {
}
    class ThreadDemo4{
        public static void main(String[] args) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("aaaa");
            System.out.println(Thread.currentThread().getName());
            GetSet g=new GetSet();
            System.out.println(Thread.currentThread().getName());


        }

    }

