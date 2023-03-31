public class LoudDog extends Dog{
    private String name;
    public LoudDog(String name){
        super(name);
    }
    @Override
    public String getName()
    {
        return name;
    }
    public String speak()
    {
        return super.speak() + " " + super.speak();
    }
}
