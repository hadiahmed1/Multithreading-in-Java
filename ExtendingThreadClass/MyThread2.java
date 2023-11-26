package ExtendingThreadClass;
class MyThread2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("My Thread 2 is Running");
        }
    }
}
