package br.com.agilles.portalbid.models;

import javax.persistence.*;

/**
 * Created by Jilles Ragonha on 02/05/2016.
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login, senha;

    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    @ManyToOne
    private Lojista lojista;

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
