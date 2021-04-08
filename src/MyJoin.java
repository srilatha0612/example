public class MyJoin extends Thread {
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
    static class De{
        public static void main(String[] args) {
            MyJoin m=new MyJoin();
            m.start();
            //m.join();
            for(int i=0;i<=5;i++){
                System.out.println("rama thread");
            }
        }
    }
}
