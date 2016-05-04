package br.com.agilles.portalbid.dao;

import br.com.agilles.portalbid.models.Endereco;
import br.com.agilles.portalbid.models.Lojista;
import br.com.agilles.portalbid.models.Usuario;
import br.com.agilles.portalbid.utils.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Jilles Ragonha on 03/05/2016.
 */
public class LojistaDAO extends AbstractDAO<Lojista> {

    public boolean salvar(Lojista objeto) {
        boolean salvo = false;
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(objeto);
        manager.getTransaction().commit();
        manager.close();
        return salvo;
    }



    public boolean remover(Lojista objeto) {
        return false;
    }

    public boolean desativar(Lojista objeto) {
        return false;
    }

    public boolean atualizar(Lojista objeto) {
        return false;
    }

    public List<Lojista> listarTodos() {
        return null;
    }
}
