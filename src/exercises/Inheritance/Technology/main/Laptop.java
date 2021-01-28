package exercises.Inheritance.Technology.main;

public class Laptop extends Computer {
    // variables
    private boolean isIntellijOpened;

    //constructor
    public Laptop(int screenWidth, int screenHeight, String manufacturerYear) {
        super(screenWidth, screenHeight, manufacturerYear);
        this.isIntellijOpened = false;
    }

    public Laptop(int screenWidth, int screenHeight, String manufacturerYear, boolean isIntellijOpened) {
        super(screenWidth, screenHeight, manufacturerYear);
        this.isIntellijOpened = isIntellijOpened;
    }

    //Method

    public boolean isIntellijOpened() {
        return isIntellijOpened;
    }
    public void setIntellijOpened(boolean isIntellijOpened){
        this.isIntellijOpened = isIntellijOpened;
    }
    public void openIntellij(){
        this.isIntellijOpened = true;
        System.out.println("Intellij is now opened");
    }
}
