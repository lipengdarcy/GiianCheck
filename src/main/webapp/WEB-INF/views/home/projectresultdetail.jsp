<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/commons/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/includes/include.jsp"%>

<script type="text/javascript"
	src="${ctx}/static/plugins/xheditor/xheditor-1.2.1.min.js"></script>
<script type="text/javascript"
	src="${ctx}/static/plugins/xheditor/xheditor_lang/zh-cn.js"></script>



<title>项目结果编辑</title>
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



				<div class="mws-panel grid_8">
					<div class="mws-panel-header">
						<span class="mws-i-24 i-text-styling-3">项目结果详情&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"><a href="javascript:history.go(-1);">后退</a> </font></span>
					</div>
					<div class="mws-panel-body">
						<form class="mws-form" id="form" action="">
							<input type="hidden" name="id" value="${projectResult.id}" /> 

							<div class="mws-form-inline">
															
								<div class="mws-form-row">
									<label>结果创建时间:</label>
									<div class="mws-form-item">
									 
										<input type="text" disabled="disabled"  value="<fmt:formatDate value="${projectResult.createtime}"
												pattern="yyyy-MM-dd HH:mm:ss" />" class="mws-textinput" />										
									</div>
								</div>
								
								<div class="mws-form-row">
									<label>结果:</label>
									<div class="mws-form-item">
										<textarea id="elm1" name="result" class="xheditor-mfull">${projectResult.result}</textarea>
									</div>
								</div>
								<div class="mws-form-row">
									<label>检测结论:</label>
									<div class="mws-form-item medium">
										<input type="text" name="conclusion" value="${projectResult.conclusion}" class="mws-textinput" />
									</div>
								</div>
								<div class="mws-button-row">
									<input type="submit" id="submitButton" value="提交结果"
										class="mws-button red" />
								</div>
							</div>
						</form>
					</div>
				</div>

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
		var editor = $('#elm1').xheditor();
		//对话框定义
		$("#mws-jui-dialog").dialog({
			autoOpen: false, 
			title: "提示", 
			modal: true, 
			width: "640", 
			buttons: [{
					text: "确定", 
					click: function() {
						$( this ).dialog( "close" );
					}}]
		});
		//对话框弹出事件
		$("#mws-jui-dialog-mdl-btn").bind("click", function(event) {
			$("#mws-jui-dialog").dialog("option", {modal: true}).dialog("open");
			event.preventDefault();
		});
	});
	
	//新增修改按钮
	$("#submitButton").bind("click", function(e) {
		var sendData = $("#form").serialize();
		
		$.ajax({
			url : "${ctx}/home/updateProjectResult",
			type : "post",
			data : sendData,
			async : false,
			success : function(data, status) {
				//后台执行成功后的回调函数
				if (data.state == "success") {
					alert(data.content);
					window.location.href = "${ctx}/home/getProjectResult?projectid=${projectResult.projectid}&quarterid=${projectResult.quarterid}";
					
					//window.location.reload();
				} else {
					$.jGrowl(data.content, {
						header : "info"
					});
				}
			},
			error : function(xhr, errinfor, ex) {
				//后台发生异常后的回调函数
				$.jGrowl(errinfor, {
						header : "info"
					});
				
			}
		});
		//不增加return false; 上面的跳转无效
		return false;
	});
	
	function deleteResult(id) { 
		
			$.ajax({
				url : "${ctx}/home/deleteProjectResult?id=" + id,
				async : true,
				success : function(data, status) {
					//后台执行成功后的回调函数
					if (data.state === "success") {
						alert(data.content);
						//window.location.href = "${ctx}/home/getProjectResult";
						
						window.location.reload();
					} else {
						$.jGrowl(data.content, {
							header : "info"
						});
					}
				},
				error : function(xhr, errinfor, ex) {
					//后台发生异常后的回调函数
					$.jGrowl(errinfor, {
							header : "info"
						});
					
				}
			});

		
	} 
	
	
</script>
</html>
