import java.util.Map;
import java.util.TreeMap;

public class Bank {
    private Map<String,Konto> kontoMap = new TreeMap<>();

    public boolean opret(Konto konto){

        if (!kontoMap.containsKey(konto.getNavn())) {
            kontoMap.put(konto.getNavn(), konto);
            return true;
        }
        return false;
    }

}
