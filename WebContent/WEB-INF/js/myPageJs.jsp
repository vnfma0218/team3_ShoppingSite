<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>


const pwdToggleBtn = document.getElementById('pwdToggleBtn')

let changePwd = false;

pwdToggleBtn.addEventListener('click', e => {
  changePwd = !changePwd
  console.log(changePwd)
})


</script>
