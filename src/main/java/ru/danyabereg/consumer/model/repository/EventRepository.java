package ru.danyabereg.consumer.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.danyabereg.consumer.model.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
