package ThreadPriorities;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I'm Thread"+this.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1("t1");
        MyThread1 t2=new MyThread1("Most IMP");
        MyThread1 t3=new MyThread1("t3");
        MyThread1 t4=new MyThread1("t4");
        MyThread1 t5=new MyThread1("t5");
        t1.start();
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        t4.start();
        t5.start();
    }
}
