package br.com.agilles.portalbid.controller;

import br.com.agilles.portalbid.dao.LojistaDAO;
import br.com.agilles.portalbid.models.Endereco;
import br.com.agilles.portalbid.models.Lojista;
import br.com.agilles.portalbid.models.Usuario;

import javax.faces.bean.ManagedBean;

/**
 * Created by Jilles Ragonha on 03/05/2016.
 */
@ManagedBean
public class LojistaMB {

    private Lojista lojista = new Lojista();
    private Endereco endereco = new Endereco();
    private Usuario usuario = new Usuario();
    private LojistaDAO dao = new LojistaDAO();

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Lojista getLojista() {
        return lojista;
    }

    public void setLojista(Lojista lojista) {
        this.lojista = lojista;
    }

    public LojistaDAO getDao() {
        return dao;
    }

    public void setDao(LojistaDAO dao) {
        this.dao = dao;
    }

    public String cadastrar() {
        lojista.setUsuario(usuario);
        lojista.setEndereco(endereco);
        dao.salvar(lojista);
        return "Login";
    }


}
