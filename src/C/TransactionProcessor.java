package C;

import java.util.Set;

import B.Client;
import B.ItemCategory;
import B.RentedItem;
import B.StockItem;

public class TransactionProcessor implements TransactionInterface {

	private Set<StockItem> a ;
	private Set<Client> b ;
	private Set <RentedItem> c;
	@Override
	public boolean checkOutItem(StockItem a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkInItem(RentedItem a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addStockItem(StockItem a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeStockItem(StockItem a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCategoryItem(ItemCategory a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeStockItem(ItemCategory a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addClient(Client client) {
		// TODO Auto-generated method stub
		return false;
		
	}

	public TransactionProcessor(Set<StockItem> a, Set<Client> b, Set<RentedItem> c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

}
