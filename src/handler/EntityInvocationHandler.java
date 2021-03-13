package handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EntityInvocationHandler implements InvocationHandler
{
	private Object entityObject;

	public static Object getInstance(Class[] interfaces, Object entityObject)
	{
		return Proxy.newProxyInstance(EntityInvocationHandler.class.getClassLoader(), interfaces, new EntityInvocationHandler(entityObject));
	}

	public EntityInvocationHandler(Object entityObject)
	{
		this.entityObject = entityObject;
	}

	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Long startTime = System.currentTimeMillis();
		System.out.println("Inside Invocation Handler");

		Object result = method.invoke(entityObject, args);

//		Recursive call
//		Object result1 = method.invoke(proxy, args);

		Long endTime = System.currentTimeMillis();
		System.out.println("Invocation handler completed. Execution Time " + (endTime-startTime));
		return result;
	}
}
