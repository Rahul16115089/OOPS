package Oops.Thread;

public class MultithreadingDemo extends Thread{

    private Integer k;

    public MultithreadingDemo(Integer k){
        this.k = k;
    }

    public void run(){
        System.out.println("Stage 1 with key "+k);
        System.out.println("Stage 2 with key "+k);
        System.out.println("Stage 3 with key "+k);
    }
}
