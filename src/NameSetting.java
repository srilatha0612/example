public class NameSetting extends Thread {
}
class Thrread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("its thread");
        System.out.println(Thread.currentThread().getName());
        Thread t=new Thread();
        System.out.println(Thread.currentThread().getName());

    }
}
