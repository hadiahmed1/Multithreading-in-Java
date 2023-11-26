package ThreadMethod;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread  "+i);
            try {
            Thread.sleep(50);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("TTTTTTT2222222222  "+i);
            try {
                Thread.sleep(50);
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();
    }
}
