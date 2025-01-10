package ObserverPattern;

import ObserverPattern.Observable.IphoneObervableImpl;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;

public class Main{
    public static void main(String args[]){
        IphoneObervableImpl iphoneObervableImpl = new IphoneObervableImpl();
        EmailAlertObserver subscriber1 = new EmailAlertObserver("abc@gmail.com", iphoneObervableImpl);
        EmailAlertObserver subscriber2 = new EmailAlertObserver("def@gmail.com", iphoneObervableImpl);
        MobileAlertObserver subscriber3 = new MobileAlertObserver("test123", iphoneObervableImpl);

        iphoneObervableImpl.add(subscriber1);
        iphoneObervableImpl.add(subscriber2);
        iphoneObervableImpl.add(subscriber3);

        iphoneObervableImpl.setStockCount(10);
        iphoneObervableImpl.setStockCount(0);
        iphoneObervableImpl.setStockCount(1000);
    }
}