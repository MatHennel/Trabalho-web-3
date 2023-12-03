package br.com.trabalhofinal;

import br.com.trabalhofinal.acoes.Acao;
import br.com.trabalhofinal.acoes.AdicionaDespesa;
import br.com.trabalhofinal.acoes.ListaDespesas;
import br.com.trabalhofinal.acoes.RemoveDespesa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controladora")
public class ControllerServelet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            String acaoNome = request.getParameter("acao");
            String pacote = "br.com.trabalhofinal.acoes.";

            Class classe = Class.forName(pacote + acaoNome);
            Object acao = (Acao) classe.newInstance();

            ((Acao) acao).executa(request, response);

//            if(acao.equals("ListaDespesas")) new ListaDespesas().executa(request,response);
//            else if (acao.equals("AdicionaDespesa")) new AdicionaDespesa().executa(request, response);
//            else if(acao.equals("RemoveDespesa")) new RemoveDespesa().executa(request, response);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
