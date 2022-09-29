<h3>array() 이용하여 성적 합계와 평균 구하기</h3>
<?php
	$scores = array(87,76,98,87,87,93,79,85,88,63,74,84,93,89,63,99,81,70,80,95);
	$sum = 0;

	for ($a = 0; $a < 20; $a++)
	{
		$sum = $sum + $scores[$a];
	}

	$avg = $sum/20;

	echo ("합계: $sum, 평균: $avg <br>");



	//a, b, c 를 활용하여 구구단 저장하고
	//임의의 값을 입력하면 불러오기 

	?>

<?php

	$count = count($_POST['num']);

	echo "정렬 전 : ";

	for ($a = 0; $a < $count; $a++)
	{
		$array[$a] = $_POST['num'][$a];
		echo $array[$a]." ";
	}

	echo "<br>";

	for ($i = $count - 2; $i >= 0; $i--)
	{
		for ($j = 0; $j <= $i; $j++)
		{
			if($array[$j]> $array[$j + 1])
			{
				$tmp = $array[$j];
				$array[$j] = $array[$j + 1];
				$array[$j + 1] = $tmp;

				for ($a = 0; $a < $count; $a++)
				{
					echo $array[$a]." ";
				}

				echo "<br>";

			}
		}
	}

	echo "버블 정렬(오름차순) 후 : ";

	for ($a = 0; $a < $count; $a++)
	{
		echo $array[$a]." ";
	}

	echo "<br>------------------------------<br>";

	$num = $_POST['num'];

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
		echo $array[$a]." ";
	}

?>