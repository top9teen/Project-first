<%@page import="com.bru.model.UserAllBean"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.bru.model.MsgadminBean"%>
<%@page import="java.util.List"%>
<%
	List<MsgadminBean> list = null;
%>
<%
	list = (List<MsgadminBean>) request.getSession().getAttribute("listUser");
%>
<html xmlns:th="http://www.thymeleaf.org">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>WELLCOME MY ADMIN</title>
<link href="assets/admin/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/admin/css/font-awesome.min.css" rel="stylesheet">
<link href="assets/admin/css/datepicker3.css" rel="stylesheet">
<link href="assets/admin/css/styles.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!--Custom Font-->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">
<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<%
		UserAllBean bean = null;
	%>
	<%
		bean = (UserAllBean) request.getSession().getAttribute("Login");
	%>
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>WELLCOME</span>Admin</a>
				<ul class="nav navbar-top-links navbar-right">
					<li class="dropdown"><a class="dropdown-toggle count-info"
						data-toggle="dropdown" href="#"> <em class="fa fa-envelope"></em><span
							class="label label-danger">15</span>
					</a>
						<ul class="dropdown-menu dropdown-messages">
							<li>
								<div class="dropdown-messages-box">
									<a href="profile.html" class="pull-left"> <img alt="image"
										class="img-circle" src="http://placehold.it/40/30a5ff/fff">
									</a>
									<div class="message-body">
										<small class="pull-right">3 mins ago</small> <a href="#"><strong>John
												Doe</strong> commented on <strong>your photo</strong>.</a> <br /> <small
											class="text-muted">1:24 pm - 25/03/2015</small>
									</div>
								</div>
							</li>
							<li class="divider"></li>
							<li>
								<div class="dropdown-messages-box">
									<a href="profile.html" class="pull-left"> <img alt="image"
										class="img-circle" src="http://placehold.it/40/30a5ff/fff">
									</a>
									<div class="message-body">
										<small class="pull-right">1 hour ago</small> <a href="#">New
											message from <strong>Jane Doe</strong>.
										</a> <br /> <small class="text-muted">12:27 pm -
											25/03/2015</small>
									</div>
								</div>
							</li>
							<li class="divider"></li>
							<li>
								<div class="all-button">
									<a href="#"> <em class="fa fa-inbox"></em> <strong>All
											Messages</strong>
									</a>
								</div>
							</li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle count-info"
						data-toggle="dropdown" href="#"> <em class="fa fa-bell"></em><span
							class="label label-info">5</span>
					</a>
						<ul class="dropdown-menu dropdown-alerts">
							<li><a href="#">
									<div>
										<em class="fa fa-envelope"></em> 1 New Message <span
											class="pull-right text-muted small">3 mins ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<em class="fa fa-heart"></em> 12 New Likes <span
											class="pull-right text-muted small">4 mins ago</span>
									</div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
									<div>
										<em class="fa fa-user"></em> 5 New Followers <span
											class="pull-right text-muted small">4 mins ago</span>
									</div>
							</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- /.container-fluid -->
	</nav>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<div class="profile-sidebar">
			<div class="profile-userpic">
				<img src="http://placehold.it/50/30a5ff/fff" class="img-responsive"
					alt="">
			</div>
			<div class="profile-usertitle">
				<div class="profile-usertitle-name"><%=bean.getUsFname()%></div>
				<div class="profile-usertitle-status">
					<span class="indicator label-success"></span>Online
				</div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="divider"></div>
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<%@include file="hradadmin.jsp"%>
	</div>
	<!--/.sidebar-->

	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"> <em class="fa fa-home"></em>
				</a></li>
				<li class="active">Dashboard</li>
			</ol>
		</div>
		<!--/.row-->

		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Dashboard</h1>
			</div>
		</div>
		<!--/.row-->

		<div class="panel panel-container">
			<div class="row">
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-teal panel-widget border-right">
						<div class="row no-padding">
							<em class="fa fa-xl fa-shopping-cart color-blue"></em>
							<div class="large">120</div>
							<div class="text-muted">New Orders</div>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-blue panel-widget border-right">
						<div class="row no-padding">
							<em class="fa fa-xl fa-comments color-orange"></em>
							<div class="large">52</div>
							<div class="text-muted">Comments</div>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-orange panel-widget border-right">
						<div class="row no-padding">
							<em class="fa fa-xl fa-users color-teal"></em>
							<div class="large">24</div>
							<div class="text-muted">New Users</div>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-md-3 col-lg-3 no-padding">
					<div class="panel panel-red panel-widget ">
						<div class="row no-padding">
							<em class="fa fa-xl fa-search color-red"></em>
							<div class="large">25.2k</div>
							<div class="text-muted">Page Views</div>
						</div>
					</div>
				</div>
			</div>
			<!--/.row-->
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">

					<div class="panel-body">
						<h2 align="center">ข้อความจากสมาชิก</h2>
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
		<!--/.row-->

		<div class="row">
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>New Orders</h4>
						<div class="easypiechart" id="easypiechart-blue" data-percent="92">
							<span class="percent">92%</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Comments</h4>
						<div class="easypiechart" id="easypiechart-orange"
							data-percent="65">
							<span class="percent">65%</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>New Users</h4>
						<div class="easypiechart" id="easypiechart-teal" data-percent="56">
							<span class="percent">56%</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Visitors</h4>
						<div class="easypiechart" id="easypiechart-red" data-percent="27">
							<span class="percent">27%</span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/.row-->

		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default chat">
					<div class="panel-heading">
						Chat
						<ul class="pull-right panel-settings panel-button-tab-right">
							<li class="dropdown"><a class="pull-right dropdown-toggle"
								data-toggle="dropdown" href="#"> <em class="fa fa-cogs"></em>
							</a>
								<ul class="dropdown-menu dropdown-menu-right">
									<li>
										<ul class="dropdown-settings">
											<li><a href="#"> <em class="fa fa-cog"></em>
													Settings 1
											</a></li>
											<li class="divider"></li>
											<li><a href="#"> <em class="fa fa-cog"></em>
													Settings 2
											</a></li>
											<li class="divider"></li>
											<li><a href="#"> <em class="fa fa-cog"></em>
													Settings 3
											</a></li>
										</ul>
									</li>
								</ul></li>
						</ul>
						<span
							class="pull-right clickable panel-toggle panel-button-tab-left"><em
							class="fa fa-toggle-up"></em></span>
					</div>
					<div class="panel-body">
						<ul>
							<li class="left clearfix"><span class="chat-img pull-left">
									<img src="http://placehold.it/60/30a5ff/fff" alt="User Avatar"
									class="img-circle" />
							</span>
								<div class="chat-body clearfix">
									<div class="header">
										<strong class="primary-font">John Doe</strong> <small
											class="text-muted">32 mins ago</small>
									</div>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nulla ante turpis, rutrum ut ullamcorper sed, dapibus ac nunc.</p>
								</div></li>
							<li class="right clearfix"><span class="chat-img pull-right">
									<img src="http://placehold.it/60/dde0e6/5f6468"
									alt="User Avatar" class="img-circle" />
							</span>
								<div class="chat-body clearfix">
									<div class="header">
										<strong class="pull-left primary-font">Jane Doe</strong> <small
											class="text-muted">6 mins ago</small>
									</div>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nulla ante turpis, rutrum ut ullamcorper sed, dapibus ac nunc.</p>
								</div></li>
							<li class="left clearfix"><span class="chat-img pull-left">
									<img src="http://placehold.it/60/30a5ff/fff" alt="User Avatar"
									class="img-circle" />
							</span>
								<div class="chat-body clearfix">
									<div class="header">
										<strong class="primary-font">John Doe</strong> <small
											class="text-muted">32 mins ago</small>
									</div>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
										Nulla ante turpis, rutrum ut ullamcorper sed, dapibus ac nunc.</p>
								</div></li>
						</ul>
					</div>
					<div class="panel-footer">
						<div class="input-group">
							<input id="btn-input" type="text" class="form-control input-md"
								placeholder="Type your message here..." /><span
								class="input-group-btn">
								<button class="btn btn-primary btn-md" id="btn-chat">Send</button>
							</span>
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						To-do List
						<ul class="pull-right panel-settings panel-button-tab-right">
							<li class="dropdown"><a class="pull-right dropdown-toggle"
								data-toggle="dropdown" href="#"> <em class="fa fa-cogs"></em>
							</a>
								<ul class="dropdown-menu dropdown-menu-right">
									<li>
										<ul class="dropdown-settings">
											<li><a href="#"> <em class="fa fa-cog"></em>
													Settings 1
											</a></li>
											<li class="divider"></li>
											<li><a href="#"> <em class="fa fa-cog"></em>
													Settings 2
											</a></li>
											<li class="divider"></li>
											<li><a href="#"> <em class="fa fa-cog"></em>
													Settings 3
											</a></li>
										</ul>
									</li>
								</ul></li>
						</ul>
						<span
							class="pull-right clickable panel-toggle panel-button-tab-left"><em
							class="fa fa-toggle-up"></em></span>
					</div>
					<div class="panel-body"></div>
					<div class="panel-footer">
						<div class="input-group">
							<input id="btn-input" type="text" class="form-control input-md"
								placeholder="Add new task" /><span class="input-group-btn">
								<button class="btn btn-primary btn-md" id="btn-todo">Add</button>
							</span>
						</div>
					</div>
				</div>
			</div>
			<!--/.col-->


			<div class="col-md-6">
				<div class="panel panel-default ">
					<div class="panel-heading">
						Timeline
						<ul class="pull-right panel-settings panel-button-tab-right">
							<li class="dropdown"><a class="pull-right dropdown-toggle"
								data-toggle="dropdown" href="#"> <em class="fa fa-cogs"></em>
							</a>
								<ul class="dropdown-menu dropdown-menu-right">
									<li>
										<ul class="dropdown-settings">
											<li><a href="#"> <em class="fa fa-cog"></em>
											</a></li>
											<li class="divider"></li>
											<li><a href="#"> <em class="fa fa-cog"></em>
											</a></li>
											<li class="divider"></li>
											<li><a href="#"> <em class="fa fa-cog"></em>
											</a></li>
										</ul>
									</li>
								</ul></li>
						</ul>
						<span
							class="pull-right clickable panel-toggle panel-button-tab-left"><em
							class="fa fa-toggle-up"></em></span>
					</div>
					<div class="panel-body timeline-container">
						<ul class="timeline">
							<li>
								<div class="timeline-badge">
									<em class="glyphicon glyphicon-pushpin"></em>
								</div>
								<div class="timeline-panel">
									<div class="timeline-heading">
										<h4 class="timeline-title">Lorem ipsum dolor sit amet</h4>
									</div>
									<div class="timeline-body">
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing
											elit. Integer at sodales nisl. Donec malesuada orci ornare
											risus finibus feugiat.</p>
									</div>
								</div>
							</li>
							<li>
								<div class="timeline-badge primary">
									<em class="glyphicon glyphicon-link"></em>
								</div>
								<div class="timeline-panel">
									<div class="timeline-heading">
										<h4 class="timeline-title">Lorem ipsum dolor sit amet</h4>
									</div>
									<div class="timeline-body">
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing
											elit.</p>
									</div>
								</div>
							</li>
							<li>
								<div class="timeline-badge">
									<em class="glyphicon glyphicon-camera"></em>
								</div>
								<div class="timeline-panel">
									<div class="timeline-heading">
										<h4 class="timeline-title">Lorem ipsum dolor sit amet</h4>
									</div>
									<div class="timeline-body">
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing
											elit. Integer at sodales nisl. Donec malesuada orci ornare
											risus finibus feugiat.</p>
									</div>
								</div>
							</li>
							<li>
								<div class="timeline-badge">
									<em class="glyphicon glyphicon-paperclip"></em>
								</div>
								<div class="timeline-panel">
									<div class="timeline-heading">
										<h4 class="timeline-title">Lorem ipsum dolor sit amet</h4>
									</div>
									<div class="timeline-body">
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing
											elit.</p>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--/.col-->
			<div class="col-sm-12">
				<p class="back-link">
					Lumino Theme by <a href="https://www.medialoot.com">Medialoot</a>
				</p>
			</div>
		</div>
		<!--/.row-->
	</div>
	<!--/.main-->

	<script src="assets/admin/js/jquery-1.11.1.min.js"></script>
	<script src="assets/admin/js/bootstrap.min.js"></script>
	<script src="assets/admin/js/chart.min.js"></script>
	<script src="assets/admin/js/chart-data.js"></script>
	<script src="assets/admin/js/easypiechart.js"></script>
	<script src="assets/admin/js/easypiechart-data.js"></script>
	<script src="assets/admin/js/bootstrap-datepicker.js"></script>
	<script src="assets/admin/js/custom.js"></script>
	<script>
		window.onload = function() {
			var chart1 = document.getElementById("line-chart").getContext("2d");
			window.myLine = new Chart(chart1).Line(lineChartData, {
				responsive : true,
				scaleLineColor : "rgba(0,0,0,.2)",
				scaleGridLineColor : "rgba(0,0,0,.05)",
				scaleFontColor : "#c5c7cc"
			});
		};
	</script>

</body>
</html>