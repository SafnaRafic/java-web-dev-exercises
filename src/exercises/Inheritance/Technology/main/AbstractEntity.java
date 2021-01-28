package exercises.Inheritance.Technology.main;

public abstract class AbstractEntity {
    private int id;
    //static does not belong to instances. It directly belongs to the class.Its always consistent on how class manages it
    private static int nextId=1;


    public AbstractEntity() {
        this.id = nextId;
        nextId ++;
    }
    //Methods
    public int getId(){
        return this.id;
    }
}
