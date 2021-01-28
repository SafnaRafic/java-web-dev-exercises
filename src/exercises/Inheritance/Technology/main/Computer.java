package exercises.Inheritance.Technology.main;

public class Computer extends AbstractEntity {
    //  add 3 properties, 2 methods, and a constructor

    // Variables
    private int screenWidth;
    private int screenHeight;
    private String manufacturerYear;

    // Constructors
    public Computer(int screenWidth, int screenHeight, String manufacturerYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufacturerYear = manufacturerYear;
    }

    //Methods

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public String getManufacturerYear() {
        return manufacturerYear;
    }

    public  int processTWoTwo(){
        return 2+2;
    }
    public void tellMeAJoke() {
        System.out.println("Why did the computer show up at work late? It had a hard drive!");
    }
}
