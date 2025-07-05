package com.takipsistemi.randevusistemi.repository;

import com.takipsistemi.randevusistemi.model.Appointment;
import com.takipsistemi.randevusistemi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoktorId(Long doktorId);
    List<Appointment> findByHastaId(Long hastaId);
    boolean existsByTarihAndDoktor(LocalDateTime tarih, User doktor);
}
