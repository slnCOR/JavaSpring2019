<%-- 
    Document   : index
    Created on : Apr 19, 2019, 11:33:40 AM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.mycompany.webapp.WebAppCalc_Service service = new com.mycompany.webapp.WebAppCalc_Service();
	com.mycompany.webapp.WebAppCalc port = service.getWebAppCalcPort();
	 // TODO initialize WS operation arguments here
	int i = 5;
	int j = 7;
	// TODO process result here
	int result = port.add(i, j);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
