package practice;

import java.util.List;
import java.util.Vector;

public class MultiThread {
    private int a = 0;
    private int b = 0;
    private List<Holder> holders = new Vector<>();

    void update(){
        Holder holder = new Holder();
        holder.a = a++;
        try{
            Thread t = new Thread();
            t.sleep(10);
        } catch(Exception e){
            //Nothing to do
        }
        holder.b = b++;
    }

    public class Holder{
        int a;
        int b;
    }

    void run(){
        List<Thread> threads;
        for(int i = 0; i < 100; i++){
            try {
                Thread t = new Thread();
                t.sleep(10);
                update();
            } catch (Exception e){

            }
        }
    }


    public static void main(String[] args) {
        new MultiThread().run();
    }

}
