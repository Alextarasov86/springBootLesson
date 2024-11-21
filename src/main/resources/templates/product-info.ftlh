<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>BUY SELL</title>
</head>
<body>
<h1>BYSELL</h1>
<h3>Подробная информация о товаре</h3>
<#list images as img>
    <img src="/image/${img.id}" height="60px" alt="img"><br><br>
</#list>
<b>Название товара:</b> ${product.title}<br>
<b>Описание товара:</b> ${product.description}<br>
<b>Цена товара:</b> ${product.price}<br>
<b>Город:</b> ${product.city}<br>
<b>Продавец:</b> ${product.author}<br><br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар">
</form>
</body>
</html>