public class EntityImpl implements EntityBean
{
	@Override public String getCustomer(Long customerID) throws Exception
	{
		System.out.println("Inside Customer Implementation");
		Thread.sleep(100);
		return "Returning CustomerID "+ customerID;
	}

	@Override public String getInvoice(Long invoiceID, Long customerID) throws Exception
	{
		System.out.println("Inside Invoice Implementation");
		Thread.sleep(100);
		return "Returning InvoiceID " + invoiceID + "CustomerID "+ customerID;
	}

	public static EntityImpl getInstance()
	{
		return new EntityImpl();
	}
}
