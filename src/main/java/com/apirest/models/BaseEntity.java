package com.apirest.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@MappedSuperclass
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @Getter
    @Setter
    private Long id;

    @Column(columnDefinition = "DATETIME", updatable = false, nullable = false)
    @Getter  @Setter
    protected Date createDate;

    @Column(columnDefinition = "DATETIME", updatable = false, nullable = false)
    @Getter  @Setter
    protected Date updateDate;


    @PrePersist
    protected void onCreate(){
        updateDate = new Date();
        if (createDate == null){
            createDate = new Date();
        }
    }

}
