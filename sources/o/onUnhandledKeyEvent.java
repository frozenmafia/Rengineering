package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;
import java.util.Arrays;
import o.ViewCompat;
/* loaded from: classes3.dex */
public abstract class onUnhandledKeyEvent {
    public static final boolean[] valueOf = new boolean[0];
    public static final JsonReader.values<Boolean> toString = new JsonReader.values<Boolean>() { // from class: o.onUnhandledKeyEvent.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ag$a */
        public Boolean toString(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(onUnhandledKeyEvent.ah$a(jsonReader));
        }
    };
    public static final JsonReader.values<Boolean> ag$a = new JsonReader.values<Boolean>() { // from class: o.onUnhandledKeyEvent.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: values */
        public Boolean toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            return Boolean.valueOf(onUnhandledKeyEvent.ah$a(jsonReader));
        }
    };
    public static final ViewCompat.Api31Impl.toString<Boolean> HaptikSDK$a = new ViewCompat.Api31Impl.toString<Boolean>() { // from class: o.onUnhandledKeyEvent.1
    };
    public static final JsonReader.values<boolean[]> ah$a = new JsonReader.values<boolean[]>() { // from class: o.onUnhandledKeyEvent.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.values
        /* renamed from: ag$a */
        public boolean[] toString(JsonReader jsonReader) throws IOException {
            if (jsonReader.aj$a()) {
                return null;
            }
            if (jsonReader.HaptikSDK$a() != 91) {
                throw jsonReader.valueOf("Expecting '[' for boolean array start");
            }
            jsonReader.ah$a();
            return onUnhandledKeyEvent.valueOf(jsonReader);
        }
    };
    public static final ViewCompat.Api31Impl.toString<boolean[]> values = new ViewCompat.Api31Impl.toString<boolean[]>() { // from class: o.onUnhandledKeyEvent.5
    };

    public static boolean ah$a(JsonReader jsonReader) throws IOException {
        if (jsonReader.ak()) {
            return true;
        }
        if (jsonReader.a()) {
            return false;
        }
        throw jsonReader.ag$a("Found invalid boolean value", 0);
    }

    public static boolean[] valueOf(JsonReader jsonReader) throws IOException {
        if (jsonReader.HaptikSDK$a() == 93) {
            return valueOf;
        }
        boolean[] zArr = new boolean[4];
        zArr[0] = ah$a(jsonReader);
        int i = 1;
        while (jsonReader.ah$a() == 44) {
            jsonReader.ah$a();
            if (i == zArr.length) {
                zArr = Arrays.copyOf(zArr, zArr.length << 1);
            }
            zArr[i] = ah$a(jsonReader);
            i++;
        }
        jsonReader.values();
        return Arrays.copyOf(zArr, i);
    }
}
