<html>
<head>
<meta charset = "utf-8">
<style>
	ul
	{
		list-style: none;
	}
</style>
</head>
<body>
	<?php
		echo "<h3>예제 7-1,2</h3>";
		$name = $_POST["name"];
		echo $name."님 반갑습니다.<br><hr>";
	?>

	<?php
		echo "<h3>예제 7-3,4</h3>";
		$id = $_POST["id"];
		$pass = $_POST["pass"];
	?>

	<ul>
		<li>아&nbsp;이&nbsp;디&nbsp;&nbsp;: <?=$id?> </li>
		<li>비밀번호 : <?=$pass?> </li>
	</ul>
	<hr>

	<?php
		echo "<h3>예제 7-5,6</h3>";
		$content = $_POST["content"];
	?>

	<ul>
		<li>글 내용 : <?=$content?></li>
	</ul>
	<hr>

	<?php
		echo "<h3>예제 7-7,8</h3>";
		$gender = $_POST["gender"];
		$email_ok = $_POST["email_ok"];

		if ($email_ok == "예")
		{
			$email_ok = "수신";
		}

		else
			$email_ok = "비수신";
	?>

	<ul>
		<li>성별 : <?=$gender?></li>
		<li>이메일 : <?=$email_ok?></li>
	</ul>
	<hr>

	<?php
		echo "<h3>예제 7-9,10은 배열 문제라 제외</h3><hr>";
		echo "<h3>에제 7-11,12</h3>";
		$email1 = $_POST["email1"];
		$email2 = $_POST["email2"];
	?>

	<ul>
		<li>이메일 : <?php echo $email1."@".$email2; ?></li>
	</ul>
	<hr>

	<?php
		echo "<h3>예제 7-13</h3>";
		$userid = $_POST["userid"];
	?>

	<ul>
		<li>관리자 아이디 : <?= $userid ?></li>
	</ul>
	<hr>
</body>
</html>