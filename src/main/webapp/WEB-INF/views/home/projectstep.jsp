<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/commons/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/includes/include.jsp"%>

<script type="text/javascript" src="js/demo.formelements.js"></script>
	
<title>项目步骤</title>
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
						<span class="mws-i-24 i-table-1">项目步骤<font color="red">[共:${majorTotal }项]&nbsp;&nbsp;</font>
						</span>
					</div>
					<div class="mws-panel-body">
						<table class="mws-datatable-fn mws-table">
							<thead>
								<tr>
	
									<th>步骤类型</th>
									<th>步骤名称 </th>
									<th>步骤进度</th>
									<th>步骤进度时间</th>
									<th>步骤描述</th>
									<th>步骤创建人</th>
									<th>步骤创建时间</th>
									<th>操作</th>

								
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${projectStepList}" var="item">
									<tr class="gradeA">
										<td>${item.ptype}</td>
										<td>${item.stepname}</td>
										<td>${item.status}</td>
										<td><fmt:formatDate value="${item.statustime}"
												pattern="yyyy-MM-dd" /></td>
										<td>${item.stepdescrip}</td>
										<td>${item.createuserid}</td>
										<td><fmt:formatDate value="${item.createtime}"
												pattern="yyyy-MM-dd" /></td>
										<td>
										<a href="${ctx}/home/getProjectResult?projectid=${item.projectid}&qid=${item.id}">项目结果</a>
										</td>
										
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
