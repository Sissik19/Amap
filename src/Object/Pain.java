package Object;

public class Pain {
    private String cereale, type;
    private int id;
    private float poid, prix;

    public Pain(){}

    public Pain(int id, String cereale, String type, float poid, float prix){
        this.id = id;
        this.cereale = cereale;
        this.type = type;
        this.poid = poid;
        this.prix = prix;
    }

    public String getCereale() {
        return cereale;
    }

    public void setCereale(String cereale) {
        this.cereale = cereale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPoid() {
        return poid;
    }

    public void setPoid(float poid) {
        this.poid = poid;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
