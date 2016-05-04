package br.com.agilles.portalbid.controller;

import br.com.agilles.portalbid.dao.LojistaDAO;
import br.com.agilles.portalbid.models.Lojista;

import javax.faces.bean.ManagedBean;

/**
 * Created by Jilles Ragonha on 03/05/2016.
 */
@ManagedBean
public class LojistaMB {

    private Lojista lojista = new Lojista();
    private LojistaDAO dao = new LojistaDAO();


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

    public boolean cadastrar() {

        return dao.salvar(lojista);

    }


}
