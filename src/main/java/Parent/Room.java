package Parent;

public abstract class Room {
    private String name;

    public Room(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
    this.name = name;}
}
