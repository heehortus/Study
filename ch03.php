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

	echo "<b>예제 3-9</b> <br>";
	//작은 것부터 정렬하기
	$a = 10;
	$b = 3;
	$c = 9;

	if ($a > $b)
	{
		if ($a > $c)
		{
			if($b > $c)
			{
				$min = $c;
				$mid = $b;
				$max = $a;
			}

			else //$b < $c
			{
				$min = $b;
				$mid = $c;
				$max = $a;
			}
		}

		else //$a < $c
		{
			if($b > $c)
			{
				$min = $a;
				$mid = $c;
				$max = $b;
			}

			else //$b < $c
			{
				$min = $b;
				$mid = $a;
				$max = $c;
			}
		}
	}

	else //$a < $b
	{
		if ($a > $c) //$c < $a < $b 
		{
			if($b > $c)
			{
				$min = $c;
				$mid = $a;
				$max = $b;
			}

			else //$a < $b < $c
			{
				$min = $a;
				$mid = $b;
				$max = $c;
			}
		}

		else //$a < $c
		{
			if($b > $c)	//$a < $c < $b
			{
				$min = $a;
				$mid = $c;
				$max = $b;
			}

			else //$a < $b < $c
			{
				$min = $a;
				$mid = $b;
				$max = $c;
			}
		}
	}

	echo "입력된 세 정수 : $a $b $c <br>";
	echo "입력된 정수를 작은 순서대로 배열 : $min $mid $max <br> <hr>";

	echo "<b>예제 3-10 </b> <br>";

	$now_year = 2022;
	$now_month = 9;
	$now_day = 15;

	$birth_year = 2000;
	$birth_month = 7;
	$birth_day = 27;

	if ($birth_month < $now_month)	//생일이 지나지 않음
	{
		$age = $now_year - $birth_year;
	}

	else if ($birth_month == $now_month)	//달이 똑같음
	{
		if($birth_day <= $now_day)
		{
			$age = $now_year - $birth_year;
		}

		else //생일이 지남
			$age = $now_year - $birth_year - 1;
	}

	else
	{	
		$age = $now_year - $birth_year - 1;
	}
	echo "오늘 날짜 : $now_year 년 $now_month 월 $now_day 일 <br>";
	echo "출생 연월일 : $birth_year 년 $birth_month 월 $birth_day 일 <br>";
	echo "만 나이 : $age <br> <hr>";

	
?>
