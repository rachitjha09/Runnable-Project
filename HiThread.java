//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HiThread implements Runnable {
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
}
