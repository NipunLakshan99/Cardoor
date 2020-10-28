<%@page import="com.javaUtil.DB.BookingDao"%>  
<jsp:useBean id="u" class="com.javaClass.Booking"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
	int i=BookingDao.update(u);  
	response.sendRedirect("viewbookings.jsp");  
%>  