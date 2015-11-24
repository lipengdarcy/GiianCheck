<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/includes/commons/taglibs.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/includes/include.jsp"%>

<script type="text/javascript" src="${ctx}/static/js/mws.js"></script>
<script type="text/javascript" src="${ctx}/static/js/demo.js"></script>
<script type="text/javascript" src="${ctx}/static/js/themer.js"></script>

<title>项目信息管理系统 用户登录</title>

<!-- 
18858101357
pf5775923
 -->
</head>

<body>

	<div id="mws-login">
		<h1>项目信息管理系统 登录</h1>
		<div class="mws-login-lock">
			<img src="${ctx}/static/css/icons/24/locked-2.png" alt="" />
		</div>
		<div id="mws-login-form">

			<form id="form" class="mws-form" action="" method="post">
				<div class="mws-form-row">
					<div class="mws-form-item large">
						<input type="text" name="telephone" 
							class="mws-login-username mws-textinput validate[required]" placeholder="用户名" />
					</div>
				</div>
				<div class="mws-form-row">
					<div class="mws-form-item large">
						<input type="password" name="password" 
							class="mws-login-password mws-textinput validate[required]" placeholder="密码" /> <input
							type="checkbox" name="remember" id="remember" /> <label
							id="remember-label" for="remember" style="color: white">记住密码</label>
					</div>
				</div>
				<div class="mws-form-row">
					<input type="submit" value="登录" id="loginButton"
						class="mws-button green mws-login-button" />
				</div>
			</form>

		</div>

		<div id="mws-login-form">

			<p></p>
			<p>
				
				<p>
					
				</p>
		</div>
	</div>



</body>
<script type="text/javascript">
	$(document).ready(function() {
		$("div#mws-login .mws-login-back").mouseover(function(event) {
			$(this).find("a").animate({
				'left' : 0
			})
		}).mouseout(function(event) {
			$(this).find("a").animate({
				'left' : 70
			})
		});

		//登录前验证：用户名密码不能空
		$("#form").validationEngine({
			onValidationComplete : function(form, status) {
				if (status) {
					login();
				}else{
					$.jGrowl("用户名密码不能为空!", {
						header : "error"
					});
				}
			}
		});


		$("#loginButton").bind("click", function(event) {

		});
	});
	
	function login(){
		
		$.ajax({
			url : '${ctx }/login',
			data : $("#form").serialize(),
			type : 'post',
			dataType : 'xml',
			success : function(data) {
				var message = "ok" + ${error};
				$.jGrowl(message, {
					header : "info"
				});
			},
			error : function() {
				$.jGrowl("异常！请重新尝试或者联系管理员!", {
					header : "error"
				});					
			}
		});
	}
</script>

</html>
