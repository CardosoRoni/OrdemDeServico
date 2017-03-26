<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tela de Cadastro</title>
</head>
<body>
<form action="CadastroServlet"method="post">
<br/>Nome: <input type="text"name="nome"/>
<br/>Endereco: <input type="text"name="endereco"/>
<br/>Telefone: <input type="text"name="telefone"/>
<br/>Defeito relatado: <input type="text"name="Defeito"/>
<br/>Itens que Acompanham Produto: <input type="text"name="itens"/>
<br/>Data: <input type="text"name="data"/>
<br/>
<br/>
<input type="submit"value="Confirma"/>


</form>
</body>
</html>