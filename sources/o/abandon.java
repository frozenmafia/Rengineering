package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
/* loaded from: classes6.dex */
public class abandon {
    protected final Object values;

    private abandon(Object obj) {
        this.values = obj;
    }

    public static abandon values(JsonParser jsonParser) {
        return new abandon(jsonParser);
    }

    public static abandon values(JsonGenerator jsonGenerator) {
        return new abandon(jsonGenerator);
    }
}
