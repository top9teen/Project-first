<%@page import="com.bru.model.UserAllBean"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
	<ul class="nav menu">
			<li class="active"><a href="welcomeAdmin"><em
					class="fa fa-dashboard">&nbsp;</em> Dashboard</a></li>
			<li><a href="widgets"><em class="fa fa-calendar">&nbsp;</em>
					Widgets</a></li>
			<li><a href="charts"><em class="fa fa-bar-chart">&nbsp;</em>
					Charts</a></li>
			<li><a href="elements"><em class="fa fa-toggle-off">&nbsp;</em>
					UI Elements</a></li>
			<li><a href="panelsl"><em class="fa fa-clone">&nbsp;</em>
					Alerts &amp; Panels</a></li>
			<li class="parent "><a data-toggle="collapse" href="#sub-item-1">
					<em class="fa fa-navicon">&nbsp;</em> Multilevel <span
					data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em
						class="fa fa-plus"></em></span>
			</a>
				<ul class="children collapse" id="sub-item-1">
					<li><a class="" href="adminsel1"> <span
							class="fa fa-arrow-right">&nbsp;</span> ดูสินเชื่อทั้งหมด
					</a></li>
					<li><a class="" href="adminsel2"> <span
							class="fa fa-arrow-right">&nbsp;</span> ดูสินเชื่อที่ผ่านอนุมัต
					</a></li>
					<li><a class="" href="adminsel3"> <span
							class="fa fa-arrow-right">&nbsp;</span> ดูรายละเอียดธนาคาร
					</a></li>
					<li><a class="" href="adminmsg"> <span
							class="fa fa-arrow-right">&nbsp;</span> ข้อความทั้งหมด
					</a></li>
					<li><a class="" href="adminmsg23"> <span
							class="fa fa-arrow-right">&nbsp;</span> ประวัติข้อความที่ลบไป
					</a></li>
					<li><a class="" href="msgall23"> <span
							class="fa fa-arrow-right">&nbsp;</span> ประวัติการเติมเงิน/โอนเงิน
					</a></li>
						<li><a class="" href="msguser"> <span
							class="fa fa-arrow-right">&nbsp;</span> ส่งข้อความ
					</a></li>
					<li><a class="" href="adminupdate"> <span
							class="fa fa-arrow-right">&nbsp;</span> อัพเดทราคารถยนต์
					</a></li>
					<li><a class="" href="admininsert"> <span
							class="fa fa-arrow-right">&nbsp;</span> เพิ่มรถยนต์
					</a></li>
					<li><a class="" href="generate"> <span
							class="fa fa-arrow-right">&nbsp;</span> generate Money
					</a></li>
				</ul></li>
			<li><a href="logoutadmin"><em class="fa fa-power-off">&nbsp;</em>
					Logout</a></li>
		</ul>