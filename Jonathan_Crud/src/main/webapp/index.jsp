<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<body>
<h1 align="center"class="text-secondary">Gestion de Clientes</h1>
<table align="center">
	<thead>
		
	</thead>
	<tbody>
		<tr>
			<td>
				<form action="ServeletControler"method="post">
					<p>id</p><input type="text" name="Id">
					<p>nombre</p><input type="text" name="Nombre">
					<p>apellido</p><input type="text" name="Apellido">
					<p>edad</p><input type="text" name="Edad">
					<p>Direcion</p><input type="text" name="Direcion">
					<p>dui</p><input type="text" name="Dui">
					<p>nit</p><input type="text" name="Nit">
					<p>Grupo</p><input type="text" name="grupoDeClaseProgramacion3Alquepertenece">
				<p>ultima_nota</p><input type="text" name="ultimaNotaObtenidaEnProgramacion2">
				<br>
				<br>
				<input type="submit" name="btn-info"value ="Eliminar">
				<input type="submit" name="btn-info"value ="Agregar">
				<input type="submit" name="btn btn-info" value="actualizar">

				</form>
			</td>
		</tr>
	</tbody>
</table>
</body>
</html>
