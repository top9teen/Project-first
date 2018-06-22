<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.bru.model.*"%>
<%
AmountBean beands = null;

%>
<%
beands = (AmountBean) request.getSession().getAttribute("amo");

%>
<div class="container">
	<div class="form-group row">
		<div class="form-group col-md-2"></div>

		<div class="form-group col-md-8"><br>
		<span style="font-size: 15px;"> จำนวนเงินของท่าน :<input id="test2" type="text"disabled="disabled" value="<%=beands.getAmMoney() %>"/> บาท</span>
		
	<form name="vvv" action="gotomon" method="post"
				OnSubmit="return fncSubmitv();">
	<div class="form-group">
							<label for="exampleInputEmail1"></label> <input type="text"
								class="form-control" name="vvvs">
						</div> <input style="width: 4cm;"
		type="submit" class="btn btn-success" value="เติมเงิน">
	
</form>
</div>
	<div class="form-group col-md-2"></div>
</div>
<script type="text/javascript">
		function fncSubmitv() {
			if (document.vvv.vvvs.value == "") {
				alert('Please input Number');
				document.vvv.vvvs.focus();
				return false;
			}
			
		}
		$(document).ready(function(){
			anElement = new AutoNumeric("#test2");
		
		
		});
		</script>
</div>