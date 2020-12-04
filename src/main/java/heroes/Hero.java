package heroes;
import java.util.ArrayList;


public class Hero {
    private String heroName;
    private String heroStrength;
    private String heroWeakness;
    private Integer id;
    private static ArrayList<Hero>instances = new ArrayList<>();
    public Hero(String name, String strength, String weakness){
        this.heroName = name;
        this.heroStrength = strength;
        this.heroWeakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }
    public String getHeroName() {
        return heroName;
    }
    public String getHeroWeakness(){
        return heroWeakness;
    }
    public String getHeroStrength(){
        return heroStrength;
    }
    public int getId(){
        return id;
    }
    public static Hero findById(int id){
        return instances.get(id-1);
    }
    public static ArrayList<Hero> all() {
        return instances;
    }
    public static void clear(){
        instances.clear();
    }

}
