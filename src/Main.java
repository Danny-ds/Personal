import customer.CustomerBean;
import customer.CustomerBeanImpl;
import handler.EntityInvocationHandler;
import invoice.InvoiceBean;
import invoice.InvoiceBeanImpl;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		//Customer Invocation
		Long customerID = 123l;
		System.out.println("Customer Implementation Invocation....");
		CustomerBean customerBean = (CustomerBean) EntityInvocationHandler.getInstance(new Class[] {CustomerBean.class}, CustomerBeanImpl.getInstance());
		System.out.println(customerBean.getCustomer(customerID) + "\n");

		//Invoice invocation
		Long invoiceID = 456l;
		System.out.println("Invoice Implementation Invocation...");
		InvoiceBean invoiceBean = (InvoiceBean) EntityInvocationHandler.getInstance(new Class[] {InvoiceBean.class}, InvoiceBeanImpl.getInstance());
		System.out.println(invoiceBean.getInvoice(invoiceID, customerID) + "\n");

		//Multiple Bean
		System.out.println("Invoice and Customer Implementation Invocation...");
		EntityBean entityBean = (EntityBean) EntityInvocationHandler.getInstance(new Class[]{EntityBean.class}, EntityImpl.getInstance());
		entityBean.getInvoice(invoiceID, customerID);
		entityBean.getCustomer(customerID);
	}
}
