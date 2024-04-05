package ru.danyabereg.consumer.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@RequiredArgsConstructor
@Builder
@Getter
public class EventDto {
    private final String name;
    private final String title;
    private final BigDecimal price;
    private final Integer quantity;
    private final Date date;
}
