package fr.ekinci.demojpa.model;

import javax.persistence.*;


@Entity
@Table(name = "seance")
public class SeanceEntity {

        @Id
        @GeneratedValue(generator = "sequence_seance")
        private Long id;
        private String langue;

        private String soustitre;

        private Integer prix;

    @ManyToMany(mappedBy = "seance")
    private AbonneEntity abonne;

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getSoustitre() {
        return soustitre;
    }

    public void setSoustitre(String soustitre) {
        this.soustitre = soustitre;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public AbonneEntity getAbonne() {
        return abonne;
    }

    public void setAbonne(AbonneEntity abonne) {
        this.abonne = abonne;
    }

}