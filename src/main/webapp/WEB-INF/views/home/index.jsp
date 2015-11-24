<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/commons/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/includes/include.jsp"%>

<script type="text/javascript" src="js/demo.formelements.js"></script>

<title>建安检测项目信息管理系统</title>
</head>

<body>
	<!-- 页面顶部 -->
	<%@ include file="/WEB-INF/includes/header.jsp"%>

	<div id="mws-wrapper">

		<!-- 页面左侧菜单 -->
		<%@ include file="/WEB-INF/includes/menu.jsp"%>


		<div id="mws-container" class="clearfix">
			<!-- begin页面主体  -->
			<div class="container">

				<!--1.待办任务 begin -->
				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-table-1">项目信息列表 </span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>

									<th>项目名称</th>
									<th>设备数量</th>
									<th>分值</th>
									<th>金额</th>
									<th>委托单位</th>
									<th>委托日期</th>
									<th>操作</th>
									<!-- <th>no</th> -->

									<!-- <th>state</th> -->
									<!-- <th>ptype</th>		 -->
									<!-- <th>thecontact</th> -->
									<!-- <th>contactphone</th> -->
									<!-- <th>createtime</th>			 -->
									<!-- <th>createuserid</th> -->
									<!-- <th>projectbz</th> -->
									<!-- <th>projectmy</th>
									<th>projectinfo</th>
									
									<th>zone</th>
									<th>finishtime</th> -->
									<!-- <th>finish</th> -->
									<!-- <th>projectbzlist</th> -->
									<!-- <th>score</th> -->


								</tr>
							</thead>
							<tbody>

								<c:forEach items="${projectList}" var="item">
									<tr class="">
										<td>${item.title}</td>
										<td>${item.equipment}</td>
										<td>${item.premind}</td>
										<td>${item.contractamount}</td>
										<td>${item.tocompany}</td>
										<td><fmt:formatDate value="${item.totime}"
												pattern="yyyy-MM-dd HH:mm:ss" /></td>
										<td><a href="${ctx}/home/getProjectStep?projectid=${item.id}">项目步骤</a>||
											<a href="${ctx}/home/getProjectResult?projectid=${item.id}&quarterid=0">项目结果</a>

										</td>
										<%-- <td>${item.no}</td> --%>

										<%-- <td>${item.state}</td> --%>
										<%-- <td>${item.ptype}</td> --%>

										<%-- <td>${item.thecontact}</td> --%>
										<%-- <td>${item.contactphone}</td> --%>
										<%-- <td>${item.createtime}</td> --%>

										<%-- <td>${item.createuserid}</td> --%>
										<%-- <td>${item.projectbz}</td> --%>

										<%-- <td>${item.projectmy}</td>
										<td>${item.projectinfo}</td>
										
										<td>${item.zone}</td>
										<td>${item.finishtime}</td> --%>
										<%-- <td>${item.finish}</td> --%>
										<%-- <td>${item.projectbzlist}</td> --%>
										<%-- <td>${item.score}</td> --%>



									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>
				<!--1.待办任务 end -->



			</div>
			<!-- end页面主体  -->

			<!-- 页面底部 -->
			<%@ include file="/WEB-INF/includes/footer.jsp"%>

		</div>
	</div>

</body>
<script type="text/javascript">

$(document).ready(function() {	
	//alert("index page!");
	
	});
</script>
</html>
