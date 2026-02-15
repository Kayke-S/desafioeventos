package com.kaykesilva.desafioeventos.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_time_slot")
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startDate;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endDate;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public TimeSlot() {
    }

    public TimeSlot(Integer id, Instant startDate, Instant endDate, Activity activity) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getstartDate() {
        return startDate;
    }

    public void setstartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getendDate() {
        return endDate;
    }

    public void setendDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
