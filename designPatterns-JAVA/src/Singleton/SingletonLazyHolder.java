package Singleton;

public class SingletonLazyHolder {
    private  static  class instanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return instanceHolder.instancia;
    }
}
