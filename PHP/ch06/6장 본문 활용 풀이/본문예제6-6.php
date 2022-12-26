<?php
	$category = $_POST['category'];
	$day_select = $_POST['day_select'];
	$age = $_POST['age'];

	if ($day_select == "주간")
	{
		$day = "주간";
	}

	else
		$day = "야간";

	function cal_fee1($day, $age)	//일반 이용권 요금 구하기
	{
		if ($day == "주간")
		{
			if ($age > 12 && $age < 65)
				$money = 26000;
			else
				$money = 19000;
		}

		else
		{
			if ($age > 12 && $age < 65)
				$money = 21000;
			else
				$money = 16000; 
		}

		return $money;
	}

	function cal_fee2($day, $age)	//자유 이용권 요금 구하기
	{
		if ($day == "주간")
		{
			if ($age > 12 && $age < 65)
				$money = 33000;
			else
				$money = 24000;
		}

		else
		{
			if ($age > 12 && $age < 65)
				$money = 28000;
			else
				$money = 21000; 
		}

		return $money;
	}

	function cal_fee3($age)	//2일 자유 이용권 요금 구하기
	{
		if ($age > 12 && $age < 65)
			$money = 55000;
		else
			$money = 40000;

		return $money;
	}

	function cal_fee4($age)	//콤비 요금 구하기
	{
		if ($age > 12 && $age < 65)
			$money = 54000;
		else
			$money = 40000;

		return $money;
	}

	if ($category == "일반 입장권")
		$fee = cal_fee1($day, $age);
	else if ($category == "자유 이용권")
		$fee = cal_fee2($day, $age);
	else if ($category == "2일 자유 이용권")
		$fee = cal_fee3($age);
	else
		$fee = cal_fee4($age);


	echo "- 구분 : $category <br>";

	if ($category == "일반 입장권" || $category == "자유 이용권")
	{
		echo "- 주/야간 : $day <br>";
	}

	echo "- 나이 : $age <br>";
	echo "- 입장료 : $fee 원";
?>