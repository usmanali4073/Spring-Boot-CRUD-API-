package com.speaya.libraryjpa.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_departments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Department {

    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Integer id;
    @Column
    public String name;
    @Column
    public String role;
    @Column
    @Range(min = 0, max = 40)
    public Integer hour;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "department_id")
    private List<Employee> employees = new ArrayList();

}
