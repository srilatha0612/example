public class MyThread2 extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("first");
        }
    }
    static class MyDemo1{
        public static void main(String[] args) {
            MyThread2 tt=new MyThread2();
            tt.start();
            for (int i=0;i<=5;i++){
                System.out.println("second");
            }
        }
    }
}
