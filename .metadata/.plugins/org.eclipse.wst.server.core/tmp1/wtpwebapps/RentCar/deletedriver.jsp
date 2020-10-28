<%@page import="com.javaUtil.DB.AgentDao"%>  
<jsp:useBean id="u" class="com.javaClass.Agent"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
  	AgentDao.delete(u);  
  		response.sendRedirect("viewagent.jsp");
  %>  