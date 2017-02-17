<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
<link rel="stylesheet" href="image/style.css">
<style type="text/css">
<!--
.STYLE1 {
	color: #0066FF;
	font-weight: bold;
}
-->
</style>
<script type="text/javascript">
	
	function change(){
		var img = document.getElementById("checkImg");
		img.src="${pageContext.request.contextPath}/checkImg.action?"+new Date().getTime();
	}
	
</script>
</head>

<body onLoad="document.forms[0]['username'].focus()" topmargin="0" leftmargin="0" bgcolor="#f3f3f3">
<jsp:include page="include/MainHeader.jsp"></jsp:include>
<h3><s:actionerror/></h3>
<s:form id="Form1" action="login.action" method="post" >
	
  <table width="1000" cellpadding="0" cellspacing="0" border="0">
   <tr>
								<th>
										用户名:
								</th>
								<td>
									<input type="text" id="username" name="username" class="text" maxlength="20"/><span><s:fielderror fieldName="username"/></span>
								</td>
							</tr>
							<tr>
								<th>
									密&nbsp;码:
								</th>
								<td>
									<input type="password" id="password" name="password" class="text" maxlength="20" autocomplete="off"/><span><s:fielderror fieldName="password"/></span>
								</td>
							</tr>
								<tr>
									<th>
										<span class="requiredField">*</span>验证码:
									</th>
									<td><span class="fieldSet"> 
										<input type="text"
											id="checkcode" name="checkcode" class="text captcha"
											maxlength="4" autocomplete="off"/>
										<img
												id="checkImg" class="captchaImage"
												src="${ pageContext.request.contextPath }/checkImg.action"
												title="点击更换验证码" onclick="change()"/>
									</span></td>
								</tr>
							<tr>
								<th>&nbsp;
									
								</th>
								<td>
									<label>
										<input type="checkbox" id="isRememberUsername" name="isRememberUsername" value="true">记住用户名
									</label>
									<label>
										&nbsp;&nbsp;<a >找回密码</a>
									</label>
								</td>
							</tr>
							<tr>
								<th>&nbsp;
									
								</th>
								<td>
									<input type="submit" class="submit" value="登 录">
								</td>
							</tr>
          
        </table>
      </td>
      
    </tr>
  </table>
</s:form>
</body>
</html>
