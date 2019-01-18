<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>

	<div class="container">
		<div class="row">
		
			<%
			String error = request.getParameter("mensaje");
			if (error != null){
			%>
			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<% out.print(error); %>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<% }%>
			
			<form role="form" method="POST" action="/ValidarUsuario">
				<div class="form-group">
					<label for="usuario">usuario</label> <input type="text"
						class="form-control" id="usuario" name="usuario"
						aria-describedby="usuarioHelp" autofocus required="required">
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" name="password"
						required="required">
				</div>
				<button type="submit" class="btn btn-primary">Enviar</button>
				<button type="button" class="btn btn-primary">Registrar</button>
			</form>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.3.1.slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>