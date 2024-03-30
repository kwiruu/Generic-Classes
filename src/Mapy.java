import java.util.ArrayList;

public class Mapy<x, y>{
    ArrayList <x> keys;
    ArrayList <y> valuey;

    public Mapy(){
        keys = new ArrayList<>();
        valuey = new ArrayList<>();
    }
    public void put(x key, y value){
        int i = keys.indexOf(key);
        if(i == -1){
            keys.add(key);
            valuey.add(value);
        }
        else{
            valuey.set(i,value);
        }
    }
    public y get(x key){
        if(keys.contains(key)==true){
            return valuey.get(keys.indexOf(key));
        }
        else {
            return null;
        }
    }
    public y remove(x key){
        int i = keys.indexOf(key);
        if(i != -1){
            keys.remove(i);
            return valuey.remove(i);
        }
        else{
            return null;
        }
    }
}