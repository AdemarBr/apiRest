package com.apirest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "user")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{


    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Role_id")
    @Getter  @Setter
    private Role role;

    @JsonIgnore
    @Column(name = "password")
    @Getter  @Setter
    private  String password;

    @Column(name ="nombre")
    @Getter  @Setter
    private String nombre;

    @Column(name ="apellido")
    @Getter  @Setter
    private String apellido;

    @Column(name ="email")
    @Getter  @Setter
    private String email;

    @Column(name ="telefono")
    @Getter  @Setter
    private String telefono;

    @Column( columnDefinition = "DATE", name ="fechaNac")
    @Getter  @Setter
    private Date fechaNac;


}

