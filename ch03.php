<?php
	echo "<b>예제 3-4</b> <br>";

	$besu = 3;
	$num = 12;

	if($num % $besu == 0)
	{
		echo "$num : $besu"."의 배수이다. <br> <hr>";
	}

	else
	{
		echo "$num : $besu"."의 배수가 아니다. <br> <hr>";
	}

	echo "<b>예제 3-5</b> <br>";

	$level = 7;
	echo "회원 레벨 : $level <br>";

	if($level >= 1 and $level <= 7)
	{
		echo "로그인 가능합니다. <br> <hr>";
	}

	else
	{
		echo "로그인 불가능합니다. <br> <hr>";
	}

	echo "<b>bonus 문제</b> <br>";
	/*실기 시험 점수가 70점 이상이고 필기 시험 점수가 80점 이상일 때 합격, 이하일 때 불합격*/

	$score1 = 85;
	$score2 = 90;

	echo "실기 시험 점수는 $score1 점이고, ".
	"필기 시험 점수는 $score2 점입니다.<br>";

	if($score1 >= 70 and $score2 >= 80)
	{
		echo "합격입니다! <br> <hr>";
	}

	else
	{
		echo "불합격입니다. <br><hr>";
	}

	echo "<b>예제 3-8</b> <br>";

	$age = 13;

	$welfare = "no";
	$youkong = "yes";
	$night = "no";

	if($age < 3)
	{
		$fee = "무료";
	}

	else if (($age >= 3 && $age <= 13) || ($night == "yes"))
	{
		$fee = "4,000원";
	}

	//and : && 로 표기 or : || 로 표기 가능
	else if (($age >= 14 && $age <= 18) || ($age >= 70) || ($welfare == "yes") || ($youkong == "yes")) 
	{
		$fee = "8,000원";
	}

	else
	{
		$fee = "10,000원";
	}

	echo "복지 카드 소지 : $welfare <br>";
	echo "국가 유공자증 소지 : $youkong <br>";
	echo "17시 이후 입장 : $night <br>";
	echo "나이 : $age <br> <br>";
	echo "입장료 : $fee <br> <hr>";
?>