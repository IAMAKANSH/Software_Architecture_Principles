package observerpractice.interfaces;

public interface Provider {

    public  void register(Listener listener);
    public  void unregister(Listener listener);
    public  void notifier();
    public Object getUpdate(Listener listener);
}
