<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Menu</title>
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
		<h1>Menu Items</h1>
	</div>
	<br>
	<div class="container">
		<c:if test="${addCartStatus==true}">
			<h3 style="text-align: center; color: lightgreen">Item Added to Cart Successfully</h3>
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
					<th>Category</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${menuItemListCustomer}" var="menuItem">
					<tr>
						<td>${menuItem.menuItemName}</td>
						<c:if test="${menuItem.menuItemIsFreeDelivery==true}">
							<td>Yes</td>
						</c:if>
						<c:if test="${menuItem.menuItemIsFreeDelivery==false}">
							<td>No</td>
						</c:if>
						<td>Rs.${menuItem.menuItemPrice}</td>
						<td>${menuItem.menuItemCategory}</td>
						<td><a class="btn btn-success"
							href="/AddtoCart?id=${menuItem.menuItemId}">Add to Cart</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>