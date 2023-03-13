package Oops.Thread;

public class ThreadJoinDemoB implements Runnable{

    private Integer count;

    public ThreadJoinDemoB(Integer count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<count;i++){
            System.out.println("ThreadJoinDemoB count " + i);
        }
    }
}
