package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinema")
public class CinemaEntity {
        @Id
        @GeneratedValue(generator = "sequence_cinema")
        private Long id;

        private String nom;

        @OneToMany(mappedBy = "cinema")
        private List<SalleEntity> salle;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<SalleEntity> getSalle() {
        return salle;
    }

    public void setSalle(List<SalleEntity> salle) {
        this.salle = salle;
    }


}
