class GoodStock {
	public String goodsCode;
	public int stockNum;
	void addStock(int amount) {
		stockNum += amount;
	}

	int substractStock(int amount) {
		if (stockNum < amount) 
			return 0;
		stockNum -= amount;
		return amount;
	}
}