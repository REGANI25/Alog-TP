package D;

import java.util.*;	

import B.Client;
import B.StockItem;
import C.QueryProcessor;
import C.TransactionProcessor;

public class main{
public static void main(String[] args) {
	
	 Set<StockItem> articleEnstock = new HashSet<StockItem>()  ; 
	 StockItem a = new StockItem(0, null) ; 
	 StockItem b = new StockItem(0, null) ; 
	 StockItem c = new StockItem(0, null) ; 
	 StockItem d = new StockItem(0, null) ; 
	 StockItem e = new StockItem(0, null) ; 

	 
	 articleEnstock.add(a) ; 
	 articleEnstock.add(b) ; 
	 articleEnstock.add(c) ; 
	 articleEnstock.add(d) ; 
	 articleEnstock.add(e) ; 

	 
	LocEngin l = new LocEngin(null, null, null) ;
	TransactionProcessor t = new TransactionProcessor(articleEnstock,Client) ; 
	QueryProcessor q = new QueryProcessor() ;
	Client c1 = new Client(0, null, 0) ; 
	Client c2 = new Client(0, null, 0) ; 
	
	
	
}
}
