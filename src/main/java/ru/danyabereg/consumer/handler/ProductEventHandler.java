package ru.danyabereg.consumer.handler;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.danyabereg.ProductEvent;
import ru.danyabereg.consumer.service.EventService;

@Component
@KafkaListener(topics = "product-events-topic")
@RequiredArgsConstructor
public class ProductEventHandler {
    private final EventService eventService;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handle(ProductEvent productEvent) {
        LOGGER.info("Received event: {}", productEvent.getName());
        LOGGER.info("Title: {}, Price: {}, Quantity: {}",
                productEvent.getTitle(),
                productEvent.getPrice(),
                productEvent.getQuantity());
        LOGGER.info("At: {}", productEvent.getDate());
        eventService.save(productEvent);
        LOGGER.info("Event saved in database");
    }
}
