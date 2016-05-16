package me.south10.blog.application.utility;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by south10 on 2016-05-16.
 */
@Slf4j
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDateTime date) {
        log.debug("date = {}", date);
        Instant instant = Instant.from(date.atZone(ZoneId.systemDefault()));
        return Date.from(instant);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Date value) {
        log.debug("value", value);
        Instant instant = value.toInstant();
        return LocalDateTime.from(instant.atZone(ZoneId.systemDefault()));
    }
}

