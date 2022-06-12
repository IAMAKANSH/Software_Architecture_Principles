package observerpatterncontroller;

import observerpatterncontroller.interfaces.Observer;
import observerpatterncontroller.model.EmailTopic;
import observerpatterncontroller.model.EmailTopicSubscriber;

public class Driver {

    public static void main(String[] args) {

        EmailTopic topic=new EmailTopic();

        //create Observer
        Observer firstObserver=new EmailTopicSubscriber("First Observer");

        Observer secondObserver=new EmailTopicSubscriber("Second Observer");

        Observer thirdObserver=new EmailTopicSubscriber("Third Observer");

        Observer fourthObserver=new EmailTopicSubscriber("Fourth Observer");

        //register

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);
        topic.register(fourthObserver);

        //Attaching Observer to Subject

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);
        fourthObserver.setSubject(topic);

        //check for update

        firstObserver.update();


        //provider/subject/broadcaster
         topic.postMessage("Hello Subscriber!");

    }
}
