package C;
import java.util.Set;

import B.StockItem;
import B.RentedItem;
import B.Client;

public interface QueryInterface {
public  Set<StockItem> getAllItems() ;
public  Set<RentedItem> getRentedItems();
public  Set<RentedItem> getRentedItemsByClient(Client client );
public float soldeClient(Client client);
public Set<StockItem> overdueItems(Client client);
}
