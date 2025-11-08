package com.mendo.graphql.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public record AppointmentInput (@NotBlank String title,
                                String description,
                                @NotNull @Future OffsetDateTime startAt,
                                @NotNull @Future OffsetDateTime ensAt,
                                @NotNull @Email String attendeeEamil,
                                String location) { }
