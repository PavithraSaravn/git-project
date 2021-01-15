<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
	<div class="container">
		<h4>
			No items in Cart. Use 'Add to Cart' option in <a
				href="/ShowMenuItemListCustomer">Menu Item List</a>
		</h4>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>