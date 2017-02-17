<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>博客注册</title>
<link rel="stylesheet" href="image/style.css">
<script type="text/javascript">
	function checkForm(){
		// 校验用户名:
		var username = document.getElementById("username").value;
		if(username == ''){
			alert("用户名不能为空!");
			return false;
		}
		
		// 校验密码:
		var password = document.getElementById("password").value;
		if(password == ''){
			alert("密码不能为空!");
			return false;
		}
		
		// 校验确认密码
		var repassword = document.getElementById("repassword").value;
		if(password != repassword){
			alert("两次密码不一致!");
			return false;
		}
	}
	function change(){
		var img = document.getElementById("checkImg");
		img.src="${pageContext.request.contextPath}/checkImg.action?"+new Date().getTime();
	}
	
</script>
</head>

<body topmargin="0" leftmargin="0" bgcolor="#f3f3f3">
		<jsp:include page="include/MainHeader.jsp"></jsp:include>
		<s:form id="Form1" action="register.action" method="post" novalidate="novalidate" onsubmit="return checkForm();">
			<table width="1000" cellpadding="0" cellspacing="0" border="0">
				<tr height="100">
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td align="right" width="300" valign="top"><img src="image/register.gif"></td>
					<td width="20">&nbsp;</td>
					<td valign="top">
						<table width="600" border="1" cellpadding="0" cellspacing="0" style="background-color:#FFFFFF;BORDER-RIGHT:#cccccc 1px solid; BORDER-TOP:#cccccc 1px solid; BORDER-LEFT:#cccccc 1px solid; BORDER-BOTTOM:#cccccc 1px solid; BORDER-COLLAPSE:collapse">
							<tr height="30">
								<td colspan="3" align="center" background="image/main/l-bg1.jpg"><font color="#ffff66"><b>新博客注册</b></font></td>
							</tr>
							<tr>
									<th><span class="requiredField">*</span>用户名:</th>
									<td><input type="text" id="username" name="username"
										class="text" maxlength="20" onblur="checkUserName()" /><span
										id="span1"><s:fielderror fieldName="username" />
									</span></td>
								</tr>
								<tr>
									<th><span class="requiredField">*</span>密&nbsp;&nbsp;码:</th>
									<td><input type="password" id="password" name="password"
										class="text" maxlength="20" autocomplete="off" /><span><s:fielderror
												fieldName="password" />
									</span></td>
								</tr>
								<tr>
									<th><span class="requiredField">*</span>确认密码:</th>
									<td><input type="password" id="repassword"
										name="repassword" class="text" maxlength="20"
										autocomplete="off" /></td>
								</tr>
								<tr>
									<th><span class="requiredField">*</span>E-mail:</th>
									<td><input type="text" id="email" name="email"
										class="text" maxlength="200" /><span><s:fielderror
												fieldName="email" />
									</span></td>
								</tr>
							
							<tr height="30">
								<td colspan="3" align="center"><input type="submit" value="提交"/>
								<input type="reset" value="重置"/>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>

