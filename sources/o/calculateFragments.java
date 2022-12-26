package o;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes6.dex */
public class calculateFragments {
    public static String ah$a(ReadableMap readableMap) {
        if (readableMap == null || readableMap.getType("extraData") == ReadableType.Null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            JsonWriterHelper.value(jsonWriter, readableMap.getDynamic("extraData"));
            jsonWriter.close();
            stringWriter.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
