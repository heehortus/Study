<?php
	$name = '정희원';
	$phone_num = '010-####-####';
	$address = '서울여자대학교';
	$email = 'ruvi727@swu.ac.kr';
?>

<!DOCTYPE html>
<html>
<head>
	<meta charset ="UTF-8">
	<style>
		table {
			<!--스타일지정과 테두리는 없게-->
			border: solid black; border-collapse : collapse; width:40%;
		}

		td {
			padding: 3px; <!--약간 패딩-->
		}
	</style>
	<body>
	<table border = "1">
		<tr>
			<td>이름</td>
			<td>휴대폰 번호</td>
			<td>주소</td>
			<td>이메일</td>
		</tr>
		<tr>
			<td> <?=$name?> </td>	<!--약식 표현-->
			<td> <?=$phone_num?> </td>
			<td> <?=$address?> </td>
			<td> <?=$email?> </td>
		</tr>
	</table>
</body>
</head>
</html>