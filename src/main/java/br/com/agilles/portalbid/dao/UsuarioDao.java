package br.com.agilles.portalbid.dao;

import br.com.agilles.portalbid.models.Usuario;
import br.com.agilles.portalbid.utils.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Created by Jilles Ragonha on 02/05/2016.
 */
public class UsuarioDao {

    public boolean login(Usuario u){
        boolean sucesso = false;
        adiciona(u);

        EntityManager entityManager = new JPAUtil().getEntityManager();
        Query query = entityManager.createQuery("SELECT u from Usuario u where u.login = :pLogin and u.senha = :pSenha ");
        query.setParameter("pLogin", u.getLogin());
        query.setParameter("pSenha", u.getSenha());

        sucesso = !query.getResultList().isEmpty();

        return sucesso;
    }
    public  void adiciona(Usuario usuario){
        usuario.setLogin("Jilles");
        usuario.setSenha("Ragonha");
        EntityManager entityManager = new JPAUtil().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
