package com.transience.kharch.domain;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by sanju on 9/08/2016.
 */
@Entity
public class User {

    @Id
    @GenericGenerator(name= "employeegen" , strategy="increment" )
    @GeneratedValue(generator= "employeegen")
    @Column(name= "EmployeeId")
    private Long id;

    @NotNull
    @Pattern(regexp = "^[A-Za-zs-]+$", message = "First name must contain letters, spaces or dashes")
    private String firstName;

    @Pattern(regexp = "^[A-Za-zs-]*$", message = "Surname must contain letters, spaces or dashes")
    private String lastName;

}
