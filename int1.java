import java.util.ArrayList;
import java.util.HashSet;
public class int1{
    public static void main(String[] args){
       ArrayList <Integer> bus = new ArrayList <Integer>();
       bus.add(1);
         bus.add(2);
        bus.add(2);
        bus.add(3);
        bus.add(4);
        ArrayList < Integer> hi =new ArrayList <Integer>(new HashSet (bus));
        for (int num: hi){
            System.out.println(num);
        }
    }

}