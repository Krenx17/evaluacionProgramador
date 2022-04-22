<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cotizaciones</title>
</head>
<body>
	<h1>Cotizar envios</h1>

	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<div class="form-control">
					<label for="exampleFormControlInput1" class="form-label">Usuario</label>
					<div class="form-floating">
						<select class="form-select" id="floatingSelect"
							aria-label="Floating label select example">
							<option selected>-seleccione el usuario-</option>
							<option value="1">Usuario</option>
							<option value="2">Two</option>
						</select> <label for="floatingSelect">Usuario</label>
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Peso</label>
						<input type="text" class="form-control" id="peso"
							placeholder="000.00">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Ancho</label>
						<input type="text" class="form-control" id="ancho"
							placeholder="000.00">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Alto</label>
						<input type="text" class="form-control" id="alto"
							placeholder="000.00">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Largo</label>
						<input type="text" class="form-control" id="largo"
							placeholder="000.00">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Pais
							de origen</label> <input type="text" class="form-control" id="origen"
							placeholder="Estados Unidos">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Pais
							de destino</label> <input type="text" class="form-control" id="destino"
							placeholder="Guatemala">
					</div>
					<label for="exampleFormControlInput1" class="form-label">Region</label>
					<div class="form-floating">
						<select class="form-select" id="floatingSelect"
							aria-label="Floating label select example">
							<option selected>-seleccione la region-</option>
							<option value="1">One</option>
						</select> <label for="floatingSelect">Region</label>
					</div>
					<button type="button" class="btn btn-primary">Cotizar</button>
				</div>
			</div>
			<div class="col"></div>
		</div>

	</div>
</body>
</html>