package br.com.trabalhofinal.acoes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Acao {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
