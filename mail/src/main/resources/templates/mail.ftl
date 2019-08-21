<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>freemarker</h1>
<div>
    hello${username}，欢迎加入 XXX 大家庭！
</div>
您的入职信息如下：
<table border="1">
    <tr>
        <td>职位</td>
        <td>${position}</td>
    </tr>
    <tr>
        <td>职称</td>
        <td>${joblevel}</td>
    </tr>
    <tr>
        <td>薪水</td>
        <td>${salary}</td>
    </tr>
    <tr>
        <td>部门</td>
        <td>${dep}</td>
    </tr>
</table>
<div style="color: #ff1a0e;font-size: 20px">希望在未来的日子里，携手共进！</div>
</body>
</html>