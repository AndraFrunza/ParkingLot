<%-- 
    Document   : pageTemplate
    Created on : Oct 25, 2021, 11:11:50 AM
    Author     : VivoBook
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="pageTitle"%>

<%-- any content can be specified here e.g.: --%>

<!DOCTYPE html>
<h2>
    <html>
    <head>
        <title>${pageTitle}</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
       <jsp:doBody/>
    </body>
</html>
</h2>