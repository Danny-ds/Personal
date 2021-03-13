package invoice;

public interface InvoiceBean
{
	String getInvoice(Long invoiceID, Long customerID) throws Exception;
}
