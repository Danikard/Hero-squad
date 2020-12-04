package heroes;
import java.util.ArrayList;


public class Squad {
    private String squadName;
    private String squadCause;
    private Integer id;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();
    private ArrayList<Hero> sHeroes;

    public Squad(String name,String cause){

        squadName = name;
        squadCause = cause;
        instances.add(this);
        id = instances.size();
    }
    public String getName (){
        return squadName;
    }
    public String getCause(){
        return squadCause;
    }
    public static Squad findById(int Id){
        return instances.get (Id-1);
    }
    public static ArrayList<Squad> all() {
        return instances;
    }

}
