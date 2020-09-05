<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>


</head>

<body>
	<%@include file="./base.jsp"%>

	<div class="container mt-5">

		<div class="row">
			<div class="col-md-6 offset-3">

				<form action="handleproduct" method="post">
					<h1 class="text-center display-4">Add Products</h1>

					<div class="form-group">
						<label for="exampleInputEmail1">Product Name</label> <input
							type="text" class="form-control" name="name"
							placeholder="Product Name Here" id="exampleInputEmail1">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Product Description</label>
						<textarea class="form-control"
						name="description" placeholder="Product Description"
						 id="exampleFormControlTextarea1"
							rows="5"></textarea>
					</div>


					<div class="form-group">
						<label for="exampleInputPassword1">Price</label> <input
							type="text" class="form-control" name="price"
							placeholder="Price here" id="exampleInputPassword1">
					</div>

					<div class="container text-center">
						<button type="submit" class="btn btn-outline-success">Add</button>
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-warning">Back</a>
					</div>
				</form>


			</div>

		</div>


	</div>

</body>
</html>