<%@page import="com.javaUtil.DB.VehicleDao"%>  
<jsp:useBean id="u" class="com.javaClass.vehicle"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
	int i=VehicleDao.update(u);  
	response.sendRedirect("viewvehicles.jsp");  
%>  