<?php

	echo "<b>예제 4-4</b><br><br>";

	$i = 1;
	$count = 0;
	$sum = 0;

	while ($i <= 100)
	{
		if ($i % 3 != 0)
		{
			echo "$i ";
			$count++;
			$sum += $i;	//$sum = $sum + $i
		}

		if ($count % 10 == 0)	//10개씩 끊기
		{	
			echo "<br>";
		}

		$i++;
	}

	echo "<br> <br> 정수 1 ~ 100 중 3의 배수가 아닌 정수의 합 : $sum <br> <hr>";