<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Certificación</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="row my-5">
					<div class="col">
						<form action="/" method="post">
							<div class="form-row">
								<div class="col">
									<label for="estado_id">Estado</label> <select id="estado_id"
										name="estado_id" class="custom-select" required="required">
										<c:forEach var="estado" items="${estados}">
											<option value="${estado.id}">${estado.descripcion}</option>
										</c:forEach>
									</select>
								</div>
								<div class="col">
									<label for="departamento_id">Departamento</label> <select
										id="departamento_id" name="departamento_id"
										class="custom-select" required="required">
										<c:forEach var="departamento" items="${departamentos}">
											<option value="${departamento.id}">${departamento.numero}</option>
										</c:forEach>
									</select>
								</div>
								<div class="col">
									<label for="fecha_desde">Fecha desde</label> <input
										id="fecha_desde" name="fecha_desde" type="date"
										class="form-control" placeholder="Last name"
										required="required">
								</div>
								<div class="col">
									<label for="fecha_hasta">Fecha hasta</label> <input
										id="fecha_hasta" name="fecha_hasta" type="date"
										class="form-control" placeholder="Last name"
										required="required">
								</div>
							</div>
							<div class="row my-3">
								<div class="col">
									<button type="submit" class="btn btn-secondary">Buscar</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<h3>Tabla de arriendos:</h3>
						<table class="table">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Estado</th>
									<th scope="col">Departamento</th>
									<th scope="col">Fecha</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="arriendo" items="${arriendos}">
									<tr>
										<th scope="row">${arriendo.id}</th>
										<td>${arriendo.estado.descripcion}</td>
										<td>${arriendo.departamento.numero}</td>
										<td>${arriendo.fecha}</td>
									</tr>

								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>