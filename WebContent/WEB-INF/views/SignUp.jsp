<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up page</title>
=======
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
>>>>>>> f6fa83a0eea4f294321c96fd8368998a4f885e8f
</head>
<body>
	<form action="signUp.do">
	
		userID<input type="text" id="id" name="id"><br>
		P  W  D<input type="password" id="pwd" name="pwd"><br>
		N A M E<input type="text" id="name" name="name"><br>
		H     P<input type="text" id="hp" name="hp"><br>
		ADDRESS<input type="text" id="address" name="address"><br>
		C A R D<input type="text" id="card_num" name="card_num"><br>
		<p><input type="submit"></p>
	</form>

</body>
<script type="text/javascript">
fetch("SignUp.do",{
	method : "POST",
   	body : JSON.stringify({
           id : this.state.id,
      	   pwd : this.state.password,
      	   name : this.state.name,
      	   hp : this.state.hp,
      	   address : this.state.address,
           card_num : this.state.card_num
        })
})
.then(res => res.json())
.then(res => console.log(res))
</script>
</html>