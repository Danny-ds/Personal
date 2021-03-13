package customer;

public class CustomerBeanImpl implements CustomerBean
{
	@Override public String getCustomer(Long customerID) throws Exception
	{
		System.out.println("Inside Customer Implementation");
		Thread.sleep(100);
		return "Returning CustomerID "+ customerID;
	}

	public static CustomerBeanImpl getInstance()
	{
		return new CustomerBeanImpl();
	}
}
