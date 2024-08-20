package models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contatos {
    private String telefone;
    private String email;
}
