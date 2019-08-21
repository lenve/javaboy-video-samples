<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>用户地址</td>
    </tr>
    <#list users as u>
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.address}</td>
        </tr>
    </#list>
</table>
</body>
</html>