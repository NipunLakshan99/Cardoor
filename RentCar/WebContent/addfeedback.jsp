<%@page import="com.javaUtil.DB.feedbackDao"%>  
<jsp:useBean id="u" class="com.javaClass.feedback"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
	int i=feedbackDao.save(u);  
	if(i>0){  
				response.sendRedirect("feedback-success.jsp");  
			}else{  
				response.sendRedirect("feedback-error.jsp");  
			}  
%>  