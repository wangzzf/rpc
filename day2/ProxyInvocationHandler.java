import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class ProxyInvocationHandler implements InvocationHandler {

    private final Object target;

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("调用方法: " + method.getName());
        System.out.println("参数: " + args);
        System.out.println("代理对象: " + proxy.getClass().getName());

        // 在调用方法之前可以添加一些额外的逻辑
        System.out.println("调用方法之前执行的逻辑");

        // 调用被代理对象的方法
        Object result = method.invoke(proxy, args);


        // 在调用方法之后可以添加一些额外的逻辑
        System.out.println("调用方法之后执行的逻辑");
        return result;
    }
}
