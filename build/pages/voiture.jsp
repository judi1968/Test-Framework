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


    <p>Check box (sprint 8)</p>
    <form action="/test_depoloiment/bm" method="get">
        <input type="int" name="id" placeholder="id">
        <input type="text" name="type" placeholder="type">
        <input type="text" name="nom" placeholder="nom">
        <input type="text" name="prenom" placeholder="prenom">

        <label>Oui</label>
        <input type="checkbox" name="baba"  placeholder="type">

        <label>Non</label>
        <input type="checkbox" name="baba" placeholder="type">
        <button>Ajoute</button>
    </form>
</body>
</html>