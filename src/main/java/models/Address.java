package models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
@Embeddable

public class Address {
    private String street;
    private int number;
    private String city;
    private String state;
    private String postalCode;
    private String neighborhood ;
    private String complement;
    @Embedded
    private Contatos contacts;
}
