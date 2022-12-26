<?php
	//오늘 날짜와 생년월일에 따라 만 나이 계산
	$b_year	= $_POST['year'];
	$b_month = $_POST['month'];
	$b_day = $_POST['day'];

	//date 내장 함수 사용하여 현재 날짜 가져오기
	$year = date("Y");
	$month = date("m");
	$day = date("d");

	function man_age($year, $month, $day, $b_year, $b_month, $b_day)
	{
		if ($b_month < $month)	//생일 지남
		{
			$age = $year - $b_year;
		}

		else if ($b_month == $month)
		{
			if ($b_day < $day)	//생일 지남
				$age = $year - $b_year;
			else //생일 안 지남
				$age = $year - $b_year - 1;

		}

		else //생일 안 지남
		{
			$age = $year - $b_year - 1;
		}

		return $age;
	}
	
	$your_age = man_age($year, $month, $day, $b_year, $b_month, $b_day);

	echo "오늘 날짜 : $year 년 $month 월 $day 일<br>";
	echo "생년월일 : $b_year 년 $b_month 월 $b_day 일생<br>";
	echo "만 나이 : $your_age <br>";
	