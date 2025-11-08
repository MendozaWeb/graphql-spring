package com.mendo.graphql.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reminders")
public class Reminder {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @ManyToOne(optional = false, fetch = FetchType.LAZY)
     private Appointment appointment;

     @Column(nullable = false)
     private OffsetDateTime remindAt;

     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private ReminderChannel channel;
}
