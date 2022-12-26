<html>
<head>
	<meta charset="utf-8">
</head>
<style>
	table
	{
		border-collapse: collapse;
		width: 600px;
	}	

	td
	{
		border: solid 1px gray;
		text-align: center;
		padding: 5px;
	}	
</style>
<body>
	<h3>예제 4 - 10 배수가 아닌 것 나열 활용 </h3>
	<?php
		$num = $_POST["num"];
		$first = $_POST["first"];
		$last = $_POST["last"];
		$count = 0;
		$ok = true;

		for($i = $first; $i <= $last; $i++)
		{
			if($i % $num != 0)
			{
				echo $i." ";
				$count++;
				$ok = true;
			}

			if($count != 0 && $count % 10 == 0 && $ok == true)
			{
			echo "<br>";
			$ok = false;
			}
		}
	?>
	<br><br><hr>

	<h3>예제 4 - 11 섭씨 화씨 활용 </h3>

	<h3>예제 4 - 13 구구단 활용</h3>
	<table>
		<?php


			for ($i = 2; $i <= 9; $i++)
			{
				echo "<tr align='center'><td width='150'>$i 단</td>";

				for ($j = 1; $j <= 9; $j++)
				{
					$c = $i * $j;
					echo "<td>{$i}x{$j}=$c</td>";
				}

				echo "<tr>";
			}
		?>
	</table>

	<h3>예제 4 - 15 별표 출력 활용</h3>
	<?php
		for ($a = 1; $a <= 10; $a++)
		{
			for ($b = 9; $b >= $a; $b--)
				echo "/^&nbsp;&nbsp;";

			for($c = 1; $c <= $a; $c++)
				echo "*";

			echo "<br>";
		}
	?>
</html>