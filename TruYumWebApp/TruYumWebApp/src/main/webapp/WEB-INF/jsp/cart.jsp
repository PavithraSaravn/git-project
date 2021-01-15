-<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Cart</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav role="navigation" class="navbar navbar-default">
		<div class="">
			<a href="#" class="navbar-brand">truYum</a> <img class="navbar-brand"
				alt="logo" src="images/truyum-logo-dark.png">
		</div>
		<div class="navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/ShowMenuItemListCustomer">Menu</a></li>
				<li><a href="/ShowCart">Cart</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<h1>Cart</h1>
	</div>
	<br>
	<div class="container">
		<c:if test="${removeCartItemStatus==true}">
			<h3 style="text-align: center; color: lightgreen">Item removed from Cart Successfully</h3>
		</c:if>
	</div>
	<br>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Free Delivery</th>
					<th>Price</th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${cartItems}" var="cartItem">
					<tr>
						<td>${cartItem.cartItemName}</td>
						<c:if test="${cartItem.cartItemIsFreeDelivery==true}">
							<td>Yes</td>
						</c:if>
						<c:if test="${cartItem.cartItemIsFreeDelivery==false}">
							<td>No</td>
						</c:if>
						<td>Rs.${cartItem.cartItemPrice}</td>
						<td><a class="btn btn-danger"
							href="/RemoveCartItem?id=${cartItem.cartItemId}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>