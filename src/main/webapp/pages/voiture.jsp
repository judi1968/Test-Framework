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
    <form action="/test_depoloiment/bm" method="post">
        <input type="int" name="id" placeholder="id">
        <input type="text" name="type" placeholder="type">
        <input type="text" name="nom" placeholder="nom">
        <input type="text" name="prenom" placeholder="prenom">

        <label>Oui</label>
        <input type="checkbox" name="baba" value="oui" placeholder="type">

        <label>Non</label>
        <input type="checkbox" name="baba" value="non" placeholder="type">

        <label>Peut etre</label>
        <input type="checkbox" name="baba"value="peut etre" placeholder="type">
        <button>Ajoute</button>
    </form>

    <p>Objet (sprint 8 bis)</p>
    <form action="/test_depoloiment/voiture" method="post">
        <input type="int" name="id" placeholder="id">
        <input type="text" name="type" placeholder="type">
        <input type="text" name="fiara.nom" placeholder="nom fiara">
        <input type="text" name="fiara.chauffeur.nom" placeholder="nom an le sofera">
        <input type="text" name="fiara.chauffeur.maison.adresse" placeholder="tranon le sofera">

        <p>Zanaka sofera</p>
        <br>
        <label>Zampol</label>
        <input type="checkbox" name="sofera.zanaka" value="Zampol" placeholder="type">

        <br>
        <label>Zamba</label>
        <input type="checkbox" name="sofera.zanaka" value="Zamba" placeholder="type">

        <br>
        <label>Peut etre</label>
        <input type="checkbox" name="sofera.zanaka"value="peut etre" placeholder="type">
        <br>

        <p>Laharana</p>
        <br>
        <label>1</label>
        <input type="checkbox" name="fiara.chauffeur.laharana" value="1">

        <br>
        <label>2</label>
        <input type="checkbox" name="fiara.chauffeur.laharana" value="2">

        <br>
        <label>3</label>
        <input type="checkbox" name="fiara.chauffeur.laharana"value="3">
        <br>

        <p>Daty</p>
        <br>
        <label>1</label>
        <input type="date" name="fiara.chauffeur.daty" >

        <br>
        <label>2</label>
        <input type="date" name="fiara.chauffeur.daty">

        <br>
        <label>3</label>
        <input type="date" name="fiara.chauffeur.daty">
        <br>

         <p>Pneu []</p>
        <br>
        <input type="text" value="p1" name="fiara.pneus[6][3].nom">

        <br>
        <input type="text" value="p2" name="fiara.pneus[2][7].soferization[4][5][6].nom">



        <button>Ajoute</button>
    </form>

    <p>API (sprint 9)</p>
    <form action="/test_depoloiment/voiture-api" method="post">
        <input type="int" name="id" placeholder="id">
        <input type="text" name="type" placeholder="type">
        <input type="text" name="fiara.nom" placeholder="nom fiara">
        <input type="text" name="fiara.chauffeur.nom" placeholder="nom an le sofera">
        <input type="text" name="fiara.chauffeur.maison.adresse" placeholder="tranon le sofera">

        <p>Zanaka sofera</p>
        <br>
        <label>Zampol</label>
        <input type="checkbox" name="sofera.zanaka" value="Zampol" placeholder="type">

        <br>
        <label>Zamba</label>
        <input type="checkbox" name="sofera.zanaka" value="Zamba" placeholder="type">

        <br>
        <label>Peut etre</label>
        <input type="checkbox" name="sofera.zanaka"value="peut etre" placeholder="type">
        <br>

        <p>Laharana</p>
        <br>
        <label>1</label>
        <input type="checkbox" name="fiara.chauffeur.laharana" value="1">

        <br>
        <label>2</label>
        <input type="checkbox" name="fiara.chauffeur.laharana" value="2">

        <br>
        <label>3</label>
        <input type="checkbox" name="fiara.chauffeur.laharana"value="3">
        <br>

        <p>Daty</p>
        <br>
        <label>1</label>
        <input type="date" name="fiara.chauffeur.daty" >

        <br>
        <label>2</label>
        <input type="date" name="fiara.chauffeur.daty">

        <br>
        <label>3</label>
        <input type="date" name="fiara.chauffeur.daty">
        <br>

        <button>Ajoute</button>
    </form>


    <p>Import fichier (sprint 10)</p>
    <form action="/test_depoloiment/import-file" method="post"enctype="multipart/form-data">
        <input type="file" name="fiara.sary" required />
        <button>Ajoute</button>
    </form>
</body> 
</html>