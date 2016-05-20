package br.com.agilles.portalbid.dao;

import br.com.agilles.portalbid.models.Usuario;
import br.com.agilles.portalbid.utils.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Jilles Ragonha on 02/05/2016.
 */
public class UsuarioDao extends AbstractDAO<Usuario> {


    EntityManager entityManager = new JPAUtil().getEntityManager();

    public boolean salvar(Usuario objeto) {
        boolean salvo = false;
        entityManager.getTransaction().begin();
        entityManager.persist(objeto);
        entityManager.getTransaction().commit();
        entityManager.close();

        return salvo;

    }

    public boolean remover(Usuario objeto) {
        return false;
    }

    public boolean desativar(Usuario objeto) {
        return false;
    }

    public boolean atualizar(Usuario objeto) {
        return false;
    }

    public List<Usuario> listarTodos() {
        return null;
    }

    public boolean login(Usuario u) {
        boolean sucesso = false;

        Query query = entityManager.createQuery("SELECT u from Usuario u where u.login = :pLogin and u.senha = :pSenha ");
        query.setParameter("pLogin", u.getLogin());
        query.setParameter("pSenha", u.getSenha());

        sucesso = !query.getResultList().isEmpty();

        return sucesso;
    }


}
