package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(schema = "public", name = "film")
public class FilmEntity {
	/**
	 * Reference of the film
	 * GeneratedValue by sequence in database
	 */
	@Id
	@GeneratedValue(generator = "sequence_film")
	private Long id;

	private String realisateur;

	private String acteurs;

	private String categorie;

	private Date date_sortie;

	private Integer duree;

	private String classification_pegi;

	/**
	 * SELECT * FROM
	 * film
	 * INNER JOIN salle
	 * ON film.fk_id_salle = salle.id
	 */
	@OneToMany
	@JoinColumn(
		name = "fk_id_salle",
		referencedColumnName = "id"
	)
	private SalleEntity salle;

	@OneToMany(mappedBy = "film")
	private SeanceEntity seance;

	public SeanceEntity getSeance() {
		return seance;
	}

	public void setSeance(SeanceEntity seance) {
		this.seance = seance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public String getActeurs() {
		return acteurs;
	}

	public void setActeurs(String acteurs) {
		this.acteurs = acteurs;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Date getDate_sortie() {
		return date_sortie;
	}

	public void setDate_sortie(Date date_sortie) {
		this.date_sortie = date_sortie;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public String getClassification_pegi() {
		return classification_pegi;
	}

	public void setClassification_pegi(String classification_pegi) {
		this.classification_pegi = classification_pegi;
	}

	public SalleEntity getSalle() {
		return salle;
	}

	public void setSalle(SalleEntity salle) {
		this.salle = salle;
	}


}
