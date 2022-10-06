<h3>예제 6 - 3 활용</h3>
<?php
	$a = $_POST['a'];
	$b = $_POST['b'];

	function plus($a, $b)
	{
		$c = $a + $b;
		return $c;
	}

	$result = plus($a, $b);
	echo $result."<br>";

?>