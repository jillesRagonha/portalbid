package br.com.agilles.portalbid.dao;

import java.util.List;

/**
 * Created by Jilles Ragonha on 03/05/2016.
 */
public abstract class AbstractDAO<T> {

    public abstract boolean salvar(T objeto);

    public abstract boolean remover(T objeto);

    public abstract boolean desativar(T objeto);

    public abstract boolean atualizar(T objeto);

    public abstract List<T> listarTodos();
}
