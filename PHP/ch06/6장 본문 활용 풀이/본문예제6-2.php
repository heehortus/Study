<h3>예제 6 - 2 활용</h3>
<?php
	$a = $_POST['a'];
	$b = $_POST['b'];

	function plus($a, $b)
	{
		$c = $a + $b;
		echo $c;
	}

	plus($a, $b);
	echo "<br>";
?>