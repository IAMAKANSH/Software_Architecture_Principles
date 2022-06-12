package observerpatterncontroller.model;

import observerpatterncontroller.interfaces.Observer;
import observerpatterncontroller.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String message;

    private Subject topic;

    public EmailTopicSubscriber(String message) {
        this.message = message;
    }

    @Override
    public void update() {
        String msg= (String) topic.getUpdate(this);

        if(msg==null)
            System.out.println(message+" No new message of this topic");
        else
            System.out.println(message+ " Retrieving message "+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic=subject;
    }
}
