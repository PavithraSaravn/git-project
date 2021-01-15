<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Menu</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav role="navigation" class="navbar navbar-default">
		<div class="">
			<a href="#" class="navbar-brand">truYum</a>
			<img class="navbar-brand" alt="logo" src="images/truyum-logo-dark.png">
		</div>
		<div class="navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/ShowMenuItemListAdmin">Menu</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<h1>Products</h1>
	</div>
	<br>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
					<th>Active</th>
					<th>Date of Launch</th>
					<th>Category</th>
					<th>Free Delivery</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${menuItemListAdmin}" var="menuItem">
					<tr>
						<td>${menuItem.menuItemName}</td>
						<td>Rs.${menuItem.menuItemPrice}</td>
						<c:if test="${menuItem.menuItemIsActive==true}">
							<td>Yes</td>
						</c:if>
						<c:if test="${menuItem.menuItemIsActive==false}">
							<td>No</td>
						</c:if>
						<td><fmt:formatDate pattern="dd/MM/yyyy"
							value="${menuItem.menuItemDateOfLaunch}" /></td>
						<td>${menuItem.menuItemCategory}</td>
						<c:if test="${menuItem.menuItemIsFreeDelivery==true}">
							<td>Yes</td>
						</c:if>
						<c:if test="${menuItem.menuItemIsFreeDelivery==false}">
							<td>No</td>
						</c:if>
						<td><a class="btn btn-warning" href="/showMenuItemListAdmin?id=${menuItem.menuItemId}">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>