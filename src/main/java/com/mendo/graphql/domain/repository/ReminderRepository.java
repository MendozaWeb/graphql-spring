package com.mendo.graphql.domain.repository;

import com.mendo.graphql.domain.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
