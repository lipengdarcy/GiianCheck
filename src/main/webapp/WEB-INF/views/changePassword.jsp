<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/includes/commons/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/includes/include.jsp"%>




<title>密码修改</title>
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
						<span class="mws-i-24 i-list">密码修改</span>
					</div>
					<div class="mws-panel-body">
						<form class="mws-form" id="form" action="">
							<div class="mws-form-inline">

								<input type="hidden" name="telephone"
									value="${sessionScope.user}" />

								<div class="mws-form-row">
									<label>原密码</label>
									<div class="mws-form-item small">
										<input type="password" name="password" class="mws-textinput validate[required]" />
									</div>
								</div>
								<div class="mws-form-row">
									<label>新密码</label>
									<div class="mws-form-item small">
										<input type="password" id="newPassword1" name="newPassword"
											class="mws-textinput validate[required]" />
									</div>
								</div>
								<div class="mws-form-row">
									<label>再次输入新密码</label>
									<div class="mws-form-item small">
										<input type="password" id="newPassword2" class="mws-textinput validate[required]" />
									</div>
								</div>




							</div>
							<div class="mws-button-row">

								<input type="submit" id="submitButton" value="确认"
									class="mws-button red" />

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
		//检查后提交
		$("#form").validationEngine({
			onValidationComplete : function(form, status) {
				if (status) {
					if($("#newPassword1").val() == $("#newPassword2").val())
						changePassword();
					else
						$.jGrowl("两次密码输入不一致，请重新输入！", {header:"提示"});
				}
			}
		});
						
	});
	
	
	//修改密码
	function changePassword() {

		var sendData = $("#form").serialize();
		//弹窗提示配置
		var myDialog = dialog({
			title : '提示',
			id : "dialog",
			fixed : true,
			width : 300,
			height : 50
		});

		$.ajax({
			url : "${ctx}/changePassword",
			type : "post",
			data : sendData,
			async : false,
			success : function(data, status) {
				//后台执行成功后的回调函数
				if (data.state == "success") {
					$.jGrowl(data.content, {header:"提示"});
					//window.location.reload();
				} else {
					$.jGrowl(data.content, {header:"提示"});
				}
			},
			error : function(xhr, errinfor, ex) {

			}
		});

	}
</script>
</html>
