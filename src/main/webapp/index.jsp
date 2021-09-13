<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso JSP</title>
<link rel="stylesheet" type="text/css" href="style/login.css">
<link rel="stylesheet" type="text/css" href="../style/login.css">

</head>
<body>



	<h1>Sistema em JSP</h1>
	
		<p >${msgFilter}</p> <p >${msg}</p>
	
	<div class="content">
		<!--FORMULÁRIO DE LOGIN-->
		<div id="login">
			<form method="post" action="ServletLogin">
				<input type="hidden" value="<%=request.getParameter("url")%>"
					name="url" />
				<p>
					<label for="nome_login">Login</label> <input id="nome_login"
						name="login" required="required" autocomplete="off" type="text"
						placeholder="ex. user" />
				</p>

				<p>
					<label for="email_login">Senha</label> <input id="email_login"
						name="senha" required="required" autocomplete="off" type="password"
						placeholder="ex. senha" />
				</p>

				<p>
					<input type="checkbox" name="manterlogado" id="manterlogado"
						value="" /> <label for="manterlogado">Manter-me logado</label>
				</p>

				<p>
					<input type="submit" value="Logar" />
				</p>

				<p class="link">
					Ainda não tem conta? <a href="#paracadastro">Cadastre-se</a>
				</p>

			</form>

		</div>


	</div>

</body>

</html>

