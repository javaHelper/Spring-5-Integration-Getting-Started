package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Integer> {
}
