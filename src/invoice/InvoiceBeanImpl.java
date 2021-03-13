package invoice;

public class InvoiceBeanImpl implements InvoiceBean
{
	@Override public String getInvoice(Long invoiceID, Long customerID) throws Exception
	{
		System.out.println("Inside Invoice Implementation");
		Thread.sleep(100);
		return "Returning InvoiceID " + invoiceID + "CustomerID "+ customerID;
	}

	public static InvoiceBeanImpl getInstance()
	{
		return new InvoiceBeanImpl();
	}
}
