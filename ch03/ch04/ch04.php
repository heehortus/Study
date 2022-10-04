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

	echo "<b>예제 4-5</b><br>";

	$inch = 10;

	echo
	"<head>
	<style>
		.table
		{
			border : 5px solid pink;
			width: 200;
		}
	</style>
	</head>";
	echo "<div class='table'>";
	echo "<table border ='1'>";
	echo "<tr>";
	echo "<th width = '100'>인치</th><th width = '100'>센티미터</th>";
	echo "</tr>";

	while ($inch <= 100)
	{
		$cm = $inch * 2.54;
		echo "<tr align = 'center'><td>$inch</td> <td>$cm</td></tr>";

		$inch = $inch + 10;
	}

	echo "</table>"
?>