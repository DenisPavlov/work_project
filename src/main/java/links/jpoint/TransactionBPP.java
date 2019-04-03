package links.jpoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TransactionBPP implements BeanPostProcessor {
    private Map<String, Class> map = new HashMap<>();

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(Transactonal.class)) {
            map.put(beanName, beanClass);
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class beanClass = map.get(beanName);
        if (beanClass != null) {
            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(),
                    (o, method, objects) -> {
                        System.out.println("*******TRANS OPEN*******");
                        Object retVal = method.invoke(bean, objects);
                        System.out.println("*******TRANS CLOSE*******");
                        return retVal;
                    });
        }

        return bean;
    }
}
