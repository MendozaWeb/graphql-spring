package com.mendo.graphql.application.dto;

import com.mendo.graphql.domain.model.AppointmentStatus;

import java.time.OffsetDateTime;
import java.util.List;

public record AppointmentDto(
        Long id,
        String title,
        String description,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        String attendeeEmail,
        String location,
        AppointmentStatus status,
        List<ReminderDto> reminders
) { }
