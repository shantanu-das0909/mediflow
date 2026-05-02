package com.hms.appointment.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "patients")
public class Patient extends BaseEntity {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID patientId;

    private String name;
    private Integer age;
    private String gender;
    private String phone;
    private String address;
    private String bloodGroup;

}