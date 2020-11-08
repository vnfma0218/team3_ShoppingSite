<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
index
<input type="button" id="sendAjax" value="send ajax">
</body>
<script>
document.getElementById('sendAjax').addEventListener('click', async e => {
	console.log('click')
//	const jsonData = { id: 'jack', pwd: '1234' }
//	const jsonData = { products: [{id: 'jack'}, {id: 'jack2'}] }
	const jsonData = [{id: 'jack'}, {id: 'jack2'}]
	const data = JSON.stringify(jsonData);
//	const data = 'id=jack';
	const res = await fetch('cart.do', {
	    method: 'POST',
	    headers: {
	      'Content-Type': 'application/json'
//	      'Content-Type': 'text/parameters'
	    },
	    redirect: 'follow',
	    referrerPolicy: 'no-referrer',
	    body: data
	  });
	console.log(res.status)
});
</script>
</html>