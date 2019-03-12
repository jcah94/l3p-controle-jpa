package fr.ekinci.demojpa.repository;

import fr.ekinci.demojpa.model.FilmEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("springData")
public interface FilmRepository extends CrudRepository<FilmEntity, Long> {
}
