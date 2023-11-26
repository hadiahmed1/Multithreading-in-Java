package ExtendingThreadClass;
class Main{
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        MyThread2 t2= new MyThread2();
        t1.start();
        t2.start();
    }
}