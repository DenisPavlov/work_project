package answers.reflection;

import java.lang.reflect.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        MyClass mc = new MyClass();
//        Class clazz = mc.getClass();
//        System.out.println(clazz);

//        Class aclass = MyClass.class;
//        Class iclass = Integer.class;
//        System.out.println(aclass);
//        System.out.println(iclass);

//        Class c = Class.forName("java.lang.String");
//        String name = c.getName();
//        System.out.println(c);

//        Integer i = new Integer(10);
//        Class ic = i.getClass();
//        System.out.println(ic.getName());

        //Модификаторы класса
//        Class c =  Class.forName("java.lang.String");
//        int mods = c.getModifiers();
//        if (Modifier.isPublic(mods)) {
//            System.out.println("public");
//        }
//        if (Modifier.isAbstract(mods)) {
//            System.out.println("abstract");
//        }
//        if (Modifier.isFinal(mods)) {
//            System.out.println("final");
//        }

        //Нахождение суперклассов
//        Class c =  Class.forName("java.lang.Integer");
//        Class sc = c.getSuperclass();
//        System.out.println(sc); //class java.lang.Number

        //Определение интерфейсов класса
//        Class c = LinkedList.class;
//        Class[] cc = c.getInterfaces();
//        for (Class aClass : cc) {
//            System.out.println(aClass);
//        }

        //Исследование, получение и установка значений полей класса
//        Class c = MyClass.class;
//        Field[] fields = c.getFields();
//
//        for (Field field : fields) {
//            Class fieldType = field.getType();
//            System.out.println("Имя: " + field.getName());
//            System.out.println("Тип: " + fieldType.getName());
//        }
//
//        Field field = c.getField("name");
//        System.out.println(field.getType());

//        MyClass mc = new MyClass(10, "Denis");
//        Class c = MyClass.class;
//        Field f = c.getDeclaredField("name");
//        try {
//             String s = (String) f.get(mc);
//             System.out.println(s);
//            f.set(mc, "Anna");
//            System.out.println(mc.name);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        //Исследование конструкторов
//        Class c = MyClass.class;
//        Constructor[] constructors = c.getConstructors();
//
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor + " : ");
//            Class[] paramTypes = constructor.getParameterTypes();
//            for (Class paramType : paramTypes) {
//                System.out.print(paramType.getName() + " ");
//            }
//            System.out.println();
//        }

        //Исследование информации о методе, вызов метода
//        Class c = MyClass.class;
//        Method[] methods = c.getMethods();
//
//        for (Method method : methods) {
//            System.out.println("Имя: " + method.getName());
//            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());
//
//            Class[] paramTypes = method.getParameterTypes();
//            System.out.print("Типы параметров: ");
//            for (Class paramType : paramTypes) {
//                System.out.print(" " + paramType.getName());
//            }
//            System.out.println();
//        }
//
//        MyClass mc = new MyClass(1, "Denis");
//        Class c = MyClass.class;
//        Class[] paramTypes = new Class[] { String.class, int.class };
//        Method method = null;
//        try {
//            method = c.getMethod("doubleSet", String.class, int.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        Object[] argss = new Object[] { new String("Anna"), new Integer(2) };
//        try {
//            Integer d = (Integer) method.invoke(mc, argss);
//            System.out.println(mc.getName());
//            System.out.println(d);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        //Загрузка и динамическое создание экземпляра класса
        Class c = Class.forName("answers.reflection.MyClass");
        Object obj = null;
        try {
            obj = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        MyClass test = (MyClass) obj;
    }
}
