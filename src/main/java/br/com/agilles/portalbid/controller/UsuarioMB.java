package br.com.agilles.portalbid.controller;

import br.com.agilles.portalbid.dao.UsuarioDao;
import br.com.agilles.portalbid.models.Usuario;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Jilles Ragonha on 02/05/2016.
 */
@Named
@RequestScoped
public class UsuarioMB implements Serializable {

    @Inject
    Usuario usuario;
    @Inject
    UsuarioDao dao;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDao getDao() {
        return dao;
    }

    public void setDao(UsuarioDao dao) {
        this.dao = dao;
    }

    public boolean logar() {
        return dao.login(usuario);
    }

    public boolean salvar() {
        return dao.salvar(usuario);
    }
}
