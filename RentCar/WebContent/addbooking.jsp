<%@page import="com.javaUtil.DB.BookingDao"%>  
<jsp:useBean id="u" class="com.javaClass.Booking"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=BookingDao.save(u);  
if(i>0){  
	response.sendRedirect("bookingsave.jsp");  
}else{  
	response.sendRedirect("bookingerror.jsp");  
}  
%>  
