package fr.ekinci.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "salle")
public class SalleEntity {

        @Id
        @GeneratedValue(generator = "sequence_salle")
        private Long id;

        private Integer nbsiege;

    @ManyToMany(mappedBy = "salle")
    private FilmEntity film;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNbsiege() {
        return nbsiege;
    }

    public FilmEntity getFilm() {
        return film;
    }

    public void setFilm(FilmEntity film) {
        this.film = film;
    }

    public void setNbsiege(Integer nbsiege) {
        this.nbsiege = nbsiege;
    }

}



