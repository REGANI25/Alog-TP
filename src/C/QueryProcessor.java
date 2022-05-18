package C;

import java.util.Set;

import B.Client;
import B.RentedItem;
import B.StockItem;

public class QueryProcessor implements QueryInterface{
	private Set<StockItem> a ;
	private Set<Client> b ;
	private Set <RentedItem> c;
	@Override
	public Set<StockItem> getAllItems() {
		// TODO Auto-generated method stub
		return this.a;
	}

	@Override
	public Set<RentedItem> getRentedItems() {
		// TODO Auto-generated method stub
		return this.c;
	}

	@Override
	public Set<RentedItem> getRentedItemsByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float soldeClient(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<StockItem> overdueItems(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryProcessor(Set<StockItem> a, Set<Client> b, Set<RentedItem> c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
}
