package ir.mvbdx.designpatterns.singleton;

public class Mouse {
    private static Mouse mouse = null; // lazy
    private static final Mouse mouseEager = new Mouse(); // eager instantiate
    private static volatile Mouse mouseThreadSafe; // thread-safe singleton

    private Mouse() {
        System.out.println("Hello from singleton!");
    }

    public static Mouse getInstance() {
        if (mouse == null)
            mouse = new Mouse();
        return mouse;
    }

    public static Mouse getInstanceEager() {
        return mouseEager;
    }

    public static Mouse getInstanceThreadSafe() {
        if (mouseThreadSafe == null)
            synchronized (Mouse.class) {
                mouseThreadSafe = new Mouse();
            }
        return mouseThreadSafe;
    }
}
