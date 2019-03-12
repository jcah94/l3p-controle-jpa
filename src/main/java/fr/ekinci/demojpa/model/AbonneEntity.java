package fr.ekinci.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "abonne")
public class AbonneEntity {

    @Id
        @GeneratedValue(generator = "sequence_abonne")
        private Long id;

        private String reservation;

        @OneToMany(mappedBy = "abonne")
        private SeanceEntity seance;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getReservation() {
            return reservation;
        }

        public void setReservation(String reservation) {
            this.reservation = reservation;
        }

    public SeanceEntity getSeance() {
        return seance;
    }

    public void setSeance(SeanceEntity seance) {
        this.seance = seance;
    }
}

