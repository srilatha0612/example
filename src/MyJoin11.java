public class MyJoin11 extends Thread {
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("seetha thread");
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){

            }
        }
    }
}
class ThreadJoin{
    public static void main(String[] args) {
        MyJoin11 m=new MyJoin11();
        m.start();
        //m.join();
        for (int i=0;i<=5;i++){
            System.out.println("rama thread");
        }
    }
}