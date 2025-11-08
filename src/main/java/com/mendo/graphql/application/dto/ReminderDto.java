package com.mendo.graphql.application.dto;

import com.mendo.graphql.domain.model.ReminderChannel;

import java.time.OffsetDateTime;

public record ReminderDto(
    Long id,
    OffsetDateTime remindAt,
    ReminderChannel channel
) { }
