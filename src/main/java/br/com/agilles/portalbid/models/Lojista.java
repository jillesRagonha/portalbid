package br.com.agilles.portalbid.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Jilles Ragonha on 03/05/2016.
 */
@Entity
public class Lojista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeLojista;
    private String documento;
    private String telefoneComercial;
    private String celular;
    private String nomeResposavel;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco = new Endereco();
    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario = new Usuario();

    public String getNomeResposavel() {
        return nomeResposavel;
    }

    public void setNomeResposavel(String nomeResposavel) {
        this.nomeResposavel = nomeResposavel;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNomeLojista() {
        return nomeLojista;
    }

    public void setNomeLojista(String nomeLojista) {
        this.nomeLojista = nomeLojista;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
