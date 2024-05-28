import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandler {
    private final Object target;

    public InvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        // 在这里实现代理逻辑
        System.out.println("Before method invocation" + method.getName());

        Object result = null;
        try {
            // 调用目标对象的方法
            result = method.invoke(target, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("After method invocation" + method.getName());

        return result;
    }
}
