<?php

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
?>