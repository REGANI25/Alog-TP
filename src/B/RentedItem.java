package B;

import java.util.Date;

public class RentedItem implements RentedItemInterface {
	private Date dueDate ;

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public RentedItem(Date dueDate) {
		super();
		this.dueDate = dueDate;
	}

	
			
}
