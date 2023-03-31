import java.util.ArrayList;
public class Kennel {
    private ArrayList petList;
    public Kennel(){
        petList = new ArrayList();
    }
    public void addPetToList(Pet pet){
        petList.add(pet);
    }

    public void allSpeak(){
        for(Object p: petList){
            Pet x =(Pet)p;
            System.out.println(x.getName()+ " " + x.speak());
        }
    }
}
