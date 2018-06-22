<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/autonumeric/4.1.0/autoNumeric.js"></script>
	
<%
	String result = "";
%>
<%
	result = (String) request.getAttribute("SE");
%>
<style type="text/css">
body {
	background-color: #9999FF;
}
h1{
font-family: cursive;
font-variant: small-caps;
font-size-adjust: inherit;
font-stretch: narrower;
font-size: 60px;
color: #7FFF00;
}
span {
	font-family: monospace;
	font-variant: small-caps;
font-size-adjust: inherit;
font-stretch: narrower;
font-size: 30px;
color: #FF7F50;
}
label {
	color: #FF7F50;
	font-stretch: extra-condensed;
	font-size: 20px;
	font-family: monospace;
}
</style>
</head>
<body style="margin-top: 5%; height: 20%;">
	<br>
	<br>
	<br>
	<div class="container">
	<h1 align="center">Welcome<span>New</span>User</h1>
		<div class="form-group row">
			<div class="form-group col-md-2"></div>
			<div class="form-group col-md-8">
				<form name="welcome" action="register" method="post"
					onSubmit="return fncSubmit();">

					<%
						if (result.equals("S")) {
					%>
					<div class="alert alert-success">
						<strong>Success!</strong> Insert Success..
					</div>
					<%
						} else if (result.equals("F")) {
					%>
					<div class="alert alert-danger">
						<strong>Danger!</strong> Insert Fail !..
					</div>
					<%
						} else if (result.equals("M")) {
					%>
					<div class="alert alert-danger">
						<strong>Membership!</strong> USER Membership !..
					</div>
					<%}%>
					<div class="form-group">
						<label for="exampleInputEmail1">FristName :</label> <input
							type="text" class="form-control" name="fristName">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">LastName :</label> <input
							type="text" class="form-control" name="lastName">
					</div>
					<div class="form-group">
						
						<label for="exampleInputEmail1">Email :</label>
						<div id="aa"></div> <input
							type="email" class="form-control" name="username" id="email">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Password :</label> <input
							type="password" class="form-control" name="password">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Re-Password :</label> <input
							type="password" class="form-control" name="repassword">
					</div>
					
					<div class="panel-footer" align="right">
						<button style="width: 4cm;" type="submit" class="btn btn-outline-success" id="mm">สมัคร</button>
						<button style="width: 4cm;" type="button" class="btn btn-outline-primary" 
							onclick="javascript: document.backForm.submit()" > Back</button>
					</div>
<div class="form-group">

<input type="text" id="test" min="0" max="10" step="" value=""/>

</div>
				</form>
			</div>
			<div class="form-group col-md-2"></div>
		</div>
	</div>
	<form name="backForm" action="/" method="post" th:hidden="true"></form>
	<form name="logoutForm" action="logout" method="post" th:hidden="true"></form>
	<script type="text/javascript"
		src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="assets/js/checknewuser.js"></script>
	<script type="text/javascript">

	$(document).ready(function(){
		anElement = new AutoNumeric("#test");
	});
	
	
$('#email').change(function () {
			
			var criteriaBean = { "year" :  $('#email').val()};
			$('#aa').empty();
			
			$.ajax({
				type : "POST",
				url : "/emails",
				data: JSON.stringify(criteriaBean) ,
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				success : function(msg) {
					console.log('Success')
					if(msg.usUsername != null) {
						$('#aa').append('<div class="alert alert-danger"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a><strong>ผิดพลาด ! </strong> Email มีแล้ว!!</div>');
						$("#mm").attr('disabled','disabled');
					}
					else if(msg.usUsername == null) {
						$('#aa').append('<div class="alert alert-success"><a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a><strong>Email </strong> ใช้งานได้</div>');
						$("#mm").attr('disabled',false);
					}
					
				}
			});
		});

	function fncSubmit()
	{

		if(document.welcome.fristName.value == "" )
		{
			alert('Please input fristName');
			document.welcome.fristName.focus();
			return false;
		}	
		if(document.welcome.lastName.value == "" )
		{
			alert('Please input lastName');
			document.welcome.lastName.focus();
			return false;
		}	
		if(document.welcome.username.value == "" )
		{
			alert('Please input Email');
			document.welcome.username.focus();
			return false;
		}	
		
		if(document.welcome.password.value == "" )
		{
			alert('Please input password');
			document.welcome.password.focus();		
			return false;
		}	

		if(document.welcome.repassword.value == "")
		{
			alert('Please input Confirm repassword');
			document.welcome.repassword.focus();		
			return false;
		}	

		if(document.welcome.password.value != document.welcome.repassword.value)
		{
			alert('Confirm Password Not Match');
			document.welcome.repassword.focus();		
			return false;
		}	
			document.welcome.submit();

	    }
</script>
</body>
</html>