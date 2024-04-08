<?php

if($_POST){

    //Recibe informacion de HTML con el metodo POST
    $nombre = $_POST['txtNombre'];

    echo "Hola ".$nombre;
}
    
?>

<!DOCTYPE HTML>

<html>

    <head>
        <meta charset="UTF-8">

        <title>Prueba de PHP</title>
        <h1>Esto es una prueba</h1>

    </head>

    <body>

        <!-- Envia informacion al mismo archivo pero en php -->
        <form action="prueba2.php" method = "post">

            <input type = "text" name = "txtNombre" id = "">
            <br>
            <br>
            <input type = "submit" value = "Enviar">

        </form>

    </body>
</html>