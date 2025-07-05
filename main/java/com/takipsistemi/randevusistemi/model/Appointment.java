package com.takipsistemi.randevusistemi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User hasta;

    @ManyToOne
    private User doktor;

    private LocalDateTime tarih;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status = AppointmentStatus.BEKLEMEDE;

    private String doktorNotu;

    // === GETTER & SETTER ===

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getHasta() {
        return hasta;
    }

    public void setHasta(User hasta) {
        this.hasta = hasta;
    }

    public User getDoktor() {
        return doktor;
    }

    public void setDoktor(User doktor) {
        this.doktor = doktor;
    }

    public LocalDateTime getTarih() {
        return tarih;
    }

    public void setTarih(LocalDateTime tarih) {
        this.tarih = tarih;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public String getDoktorNotu() {
        return doktorNotu;
    }

    public void setDoktorNotu(String doktorNotu) {
        this.doktorNotu = doktorNotu;
    }
}
