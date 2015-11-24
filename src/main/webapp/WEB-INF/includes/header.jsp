<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/WEB-INF/includes/commons/taglibs.jsp"%>
<!-- 样式切换 -->
<div id="mws-themer">
	<div id="mws-themer-hide"></div>
	<div id="mws-themer-content">
		<div class="mws-themer-section">
			<label for="mws-theme-presets">选择样式</label> <select
				id="mws-theme-presets"></select>
		</div>
		<div class="mws-themer-separator"></div>
		<div class="mws-themer-section">
			<ul>
				<li><span>基本</span>
					<div id="mws-base-cp" class="mws-cp-trigger"></div></li>
				<li><span>文字颜色</span>
					<div id="mws-text-cp" class="mws-cp-trigger"></div></li>
				<li><span>文字渐变色</span>
					<div id="mws-textglow-cp" class="mws-cp-trigger"></div></li>
			</ul>
		</div>
		<div class="mws-themer-separator"></div>
		<div class="mws-themer-section">
			<ul>
				<li><span>文字透明度</span>
					<div id="mws-textglow-op"></div></li>
			</ul>
		</div>
		<div class="mws-themer-separator"></div>
		<div class="mws-themer-section">
			<button class="mws-button red small" id="mws-themer-getcss">获取CSS样式</button>
		</div>
	</div>
	<div id="mws-themer-css-dialog">
		<div class="mws-form">
			<div class="mws-form-row" style="padding: 0;">
				<div class="mws-form-item">
					<textarea cols="auto" rows="auto" readonly="readonly"></textarea>
				</div>
			</div>
		</div>
	</div>
</div>

<div id="mws-header" class="clearfix">
	<div id="mws-logo-container">
		<div id="mws-logo-wrap">
			<img src="${ctx}/static/images/logo1.png" alt="mws admin" />
		</div>
	</div>

	<div id="mws-user-tools" class="clearfix">

		<div id="mws-user-info" class="mws-inset">
			<div id="mws-user-photo">
				<img src="${ctx}/static/example/profile.jpg" alt="User Photo" />
			</div>
			<div id="mws-user-functions">
				<div id="mws-username">欢迎你, <span>${sessionScope.user}</span></div>
				<ul>
					<li><a href="#">[个人中心]</a></li>
					<li><a href="${ctx }/changePasswordPage">[密码更改]</a></li>
					<li><a href="javascript:void(0)"
						onclick="window.parent.location.href='${ctx }/a/b/c/logout'">[退出]</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>

