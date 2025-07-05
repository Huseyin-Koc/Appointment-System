package com.takipsistemi.randevusistemi.service;

import com.takipsistemi.randevusistemi.model.*;
import com.takipsistemi.randevusistemi.repository.AppointmentRepository;
import com.takipsistemi.randevusistemi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private UserRepository userRepository;

    public Appointment createAppointment(Long hastaId, Long doktorId, LocalDateTime tarih) {
        User hasta = userRepository.findById(hastaId).orElseThrow();
        User doktor = userRepository.findById(doktorId).orElseThrow();

        boolean conflict = appointmentRepository.existsByTarihAndDoktor(tarih, doktor);
        if (conflict) {
            throw new RuntimeException("Aynı saatte başka bir randevu var!");
        }

        Appointment appointment = new Appointment();
        appointment.setHasta(hasta);
        appointment.setDoktor(doktor);
        appointment.setTarih(tarih);
        appointment.setStatus(AppointmentStatus.BEKLEMEDE);

        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsForDoktor(Long doktorId) {
        return appointmentRepository.findByDoktorId(doktorId);
    }

    public List<Appointment> getAppointmentsForHasta(Long hastaId) {
        return appointmentRepository.findByHastaId(hastaId);
    }

    public Appointment updateStatus(Long appointmentId, AppointmentStatus status, String not) {
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        appointment.setStatus(status);
        if (not != null) {
            appointment.setDoktorNotu(not);
        }
        return appointmentRepository.save(appointment);
    }
}
