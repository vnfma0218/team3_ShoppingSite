<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>

const registSellerBtn = document.getElementById('registSellerBtn')

registSellerBtn.addEventListener('click', async e => {
console.log('click')
const emailInput = document.getElementById('emailInput')
const registNumInput = document.getElementById('registNumInput')
const accountInput = document.getElementById('accountInput')

const json = {
 email: emailInput.value,
 registNum: registNumInput.value,
 account: accountInput.value
}
const data = JSON.stringify(json)
const res = await fetch('/team3_ShoppingSite/member/registSeller.ajax', {
 method: 'post',
 headers: {
   'Content-Type': 'application/json'
 },
 body: data
})
const status = res.status
const result = await res.text()
console.log(status +'  ' + result)

})

</script>
