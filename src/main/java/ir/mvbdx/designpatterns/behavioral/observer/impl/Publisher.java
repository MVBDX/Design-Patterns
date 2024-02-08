package ir.mvbdx.designpatterns.behavioral.observer.impl;

public class Publisher {

    private final NotificationService notificationService = new NotificationService();

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void newItemPromotion() {
        notificationService.update(EventType.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.update(EventType.SALE);
    }

    public void seasonalPromotion() {
        notificationService.update(EventType.SEASONAL);
    }
}
