<%@page import="com.javaUtil.DB.StystemUDBUtil"%>  
<jsp:useBean id="u" class="com.javaClass.SystmeU"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
	int i=StystemUDBUtil.save(u);  
	if(i>0){  
				response.sendRedirect("addSysuser-success.jsp");  
			}else{  
				response.sendRedirect("addSysuser-error.jsp");  
			}  
%>  