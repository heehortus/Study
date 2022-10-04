<html>
<head>
<meta charset = "utf-8">
</head>
<body>
	<?php
		$name = $_POST["name"];

		$id = $_POST["id"];
		$pass = $_POST["pass"];
		$content = $_POST["content"];
		$gender = $_POST["gender"];
		$email_ok = $_POST["email_ok"];

		if ($name == "")
		{
			$name = "익명";
		}

		if ($email_ok == "예")
		{
			$email_ok = "수신";
		}

		else
			$email_ok = "비수신";

		$file_dir = "C:/xampp/htdocs/ch07/data/";
		$file_path = $file_dir.$_FILES["upload"]["name"];

		if (move_uploaded_file($_FILES["upload"]["tmp_name"], $file_path))
		{
			$img_path = "data/".$_FILES["upload"]["name"];
		}
		
		else
		{
			echo "&nbsp;&nbsp;&nbsp;파일 업로드 오류가 발생했습니다.";
		}
	?>

	<ul>
		<li><?=$name."님 반갑습니다."?></li><br>
		<li>아&nbsp;이&nbsp;디&nbsp;&nbsp;: <?=$id?> </li>
		<li>비밀번호 : <?=$pass?> </li>
		
	</ul>

	<ul>
		<li>글 내용 : <?=$content?></li>
	</ul>

	<ul>
		<li>성별 : <?=$gender?></li>
		<li>이메일 : <?=$email_ok?></li>
	</ul>

	<ul>
		<li>이미지 : <img src ="<?= $img_path?>" width="200px"></li>
		<li>설명 : <?=$_POST["comment"]?></li>
	</ul>
</body>
</html>