public class Cat extends Pet{
    private String name;
    public Cat(String name){
        super(name);
    }
    @Override
    public String getName()
    {
        return name;
    }
    public String speak()
    {
       return "meow";
    }
}
