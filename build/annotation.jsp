<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.lang.reflect.Method" %>
<%@ page import="controller.*" %>
<%@ page import="jframework.annotation.Url" %>

    <%
        Personne p = new Personne();
        Class<?> clazz = p.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Url.class)) {
                Url m = method.getAnnotation(Url.class);
                out.println("Methode " + method.getName() + " : " + m.value());
                // Appeler la methode
                method.invoke(p);
            } 
        }
    %>
</body>
</html>