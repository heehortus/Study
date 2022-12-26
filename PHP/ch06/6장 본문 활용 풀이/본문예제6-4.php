<?php
	//sum함수
	$a = $_POST['a'];
	$b = $_POST['b'];

	function sum($a, $b)
	{
		$sum = 0;

		while ($a <= $b)	//임의의 값 a가 b보다 작거나 클 경우
		{
			$sum = $sum + $a;
			$a++;
		}

		while ($a > $b)	//임의의 값 a가 b보다 클 경우
		{
			$sum = $sum + $b;
			$b++;
		}

		return $sum;
	}

	
	$total = sum($a, $b);
	
	if ($a <= $b)
		echo ("$a 에서 $b 까지의 합 : $total");

	else
		echo ("$b 에서 $a 까지의 합 : $total");