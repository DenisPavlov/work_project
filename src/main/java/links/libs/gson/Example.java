package links.libs.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Gson gson = new Gson();
        gson.toJson(123);               // 123
        gson.toJson("hello");           // "hello"
        gson.toJson(Long.valueOf(10));  // 10

        Integer integer = gson.fromJson("1", int.class);
        String string = gson.fromJson("\"world\"", String.class);
        Boolean bool = gson.fromJson("true", Boolean.class);

        String string1 = gson.toJson(new int[] { 10, 100 }); // [10,100]
        int[] array = gson.fromJson("[10,100]", int[].class);

        Entity entity = new Entity(100, "name");
        entity.random = 1234;

        String json = gson.toJson(entity); // {"id":100,"name":"name"}
        Entity read = gson.fromJson(json, Entity.class);
        //System.out.println(read.random);   // 0


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("USD", 123);
        map.put("EUR", 321);

        String json1 = gson.toJson(map); //{"USD":123,"EUR":321}

        Type type = new TypeToken<Map<String, Integer>>(){}.getType();
        Map<String, Integer> read1 = gson.fromJson(json1, type); //{USD=123, EUR=321}

        Collection collection = new ArrayList();
        collection.add("string");
        collection.add(10);
        collection.add(new Entity(11, "text"));
        gson.toJson(collection); // ["string",10,{"id":11,"name":"text"}]


        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Custom.class, new CustomConverter());
        Gson gson1 = builder.create();

    }

    public static class Entity {
        volatile int id;
        String name;
        transient long random;

        public Entity(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class Custom {
        Date date;
        BigInteger integer;

        public Custom(Date date, BigInteger integer) {
            this.date = date;
            this.integer = integer;
        }
    }

}
