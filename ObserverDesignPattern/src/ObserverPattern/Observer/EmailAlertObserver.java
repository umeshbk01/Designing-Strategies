package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMail(emailId, "Product got re-stocked");
    }

    public void sendMail(String mailId, String msg){
        System.out.println("mail snt to "+ mailId + " with msg: "+ msg);
    }
}