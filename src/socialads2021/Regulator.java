package socialads2021;

public class Regulator implements Observer {
    //set initial instance to null to ensure only one instance is created
    private static Regulator instance = null;
    //constructor
    private Regulator(){}

    public static Regulator getInstance() {
        //if null, create new instance
        //if already have instance, return that instance
        if (instance != null) {
            instance = new Regulator();
        }
        return instance;
    }
    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
