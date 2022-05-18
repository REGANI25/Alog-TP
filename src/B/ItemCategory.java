package B;

public class ItemCategory implements ItemCategoryInterface{
private int idcat ; 
private String designation ; 
private String marque ;


public ItemCategory(int idcat, String designation, String marque) {
	super();
	this.idcat = idcat;
	this.designation = designation;
	this.marque = marque;
}

public int getIdcat() {
	return idcat;
}
public void setIdcat(int idcat) {
	this.idcat = idcat;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}

	

}
