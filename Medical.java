package entity;

import jakarta.persistence.*;

@Entity
public class Medical {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "tablets")
    private String tablets;
    @Column(name = "frequency")
    private int NoOfTablets;
    public int getNoOfTablets() {
        return NoOfTablets;
    }

    public void setNoOfTablets(int noOfTablets) {
        NoOfTablets = noOfTablets;
    }

    public String getTablets() {
        return tablets;
    }

    public void setTablets(String tablets) {
        this.tablets = tablets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medical(int id,String tablets,int NoOfTablets) {
        super();
        this.id=id;
        this.tablets=tablets;
        this.NoOfTablets=NoOfTablets;
    }
    public Medical(){
        super();
    }

    @Override
    public String toString() {
        return "Medical{" +
                "id=" + id +
                ", tablets='" + tablets + '\'' +
                ", NoOfTablets=" + NoOfTablets +
                '}';
    }
}
