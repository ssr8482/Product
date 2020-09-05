<html>
<head>
<title>Product App</title>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
</head>

<body>



	<div class="container mt-5 text-center">
		<div class="row">

			<div class="col-md-12">

				<h1 class="display-4">Welcome To Our Shop</h1>

				<table class="table mt-2">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products }" var="p">
							<tr>
								<th scope="row">Shopify${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td class="font-weight-bold">&#8377;${p.price}</td>
								<td><a href="delete/${p.id}"><i
										class="text-danger fas fa-trash-alt fa-2x"></i></a> <a
									href="update/${p.id}"><i
										class="text-info fas fa-pen-nib fa-2x pl-4"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>


			</div>

			<div class="container">

				<a class="btn btn-outline-success" href="add">Add
					Product</a>

			</div>


		</div>

	</div>



</body>
</html>
