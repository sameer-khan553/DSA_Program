package interfaces;

public class Main implements B, A {
    @Override
    public void show() {
        System.out.println("this is show method from A interface");
    }

    @Override
    public void run() {
        System.out.println("this is run method from B interface");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
        m.show();
    }
}
