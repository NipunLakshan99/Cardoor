<%@page import="com.javaUtil.DB.AgentDao"%>  
<jsp:useBean id="u" class="com.javaClass.Agent"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
	int i=AgentDao.save(u);  
	if(i>0){  
				response.sendRedirect("addagent-success.jsp");  
			}else{  
				response.sendRedirect("addagent-error.jsp");  
			}  
%>  