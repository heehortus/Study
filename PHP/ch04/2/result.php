
<h3>예제 4 - 8 활용 </h3>
<?php

	$num1 = $_POST['num1'];
	$num2 = $_POST['num2'];
	$sum = 0;
	
	for ($i = $num1; $i <= $num2; $i++)
	{
		$sum += $i;
	}

	echo "{$num1}에서 {$num2}까지 정수의 합은 $sum 입니다. <br>";
?>


<h3>예제 4 - 10 배수가 아닌 것 나열 활용 </h3>
<?php
	$num3 = $_POST["num3"];
	$first = $_POST["first"];
	$last = $_POST["last"];
	$count = 0;
	$ok = true;

	for($i = $first; $i <= $last; $i++)
	{
		if ($i % $num3 != 0)
		{
			echo "$i ";
			$count++;
			$ok = true;
		}

		if ($count != 0 && $count % 10 == 0 && $ok == true)
		{
			echo "<br>";
			$ok = false;
		}

	}
?>

<h3>예제 4 - 11 섭씨를 화씨로 변환 활용 </h3>
<table border="1" width="300">
	<tr align ="center"><td width="150">섭씨</td><td width="150">화씨</td></tr>
	<?php
		$c1 = $_POST["c1"];
		$c2 = $_POST["c2"];
		$range = $_POST["range"];

		for($j = $c1; $j <= $c2; $j = $j + $range)
		{
			$f = $j * 9 / 5 + 32;
			echo "<tr align='center'><td>$j</td><td>$f</td></tr>";
		}
	?>
</table>

<h3>예제 4 - 13 구구단 활용</h3>
	<table style="border-collapse: collapse; width: 700px;">
		<?php
			for ($i = 2; $i <= 9; $i++)
			{
				echo "<tr align='center'><td style='border: solid 1px gray; text-align:center; padding:5px;' width='50'>$i 단</td>";

				for ($j = 1; $j <= 9; $j++)
				{
					$c = $i * $j;
					echo "<td style='border: solid 1px gray; text-align:center; padding:5px;'>{$i}x{$j}=$c</td>";
				}

				echo "<tr>";
			}
		?>
	</table>

<h3>예제 4 - 15 별표 출력 활용</h3>
	<?php
		for ($a = 1; $a <= 10; $a++)
		{
			for ($b = 10; $b >= $a; $b--)
			{	
				echo " ";	//nbsp 간격 일정치 않아서 초기화해줘야함
			}

			for($c = 1; $c <= $a; $c++)
			{
				echo "*";
			}
			echo "<br>";
		}

		echo "<br>";

		for ($a = 1; $a <= 10; $a++)	//거꾸로
		{
			for($b = 1; $b <= $a; $b++)
				echo " ";
		
			for($c = 10; $c >= $a; $c--)
				echo "*";

			echo "<br>";
		}
	?>

<h3>임의의 수 받아 정렬</h3>
<?php

	$count = count($_POST['num']);
	$num = $_POST['num'];

	echo "정렬 전 : ";
	
	for ($i = $count - 2; $i >= 0; $i--)
	{
		for ($j = 0; $j <= $i; $j++)
		{
			if($num[$j]> $num[$j+1])
			{
				$tmp = $num[$j];
				$num[$j] = $num[$j + 1];
				$num[$j + 1] = $tmp;

				for ($a = 0; $a < $count; $a++)
				{
					echo $num[$a]." ";
				}

				echo "<br>";

			}
		}
	}

	echo "버블 정렬(오름차순) 후 : ";

	for ($a = 0; $a < $count; $a++)
	{
		echo $num[$a]." ";
	}

?>