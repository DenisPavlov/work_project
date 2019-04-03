package links.jpoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DeprecationHendlerBeanfactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            try {
                Class<?> beanClass = Class.forName(beanDefinition.getBeanClassName());
                DeprecatedClass annotation = beanClass.getAnnotation(DeprecatedClass.class);

                if (annotation != null) {
                    beanDefinition.setBeanClassName(annotation.newImpl().getName());
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
