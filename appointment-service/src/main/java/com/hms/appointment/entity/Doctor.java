package com.hms.appointment.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "doctors")
public class Doctor extends BaseEntity {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID doctorId;

    private String name;
    private String specialization;
    private String experience;
    private String phone;
    private String status;

}
