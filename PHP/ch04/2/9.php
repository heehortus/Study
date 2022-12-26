<?php
	echo "-------------------------------<br>";
	echo "평  제곱미터<br>";
	echo "-------------------------------<br>";

	for($pyeong = 10; $pyeong <= 200; $pyeong = $pyeong + 10)
	{
		$square_meter = $pyeong * 0.3025;
		echo "$pyeong $square_meter<br>";
	}

	echo "-------------------------------<br>";
?>