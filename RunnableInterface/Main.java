package RunnableInterface;

class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        while(true){
        System.out.println("Thread        1");
        }
    }
}class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        while(true){
        System.out.println("Thread 2");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThreadRunnable bullet1=new MyThreadRunnable();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
