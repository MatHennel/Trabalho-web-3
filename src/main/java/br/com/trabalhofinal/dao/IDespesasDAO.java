package br.com.trabalhofinal.dao;

import br.com.trabalhofinal.model.Categoria;
import br.com.trabalhofinal.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesasDAO {

    Despesa salvar(Despesa despesa);

    Despesa atualizar(Despesa despesa);

    void delete(Long id);

    List<Despesa> findAll();

    Optional<Despesa> findBId(Long id);

    List<Despesa> findByCategoria(Categoria categoria);
}
