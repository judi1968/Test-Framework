<%
    String message = (String) request.getAttribute("message");
    String subtitle = (String) request.getAttribute("subtitle");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1><%= message %></h1>
    <p><%= subtitle %></p>
    <form action="/test_depoloiment/akory" method="post">
        <input type="int" name="id" placeholder="id">
        <input type="text" name="baba" placeholder="type">
        <button>Ajoute</button>
    </form>
</body>
</html>