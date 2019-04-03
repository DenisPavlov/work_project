package links.jpoint;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContext extends GenericApplicationContext {

    public PropertyFileApplicationContext(String fileName) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
        int beadDefenitionCount = reader.loadBeanDefinitions(fileName);
        System.out.println("fount " + beadDefenitionCount + " beans");
        refresh();
    }

    public static void main(String[] args) {
        PropertyFileApplicationContext propertyFileApplicationContext = new PropertyFileApplicationContext("context.properties");
        propertyFileApplicationContext.getBean(Quoter.class).sayQuote();

    }
}
