package br.com.trabalhofinal;

import br.com.trabalhofinal.dao.DespesaDAO;
import br.com.trabalhofinal.infra.ConnectionFactory;
import br.com.trabalhofinal.model.Categoria;
import br.com.trabalhofinal.model.Despesa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/adicionaDespesa")
public class AdicionaDespesaServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descricaoStr = request.getParameter("descricao");
        String dataStr = request.getParameter("data");
        String valorStr = request.getParameter("valor");
        String categoriaStr = request.getParameter("categoria");

        // Ajuste para o formato de data correto (yyyy-MM-dd)
        LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ISO_LOCAL_DATE);
        double valor = Double.parseDouble(valorStr);
        Categoria categoria = Categoria.valueOf(categoriaStr);

        Despesa despesa = new Despesa(descricaoStr, data, valor, categoria);
        Connection connection = ConnectionFactory.getConnection();
        DespesaDAO dao = new DespesaDAO(connection);
        dao.salvar(despesa);

    }

}
