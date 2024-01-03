<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1 style="color:darkviolet">ExtraOrdinaryServices</h1>
    <a href ="Home">Home</a>
	<a href ="NewAccount">New Account</a>
	<a href ="Balancel">Balance</a>
	<a href ="Deposit">Deposit</a>
	<a href ="Withdraw">Withdraw</a>
	<a href ="Transfer">Transfer</a>
	<a href ="CloseAccount">CloseAccount</a>
	<a href ="AboutUs">AboutUs</a>
	
	<h2 style=color:magenta>Close Account</h2>
	<form action="closeoneaccount" method="post">
		AccountNumber:<input type="number" name="accno"><p></p>
		Name:<input type="text" name="name"><p></p>
		password:<input type="password" name="password"><p></p>
		
		<input type="submit" value="submit">
		<input type="reset" value="clear">
	</form>
	</center>

</body>
</html>