package ThreadConstructor;


class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<=10;i++ ){
            System.out.println("I'm a Thread");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t=new MyThread("Hadi");
        t.start();
        System.out.println("Thread ID: "+t.getId());
        System.out.println("Thread Name: "+t.getName());
    }
}
