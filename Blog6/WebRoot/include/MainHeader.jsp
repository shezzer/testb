<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script language="javascript">
<!--
function mhEnter()
{
window.event.srcElement.className="lt1";
}
function mhLeave()
{
window.event.srcElement.className="lt0";
}
//-->
</script>
<link rel="stylesheet" href="../image/style.css">
</head>

<body>
<table width="1000" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><img src="image/banner.jpg" /></td>
	</tr>
	<tr height="31">
		<td background="image/line.jpg">
			<table width="1000" border="0" cellpadding="0" cellspacing="0">
				<tr height="20" align="center">
					<td width="278">&nbsp;</td>
					<td class="lt0" onmouseenter="mhEnter()" onmouseleave="mhLeave()"><a href="${pageContext.request.contextPath}/showAllArticle.action">博客首页</a></td>
					<td class="ltsep">|</td>
					<td class="lt0" onmouseenter="mhEnter()" onmouseleave="mhLeave()"><a href="register.jsp">新博客注册</a></td>
					<td class="ltsep">|</td>
					<td class="lt0" onmouseenter="mhEnter()" onmouseleave="mhLeave()"><a href="login.jsp">博客登录</a></td>
					<td class="ltsep">|</td>
					<td class="lt0" onmouseenter="mhEnter()" onmouseleave="mhLeave()"><a href="../index.html">图片</a></td>
					<td class="ltsep">|</td>
					<td class="lt0" onmouseenter="mhEnter()" onmouseleave="mhLeave()"><a href="../index.html">链接</a></td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>

