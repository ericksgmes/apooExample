package org.example.observer;

import static org.example.observer.Event.NEW_ITEM;
import static org.example.observer.Event.SALE;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }

}
