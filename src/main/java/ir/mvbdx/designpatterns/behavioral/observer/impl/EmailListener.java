package ir.mvbdx.designpatterns.behavioral.observer.impl;

public class EmailListener implements EventListener {
    private final String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType) {
        System.out.println("Sending " + eventType + " notification for " + email);
    }
}
