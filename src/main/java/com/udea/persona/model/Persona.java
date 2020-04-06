/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.persona.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author Lenovo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(description = "All details about the PErson. ")
@Entity
public class Persona implements Serializable {
    @ApiModelProperty(notes = "The database generated person ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idperson")
    private Long idPerson;
    
    @ApiModelProperty(notes = "The first name")
    @Column(name="firstname", nullable=false, length=80)
    private @NonNull String firstName;
    
    @ApiModelProperty(notes = "The last name")
     @Column(name="lastname", nullable=false, length=80)
    private @NonNull String lastName;
    
     @ApiModelProperty(notes = "The personal email ")
     @Column(name="email", nullable=false, length=80)
     private @NonNull String email; 
     
     
}
