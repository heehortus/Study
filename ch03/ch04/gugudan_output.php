<h3> 구구단 표 만들기 </h3>
<table border="1" width="100">
<?php
		$dan = $_POST["dan"];
		$mer = 1;
		
		while ($mer <= 9)
		{
			$result = $dan * $mer;
			echo "<tr><td align='center'> $dan x $mer = $result </td></tr>";
			$mer++;
		}
?>
</table>