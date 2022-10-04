<h3> 정수 순서대로 출력하기 </h3>
<?php

		$a = $_POST["a"];
		$b = $_POST["b"];

		if ($a >= $b)
		{

			for ($i = $a; $i >= $b; $i--)
			{
				echo "<b>$i </b><br>";
			}
		}



		else
		{
			for($i = $a; $i <= $b; $i++)
			{
				echo "<b>$i </b><br>";
			}
		}
?>