import java.util.Set;
import java.util.TreeSet;

public class Schedule  {
    Set<Seance> seances = new TreeSet<>();


    public Set<Seance> getSeances() {
        return seances;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }

    void addSeance(){
        Seance seance = Methods.getSeance();
        seances.add(seance);
    }

    void removeSeance(){
        Seance seance = Methods.getSeance();
        if (seances.contains(seance)){
            seances.remove(seance);
            System.out.println("Seance has just successfully  deleted");
        }
        else System.out.println("Can`t find this seance. Sorry");
    }
}
