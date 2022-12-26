<?php
	function child_rate($cat){ // 어린이 요금
		if ($cat == "입장권") $price = 13000;
		else if ($cat == "자유 이용권 주간") $price = 25000;
		else if ($cat == "자유 이용권 야간") $price = 22000;
		else $price = 22000;

		return $price;
	}
	function youth_rate($cat){ // 청소년 요금 함수
		if ($cat == "입장권") $price = 15000;
		else if ($cat == "자유 이용권 주간") $price = 28000;
		else if ($cat == "자유 이용권 야간") $price = 25000;
		else $price = 25000;

		return $price;
	}
	function adult_rate($cat){ // 성인 요금
		if ($cat == "입장권") $price = 18000;
		else if ($cat == "자유 이용권 주간") $price = 32000;
		else if ($cat == "자유 이용권 야간") $price = 29000;
		else $price = 29000;

		return $price;
	}

	$age = 2;
	$category = "자유 이용권 야간";
	// 구분: 입장권, 자유 이용권 주간, 자유 이용권 야간, 빅5 이용권

	if ($age >= 0 && $age <= 3) $fee = 0;
	else if ($age >= 4 && $age <= 10) $fee = child_rate($category);
	else if ($age >= 11 && $age <= 17) $fee = youth_rate($category);
	else $fee = adult_rate($category);

	echo "입장권 종류 : $category<br>";
	echo "입장객 나이 : $age<br>";
	echo "입장료 : {$fee}원";
?>