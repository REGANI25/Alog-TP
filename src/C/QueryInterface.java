package C;

public interface QueryInterface {
public Set<StockItem>  getAllItems() ;
public Set<RentedItem> getRentedItems();
public Set<RentedItem> getRentedItemsByClient();
public float soldeClient();
public set<StockItem> overdueItems();
}
