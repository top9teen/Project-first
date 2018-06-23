<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="com.bru.model.*"%>
<%
	List<MsgadminBean> list = null;

%>
<%
	list = (List<MsgadminBean>) request.getSession().getAttribute("listUser");
%>
<div class=" form-group row">
	<div class=" form-group col-md-2"></div>
	<div class=" form-group col-md-8">
	<div class=" form-group row" ></div>
	<div class=" form-group col-md-12">
	<div align="right">
	<br>
	<input type="button" name="btn" id="btn" value="ส่งข้อความถึงแอดมิน" class="btn btn-info" onclick="toggle()" >
	</div>
		
	<div class=" form-group" id="display" style="display: none;">
	<form name="msg22" action="gotomsguser" method="post"
				OnSubmit="return fncSubmit();">
				<div class="panel panel-primary" style="margin-top: 15%">
					<div class="panel-heading" align="center"></div>
					<h2 align="center">ส่งข้อความ</h2>
					<br>
					<div class="panel-body">
				
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
	<div class=" form-group">
				<div class="panel-body">
						<h2 align="center">ข้อความทั้งหมด</h2>
						<form name="welcome" action="." method="post">
							<input type="hidden" name="regid" id="regid">
							<table class="table table-bordered">
							<thead>
								<tr>
									<th class="text-center">ลำดับ</th>
									<th class="text-center">ผู้ส่ง</th>
									<th class="text-center">หัวข้อ</th>
									<th class="text-center">เรื่อง</th>
									<th class="text-center">วันที่</th>
								
								</tr>
								</thead>
								<tbody id="myTable">
								<%
									for (int i = 0; i < list.size(); i++) {
								%>
								<tr class="text-center">

									<td><%=i + 1%></td>
									<td><%=list.get(i).getMsName()%></td>
									<td><%=list.get(i).getMsMsghard()%></td>
									<td><%=list.get(i).getMsMsgbody()%></td>
									<td><%=list.get(i).getMsDate()%></td>
									
								</tr>
								<%
									}
								%>
								</tbody>
							</table>

						</form>
						<script type="text/javascript">
						
							function gotoUpdate(filter) {
								document.getElementById("regid").value = filter;
								document.welcome.action="gotodeledww";
								document.welcome.submit();
							}
							$(document).ready(function(){
								  $("#myInput").on("keyup", function() {
								    var value = $(this).val().toLowerCase();
								    $("#myTable tr").filter(function() {
								      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
								    });
								  });
								});
						</script>
					</div>
	</div>
	</div>
	</div>
	<div class=" form-group col-md-2"></div>
	<script type="text/javascript">
	
	function fncSubmit(){
		if(document.msg22.msghard.value == "")
		{
			alert('Please input หัวเรื่อง');
			document.msg.msghard.focus();
			return false;
		}	
		if(document.msg22.msgbody.value == "")
		{
			alert('Please input ข้อความ');
			document.msg.msgbody.focus();
			return false;
		}	
	}
	function toggle() {
		var ds = document.getElementById("display");
		if(ds.style.display == 'none')
			ds.style.display = 'block';
		else 
			ds.style.display = 'none';
	}
	
	</script>
</div>