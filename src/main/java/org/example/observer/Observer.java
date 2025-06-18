package org.example.observer;

import static org.example.observer.Event.*;

public class Observer {
    /*
     * Video Reference: https://youtu.be/-oLDJ2dbadA
     */
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("geekific@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("GeekificLnS"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("geekific@like.com"));
        store.salePromotion();

    }

}
