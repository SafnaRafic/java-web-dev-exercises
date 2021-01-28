package exercises.Inheritance.Technology.main;

public class SmartPhone extends Computer {
    //Variables
    private boolean isConnectedTo5G;

    //Constructor
    public SmartPhone(int screenWidth, int screenHeight, String manufacturerYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufacturerYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //Method
    public boolean getIsConnectedTo5G(){
        return this.isConnectedTo5G;
    }
    public void makePhoneCall(String number){
        System.out.println("Calling : "+number);
    }

}
