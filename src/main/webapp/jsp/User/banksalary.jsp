<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.bru.model.*"%>

<%
	KasikornPriceBean kabean = null;
	KrungsriPriceBean krbean = null;
	ScbeasyPriceBean scbean = null;
	ThanachartPriceBean thbean = null;
	SimBean sibran = null;
%>
<%
	kabean = (KasikornPriceBean) request.getSession().getAttribute("kabean");
	krbean = (KrungsriPriceBean) request.getSession().getAttribute("krbean");
	scbean = (ScbeasyPriceBean) request.getSession().getAttribute("scbean");
	thbean = (ThanachartPriceBean) request.getSession().getAttribute("thbean");
	sibran = (SimBean) request.getSession().getAttribute("simbean");
%>

		<div class="form-group" align="center">
			<form action="gotopreriod" method="post"
				OnSubmit="return fncSubmit();" name="prig">
				<div>
				<p style="font-size: 35px;" ><span style="color: red;">*</span>ลูกค้าสามารถร้องขอวงเงินสูงกว่าธนาคารได้ แต่อยู่ที่ดุลพินิจของธนาคารด้วย</p>
					<input type="hidden" value="<%=sibran.getMycar()%>" name="Mycar">
					<input type="hidden" value="<%=sibran.getMybrand()%>"
						name="Mybrand"> <input type="hidden"
						value="<%=sibran.getMyYear()%>" name="MyYear"> <input
						type="radio" name="bb" id="ka" value="kasikorn" checked>เลือก
					<label for="exampleInputEmail1"> ธนาคคารกสิกร : <input
						type="text" name="ka" disabled="disabled"
						value="<%=kabean.getKaPrice()%>" class="form-control" id="test1">
					</label>
				</div>
				<div class="form-group">
					<input type="radio" name="bb" id="kr" value="krungsri">เลือก
					<label for="exampleInputEmail1"> ธนาคารกรุงศรี : <input
						type="text" name="kr" disabled="disabled"
						value="<%=krbean.getKrPrice()%>" class="form-control" id="test2">
					</label>
				</div>
				<div class="form-group">
					<input type="radio" name="bb" id="sc" value="scbeasy">เลือก <label
						for="exampleInputEmail1"> ธนาคาร SCB : <input type="text"
						name="sc" disabled="disabled" value="<%=scbean.getScPrice()%>"
						class="form-control"id="test3">
					</label>
				</div>
				<div class="form-group">
					<input type="radio" name="bb" id="th" value="thanachart">เลือก
					<label for="exampleInputEmail1"> ธนาคาร ธนชาติ : <input
						type="text" name="th" disabled="disabled"
						value="<%=thbean.getThPrice()%>" class="form-control"id="test4">
					</label>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> เงินที่ต้องการ : <input
						type="text" name="pp"  class="form-control" id="pp">
					</label>
				</div>
				<div class="panel-footer" align="center"
					style="background: transparent;">
					<input type="submit" value="ยืนยัน"  class="btn btn-success">

				</div>
			</form>
			<script type="text/javascript">
			$(document).ready(function(){
				anElement = new AutoNumeric("#test1");
				anElement = new AutoNumeric("#test2");
				anElement = new AutoNumeric("#test3");
				anElement = new AutoNumeric("#test4");
			
			});
			
			</script>
		</div>
		
	