<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Cryptocracks</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<style>
    .bk-image {
        background-color: #e2ebf0;
    }
</style>
</head>
<body class="bk-image">

	<div>
        <marquee>
            <h5> Crypto Market is High now.....</h5>
        </marquee>
    </div>

    <div class="container">
        <div>
            <h3>Crypto Currency List</h3>
        </div>
       <hr>
        <div class="d-flex">
            <div>
                <a href="<%=request.getContextPath()%>/coinlist" class="btn btn-warning">List All Coins</a>
            </div>
            <div class="ml-auto">
            	<a href="<%=request.getContextPath()%>/bookmarklist" class="btn btn-primary">Bookmark List</a>
            </div>
        </div>

        <table class="table table-bordered"
            style="margin-top: 20px; text-align:center; background-color: #BCD2E5;">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Symbol</th>
                    <th>Coin Name</th>
                    <th>Price (USD)</th>
                    <th>24hr Volume</th>
                    <th>Data Trade Start</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
            	<c:forEach var="user" items="${listCoins}">
                <tr class="flex align-middle">
                    <td><c:out value="${user.id}" /></td>
					<td><img style="width: 20%; height: auto;" src='<c:out value="${user.icon}"></c:out>' /><c:out value="${user.name}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.price}" /></td>
					<td><c:out value="${user.volume24}" /></td>
					<td><c:out value="${user.volume24}" /></td>
                    <td>
                        <a href="addcoin?coinid=<c:out value='${user.id}'/>" class="btn btn-info item-edit" title="Edit details">
                            <span class="svg-icon svg-icon-md">
	                            <svg xmlns="http://www.w3.org/2000/svg" width="21" height="21" fill="currentColor" class="bi bi-bookmark-plus-fill" viewBox="0 0 16 16">
								  <path fill-rule="evenodd" d="M2 15.5V2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.74.439L8 13.069l-5.26 2.87A.5.5 0 0 1 2 15.5zm6.5-11a.5.5 0 0 0-1 0V6H6a.5.5 0 0 0 0 1h1.5v1.5a.5.5 0 0 0 1 0V7H10a.5.5 0 0 0 0-1H8.5V4.5z"/>
								</svg>
                            </span>
                        </a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
<style>
    table tbody tr:nth-child(odd) {
        background-color: #F3FAFF;
    }

    table tbody tr:nth-child(even) {
        background-color: #FFFFFF;
    }

    table tbody tr:hover {
        background-color: #bcbcbc;
    }
</style>
</html>