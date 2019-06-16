package links.libs.gson;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Date;

/**
 * Адаптер для кастомной сериализации и десиарелизации
 */
public class CustomConverter implements JsonSerializer<Example.Custom>, JsonDeserializer<Example.Custom>  {
    public JsonElement serialize(Example.Custom src, Type type,
                                 JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("date", src.date.getTime());
        object.addProperty("integer", src.integer.toString());
        return object;
    }

    public Example.Custom deserialize(JsonElement json, Type type,
                                      JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = json.getAsJsonObject();
        Date date = new Date(object.get("date").getAsLong());
        BigInteger integer = new BigInteger(object.get("integer").getAsString());
        return new Example.Custom(date, integer);
    }
}
