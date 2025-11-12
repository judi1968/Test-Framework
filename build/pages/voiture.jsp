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
    <form action="" method="post">
        <input type="text" >
        <button>Ajoute</button>
    </form>
    <img src="sasa.jpg" width="250" alt="">
</body>
</html>