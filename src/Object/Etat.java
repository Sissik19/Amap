package Object;

public class Etat {
    private String etat;
    private int id;

    public Etat(){}
    public Etat(int id, String etat){
        this.etat = etat;
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
