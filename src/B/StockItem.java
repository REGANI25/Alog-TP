package B;

public class StockItem implements StockItemInterface{
private int  codeEquip ; 
private String stat ;
public int getCodeEquip() {
	return codeEquip;
}
public void setCodeEquip(int codeEquip) {
	this.codeEquip = codeEquip;
}
public String getStat() {
	return stat;
}
public void setStat(String stat) {
	this.stat = stat;
}

public StockItem(int codeEquip, String stat) {
	super();
	this.codeEquip = codeEquip;
	this.stat = stat;
}


}
