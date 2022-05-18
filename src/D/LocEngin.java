package D;
import C.*;
import B.* ; 
import java.util.Set;

import B.Client;
import B.RentedItem;
import B.StockItem;

public class LocEngin {
	private Set<StockItem> articleEnstock ; 
	private Set<Client> clients ; 
	private Set<RentedItem> rentedItems  ;

	public Set<StockItem> getArticleEnstock() {
		return articleEnstock;
	}
	public void setArticleEnstock(Set<StockItem> articleEnstock) {
		this.articleEnstock = articleEnstock;
	}
	public Set<Client> getClients() {
		return clients;
	}
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	public Set<RentedItem> getRentedItems() {
		return rentedItems;
	}
	public void setRentedItems(Set<RentedItem> rentedItems) {
		this.rentedItems = rentedItems;
	}


	public LocEngin(Set<StockItem> articleEnstock, Set<Client> clients, Set<RentedItem> rentedItems) {
		super();
		this.articleEnstock = articleEnstock;
		this.clients = clients;
		this.rentedItems = rentedItems;
	} 

}


