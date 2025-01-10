package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;
    
    public MobileAlertObserver(String userName, StocksObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update(){
        sendMobileNotification(userName, "Product got re-stocked");
    }

    public void sendMobileNotification(String userName, String msg){
        System.out.println("mobile notification snt to "+ userName + " with msg: "+ msg);
    }
}