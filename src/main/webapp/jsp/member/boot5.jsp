<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@page import="com.bru.model.*"%>
<%@page import="java.util.List"%>
<%
	List<RegisterallBean> list = null;
Integer a =0 ;
%>
<%
	list = (List<RegisterallBean>) request.getSession().getAttribute("listUser");
%>
<%
AmountBean beandsw = null;

%>
<%
beandsw = (AmountBean) request.getSession().getAttribute("amo88");

%>
<div class="row">

	<div class="col-md-10">
		<form name="welcome" action="." method="post">
			<input type="hidden" name="regid" id="regid">
			<div class=" form-group row">
				<div class="col-xs-8">
					<input type="button" name="btn" id="btn" value="ส่งข้อความถึงลูกค้า"
				class="btn btn-info" onclick="toggle()"> <br>
				</div>
				<div align="right" class="col-xs-4">
					<span style="font-size: 15px;"> จำนวนเงินของท่าน :<input id="test2" type="text"disabled="disabled" value="<%=beandsw.getAmMoney() %>"/> บาท</span><br>
					<input id="myInput" type="text" placeholder="Search...."
						class="form-control">
				</div>
			</div>
		
			<table class="table table-bordered">
				<thead>
					<tr>
						<th class="text-center">ลำดับ</th>
						<th class="text-center">เมลล์</th>
						<th class="text-center">ชื่อ</th>
						<th class="text-center">เบอร์โทร</th>
						<th class="text-center">รถรุ่น</th>
						<th class="text-center">จังหวัด</th>
						<th class="text-center">งวดทั้งหมด</th>
						<th class="text-center">งวดที่เหลือ</th>
						<th class="text-center">รายละเอียด</th>
					</tr>
				</thead>
				<tbody id="myTable">

					<%
						for (int i = 0; i < list.size(); i++) {
							if(list.get(i).getRegReadtext().equals("1")){
					%>

					<tr class="text-center">
						<td><%=a=a + 1%></td>
						<td><%=list.get(i).getRegEmail()%></td>
						<td><%=list.get(i).getRegFirstname()%></td>
						<td><%=list.get(i).getRegTelephone()%></td>
						<td><%=list.get(i).getRegCarmake()%></td>
						<td><%=list.get(i).getRegProvince()%></td>
						<td><%=list.get(i).getRegLessday()%></td>
						<td><%=list.get(i).getRegLessdayformy()%></td>
						<td><span style="color: blue;">ยังไม่ได้อ่าน</span></td>
						<td><a onclick="gotoUpdate('<%=list.get(i).getRegId()%>')"><span
								class="glyphicon glyphicon-search"> </span></a></td>


					</tr>
					<%
						}}
					%>
					<%
						for (int i = 0; i < list.size(); i++) {
							if(list.get(i).getRegReadtext().equals("2")){
					%>

					<tr class="text-center">
						<td><%=a=a + 1%></td>
						<td><%=list.get(i).getRegEmail()%></td>
						<td><%=list.get(i).getRegFirstname()%></td>
						<td><%=list.get(i).getRegTelephone()%></td>
						<td><%=list.get(i).getRegCarmake()%></td>
						<td><%=list.get(i).getRegProvince()%></td>
						<td><%=list.get(i).getRegLesslimit()%></td>
						<td><span style="color: red;">อ่านแล้ว</span></td>
						<td><a onclick="gotoUpdate('<%=list.get(i).getRegId()%>')"><span
								class="glyphicon glyphicon-search"> </span></a></td>


					</tr>
					<%
						}}
					%>
				</tbody>
			</table>

		</form>
		<div class=" form-group" id="display" style="display: none;">
			<form name="msg22" action="gotomsguser2" method="post"
				OnSubmit="return fncSubmit();">
				<div class="panel panel-primary" style="margin-top: 15%">
					<div class="panel-heading" align="center"></div>
					<h2 align="center">ส่งข้อความ</h2>
					<br>
					<div class="panel-body">
						<div class="form-group">
							<label for="exampleInputEmail1">Email User :</label> <input
								type="text" class="form-control" name="email22">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">ชื่อเรื่อง</label> <input
								type="text" class="form-control" name="msghard">
						</div>

						<div class="form-group">
							<label for="exampleInputPassword1">ข้อความ</label>
							<textarea rows="5" class="form-control" cols="" name="msgbody"></textarea>
						</div>

						<br>
						<div class="panel-footer" align="right">
							<input type="submit" class="btn btn-success" value="ส่งข่อความ">&nbsp;

						</div>
					</div>
				</div>
			</form>
		</div>


	</div>
	<div class="col-md-2"></div>
</div>

<script type="text/javascript">

function toggle() {
	var ds = document.getElementById("display");
	if(ds.style.display == 'none')
		ds.style.display = 'block';
	else 
		ds.style.display = 'none';
}


	function gotoUpdate(filter) {
		document.getElementById("regid").value = filter;
		document.welcome.action = "gotoUpdate56";
		document.welcome.submit();
	}
	$(document).ready(
			function() {
				$("#myInput").on(
						"keyup",
						function() {
							var value = $(this).val().toLowerCase();
							$("#myTable tr").filter(
									function() {
										$(this).toggle(
												$(this).text().toLowerCase()
														.indexOf(value) > -1)
									});
						});
			});
</script>