package br.com.agilles.portalbid.controller;

import br.com.agilles.portalbid.dao.UsuarioDao;
import br.com.agilles.portalbid.models.Usuario;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Jilles Ragonha on 16/05/2016.
 */
@Named
@RequestScoped
public class LoginMB {

    private UsuarioLogadoMB usuarioLogadoMB;

    private UsuarioDao dao;

    private Usuario usuario;

    public String efetuarLogin(){
        boolean usuarioExiste = dao.login(usuario);
        if(usuarioExiste){
            usuarioLogadoMB.logar(usuario);
            return "home?faces-redirect=true";
        }else{
            usuarioLogadoMB.deslogar();
            usuario = new Usuario();
            return "Login";
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
