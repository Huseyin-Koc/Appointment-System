package com.takipsistemi.randevusistemi.controller;

import com.takipsistemi.randevusistemi.model.Appointment;
import com.takipsistemi.randevusistemi.model.AppointmentStatus;
import com.takipsistemi.randevusistemi.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // Randevu oluşturma
    @PostMapping("/create")
    public Appointment createAppointment(@RequestParam Long hastaId,
                                         @RequestParam Long doktorId,
                                         @RequestParam String tarih) {
        // tarih: "2025-05-12T15:30"
        LocalDateTime datetime = LocalDateTime.parse(tarih);
        return appointmentService.createAppointment(hastaId, doktorId, datetime);
    }

    // Hastanın tüm randevularını getir
    @GetMapping("/hasta/{id}")
    public List<Appointment> getHastaAppointments(@PathVariable Long id) {
        return appointmentService.getAppointmentsForHasta(id);
    }

    // Doktorun tüm randevularını getir
    @GetMapping("/doktor/{id}")
    public List<Appointment> getDoktorAppointments(@PathVariable Long id) {
        return appointmentService.getAppointmentsForDoktor(id);
    }

    // Randevunun durumunu güncelle (ONAYLANDI / REDDEDILDI), not ekleyebilir
    @PutMapping("/{id}/status")
    public Appointment updateAppointmentStatus(@PathVariable Long id,
                                               @RequestParam AppointmentStatus status,
                                               @RequestParam(required = false) String not) {
        return appointmentService.updateStatus(id, status, not);
    }
}
