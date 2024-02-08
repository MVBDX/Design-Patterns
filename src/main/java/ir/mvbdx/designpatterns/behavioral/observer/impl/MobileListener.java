package ir.mvbdx.designpatterns.behavioral.observer.impl;

public class MobileListener implements EventListener {
    private final String number;

    public MobileListener(String number) {
        this.number = number;
    }

    @Override
    public void update(EventType eventType) {
        System.out.printf("Sending %s notification for %s%n", eventType, number);
    }
}
