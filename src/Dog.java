public class Dog extends Pet{
    private String name;
    public Dog(String name){
        super(name);
    }
    @Override
    public String getName()
    {
        return name;
    }
    public String speak()
    {
        return "woof";
    }
}
