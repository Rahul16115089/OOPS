package Oops.Thread;

public class ThreadJoinDemoA implements Runnable{
    private Integer count;

    public ThreadJoinDemoA(Integer count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<count;i++){
            System.out.println("ThreadJoinDemoA count " + i);
        }
    }
}
