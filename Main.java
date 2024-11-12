//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Runnable h1=new HelloThread();
        //Runnable h2 = new HiThread();
        Runnable h1=new Runnable(){
            @Override public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello!");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        System.out.println("Unknown thread error");
                    }
                }
            }
        };

        Runnable h2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi!");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        System.out.println("Unknown thread error");
                    }
                }
            }
        };


        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);


        t1.start();
        t2.start();


    }
}