package C;
import B.*;
public interface TransactionInterface {
	public boolean checkOutItem(StockItem a);
	public boolean checkInItem(RentedItem a);
	public boolean addStockItem(StockItem a);
	public boolean removeStockItem(StockItem a);
	public boolean addCategoryItem(ItemCategory a );
	public boolean removeStockItem(ItemCategory a);
	public boolean addClient(Client client ) ; 
}
