package C;

public interface TransactionInterface {
	public boolean checkOutItem(StockItem);
	public boolean checkInItem(RentedItem);
	public boolean addStockItem(StockItem);
	public boolean removeStockItem(StockItem);
	public boolean addCategoryItem(ItemCategory);
	public boolean removeStockItem(ItemCategory);
	public boolean addClient() ; 
}
