package com.mendo.graphql.application.dto;

import com.mendo.graphql.domain.model.ReminderChannel;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public record ReminderInput (
        @NotNull @Future OffsetDateTime remindAt,
        @NotNull ReminderChannel channel
        ) {}
