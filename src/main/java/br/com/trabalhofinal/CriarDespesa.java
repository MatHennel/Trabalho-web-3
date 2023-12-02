package br.com.trabalhofinal;

import br.com.trabalhofinal.dao.DespesaDAO;
import br.com.trabalhofinal.infra.ConnectionFactory;
import br.com.trabalhofinal.model.Categoria;
import br.com.trabalhofinal.model.Despesa;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class CriarDespesa {
    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        Despesa despesa =
                new Despesa(
                        "Compra no supermercado",
                        LocalDate.of(2021, 5, 10),
                        95.0,
                        Categoria.ALIMENTACAO);

        DespesaDAO dao = new DespesaDAO(connection);
        dao.salvar(despesa);

        connection.close();
    }
}
