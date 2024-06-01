package com.springJpa.springJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "student_table",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_email",
                columnNames = "email_address"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_sequence"
    )
    private Long studentId;
    @Column(
            name = "email_address",
            nullable = false
    )
    private String email;
    private String firstName;
    private String lastName;

//    private String guardianName;
//    private String guardianMobile;
//    private String guardianEmail;

    @Embedded
    private Guardian guardian;

}
