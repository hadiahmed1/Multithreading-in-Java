package ExtendingThreadClass;
class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("My Thread is Running");
        }
    }
}