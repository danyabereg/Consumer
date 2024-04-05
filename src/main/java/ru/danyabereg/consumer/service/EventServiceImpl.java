package ru.danyabereg.consumer.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.danyabereg.ProductEvent;
import ru.danyabereg.consumer.model.entity.Event;
import ru.danyabereg.consumer.model.repository.EventRepository;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void save(ProductEvent productEvent) {
        eventRepository.save(buildEvent(productEvent));
    }

    private Event buildEvent(ProductEvent productEvent) {
        return Event.builder()
                .name(productEvent.getName())
                .title(productEvent.getTitle())
                .price(productEvent.getPrice())
                .quantity(productEvent.getQuantity())
                .eventDate(productEvent.getDate())
                .build();
    }
}
