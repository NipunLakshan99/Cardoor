<%@page import="com.javaUtil.DB.feedbackDao"%>  
<jsp:useBean id="u" class="com.javaClass.feedback"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
	feedbackDao.delete(u);  
	response.sendRedirect("viewfeedback.jsp");  
%>  