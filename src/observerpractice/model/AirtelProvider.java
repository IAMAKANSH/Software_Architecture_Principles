package observerpractice.model;

import observerpractice.interfaces.Listener;
import observerpractice.interfaces.Provider;

import java.util.ArrayList;
import java.util.List;

public class AirtelProvider implements Provider {
    List<Listener> listenerList;
    String upcomingShow;

    public AirtelProvider() {
        this.listenerList=new ArrayList<>();
    }

    @Override
    public void register(Listener listener) {

        if(listener==null)
            throw new NullPointerException("No Listener");
        if(!listenerList.contains(listener))
            listenerList.add(listener);
    }

    @Override
    public void unregister(Listener listener) {
        listenerList.remove(listener);
    }

    @Override
    public void notifier() {
        for (Listener listener:listenerList)
        {
            listener.update();
        }
    }

    @Override
    public Object getUpdate(Listener listener) {
        return this.upcomingShow;
    }

    public  void postShow(String show)
    {
        System.out.println("Notifier Upcoming Show: "+show);
        this.upcomingShow=show;
        notifier();
    }
}
