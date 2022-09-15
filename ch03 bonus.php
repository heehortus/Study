<?php
	$score1 = 85;
	$score2 = 90;

	echo "실기 시험 점수는 $score1 점이고, ".
	"필기 시험 점수는 $score2 점입니다.<br>";

	if($score1 >= 70 and $score2 >= 80)
	{
		echo "합격입니다! <br> <hr>";
	}

	else
	{
		echo "불합격입니다. <br><hr>";
	}
?>