package com.speaya.libraryjpa.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;


@Entity
@Table(name = "tbl_employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Employee {
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String gender;
    private  int department_id;
}
