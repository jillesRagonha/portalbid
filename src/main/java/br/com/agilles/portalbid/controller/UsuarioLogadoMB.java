package br.com.agilles.portalbid.controller;

import br.com.agilles.portalbid.models.Usuario;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Jilles Ragonha on 16/05/2016.
 */
@Named
@SessionScoped
public class UsuarioLogadoMB implements Serializable {
    private Usuario usuario;

    public void logar(Usuario usuario) {
        this.usuario = usuario;
    }

    public void deslogar() {
        this.usuario = null;
    }

    public boolean isLogado() {
        return usuario != null;
    }
}
