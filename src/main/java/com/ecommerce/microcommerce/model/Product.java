package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import java.io.Serializable;

//@JsonFilter("monFiltreDynamique")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {

    //@GeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Length(min=3, max=20, message = "Nom trop long ou trop court.")
    private String nom;

    //@Min(value = 1)
    private int prix;

    //information que nous ne souhaitons pas exposer
    private int prixAchat;

}
