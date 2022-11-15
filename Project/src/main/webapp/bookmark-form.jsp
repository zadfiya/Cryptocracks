<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${bookmarkCoin != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${coin != null}">
					<form action="insert?coinid=${coin.id}" method="get">
				</c:if>

				<caption>
					<h2>
						<c:if test="${bookmarkCoin != null}">
            			Edit Coin
            		</c:if>
						<c:if test="${bookmarkCoin == null}">
            			Add Coin
            		</c:if>
					</h2>
				</caption>

				<c:if test="${bookmarkCoin != null}">
					<input type="hidden" name="id" value="<c:out value='${bookmarkCoin.id}' />" />
					<fieldset class="form-group">
					<label>Coin Name</label> 
					<input type="text"
						value="<c:out value='${bookmarkCoin.name}' />" class="form-control"
						name="name" required="required">
					</fieldset>
				</c:if>

				<c:if test="${coin != null}">
				<input type="hidden" name="coinid" value="<c:out value='${coin.id}' />" />
					<fieldset class="form-group">
						<label>Coin Name</label> <input type="text"
							value="<c:out value='${coin.name}' />" class="form-control"
							name="name" required="required">
					</fieldset>
				</c:if>

				<fieldset class="form-group">
					<label>Purchased Date</label> <input type="text"
						value="<c:out value='${bookmarkCoin.purchasedDate}' />" class="form-control"
						name="pDate">
				</fieldset>
				<fieldset class="form-group">
					<label>Purchased Quantity </label> <input type="text"
						value="<c:out value='${bookmarkCoin.quantity}' />" class="form-control"
						name="quantity">
				</fieldset>
				<fieldset class="form-group">
					<label>Purchased Price </label> <input type="text"
						value="<c:out value='${bookmarkCoin.purchasedPrice}' />" class="form-control"
						name="pPrice">
				</fieldset>
				<div class="d-flex">
					<button type="submit" class="btn btn-success">Save</button>
					<c:if test="${bookmarkCoin != null}">            			
						<a href="<%=request.getContextPath()%>/bookmarklist" class="btn btn-danger ml-auto">Go Back</a>
            		</c:if>
            		<c:if test="${bookmarkCoin == null}">            			
						<a href="<%=request.getContextPath()%>/coinlist" class="btn btn-danger ml-auto">Go Back</a>
            		</c:if>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>