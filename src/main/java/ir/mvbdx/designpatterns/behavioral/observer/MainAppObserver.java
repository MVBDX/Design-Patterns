package ir.mvbdx.designpatterns.behavioral.observer;

import ir.mvbdx.designpatterns.behavioral.observer.impl.EmailListener;
import ir.mvbdx.designpatterns.behavioral.observer.impl.EventType;
import ir.mvbdx.designpatterns.behavioral.observer.impl.MobileListener;
import ir.mvbdx.designpatterns.behavioral.observer.impl.Publisher;

public class MainAppObserver {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.getNotificationService().subscribe(EventType.NEW_ITEM, new MobileListener("+98936123456"));
        EmailListener faalianEmailListener = new EmailListener("faalian.m@gmail.com");
        publisher.getNotificationService().subscribe(EventType.NEW_ITEM, faalianEmailListener);
        publisher.getNotificationService().subscribe(EventType.SEASONAL, faalianEmailListener);

        publisher.newItemPromotion();
        System.out.println("==========================================");
        publisher.seasonalPromotion();
        System.out.println("==========================================");

        publisher.getNotificationService().unsubscribe(EventType.NEW_ITEM, faalianEmailListener);

        publisher.newItemPromotion();

    }
}
