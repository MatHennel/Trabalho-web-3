package br.com.trabalhofinal.acoes;

import br.com.trabalhofinal.dao.DespesaDAO;
import br.com.trabalhofinal.infra.ConnectionFactory;
import br.com.trabalhofinal.model.Despesa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

public class ListaDespesas implements Acao{
    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection connection = ConnectionFactory.getConnection();
        DespesaDAO dao = new DespesaDAO(connection);
        List<Despesa> despesas = dao.findAll();

        request.setAttribute("despesas",despesas);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/lista-despesas.jsp");
        dispatcher.forward(request, response);
    }
}
