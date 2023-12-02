<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://xmlns.jcp.org/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Despesa</title>
    <style>
        table {
          margin-top: 15px;
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }

        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
        }

        tr:nth-child(even) {
          background-color: #dddddd;
        }

        .back-button {
            margin-bottom: 15px;
            text-decoration: none;
            top: 15px;
            left: 15px;
            padding: 10px;
            border: none;
            background-color: #d9534f;
            color: #fff;
            border-radius: 4px;
            cursor: pointer;
        }

        .back-button:hover {
            background-color: #c9302c;
        }
    </style>
</head>
<body>
    <a href="index.html" class="back-button">&#9665; Voltar</a>
    <table>
        <tr>
            <th>Descrição</th>
            <th>Data</th>
            <th>Valor</th>
            <th>Categoria</th>
        </tr>


           <c:forEach var="despesa" items="${despesas}">
           <tr>
                <td>${despesa.getDescricao()} </td>
                <td>${despesa.getData()} </td>
                <td>${despesa.getValor()} </td>
                <td>${despesa.getCategoria()} </td>
           </tr>
            </c:forEach>

    </table>
</body>
</html>
