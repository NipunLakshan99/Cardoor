<%@page import="com.javaUtil.DB.VehicleDao"%>  
<jsp:useBean id="u" class="com.javaClass.vehicle"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=VehicleDao.save(u);  
if(i>0){  
	response.sendRedirect("addvehicle-success.jsp");  
}else{  
	response.sendRedirect("addvehicle-error.jsp");  
}  
%>  