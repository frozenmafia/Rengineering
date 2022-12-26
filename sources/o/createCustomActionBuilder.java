package o;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class createCustomActionBuilder {
    private static final JsonReader.values valueOf = JsonReader.values.toString("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ag$a(JsonReader jsonReader) throws IOException {
        jsonReader.valueOf();
        int ah$b = (int) (jsonReader.ah$b() * 255.0d);
        int ah$b2 = (int) (jsonReader.ah$b() * 255.0d);
        int ah$b3 = (int) (jsonReader.ah$b() * 255.0d);
        while (jsonReader.HaptikSDK$a()) {
            jsonReader.getSignupData();
        }
        jsonReader.ah$a();
        return Color.argb(255, ah$b, ah$b2, ah$b3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> valueOf(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.valueOf();
        while (jsonReader.HaptikWebView() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.valueOf();
            arrayList.add(toString(jsonReader, f));
            jsonReader.ah$a();
        }
        jsonReader.ah$a();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.createCustomActionBuilder$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            valueOf = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF toString(JsonReader jsonReader, float f) throws IOException {
        int i = AnonymousClass4.valueOf[jsonReader.HaptikWebView().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return values(jsonReader, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.HaptikWebView());
            }
            return ag$a(jsonReader, f);
        }
        return ah$a(jsonReader, f);
    }

    private static PointF ah$a(JsonReader jsonReader, float f) throws IOException {
        float ah$b = (float) jsonReader.ah$b();
        float ah$b2 = (float) jsonReader.ah$b();
        while (jsonReader.HaptikSDK$a()) {
            jsonReader.getSignupData();
        }
        return new PointF(ah$b * f, ah$b2 * f);
    }

    private static PointF ag$a(JsonReader jsonReader, float f) throws IOException {
        jsonReader.valueOf();
        float ah$b = (float) jsonReader.ah$b();
        float ah$b2 = (float) jsonReader.ah$b();
        while (jsonReader.HaptikWebView() != JsonReader.Token.END_ARRAY) {
            jsonReader.getSignupData();
        }
        jsonReader.ah$a();
        return new PointF(ah$b * f, ah$b2 * f);
    }

    private static PointF values(JsonReader jsonReader, float f) throws IOException {
        jsonReader.values();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.HaptikSDK$a()) {
            int valueOf2 = jsonReader.valueOf(valueOf);
            if (valueOf2 == 0) {
                f2 = values(jsonReader);
            } else if (valueOf2 == 1) {
                f3 = values(jsonReader);
            } else {
                jsonReader.HaptikSDK$e();
                jsonReader.getSignupData();
            }
        }
        jsonReader.ag$a();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float values(JsonReader jsonReader) throws IOException {
        JsonReader.Token HaptikWebView = jsonReader.HaptikWebView();
        int i = AnonymousClass4.valueOf[HaptikWebView.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.valueOf();
                float ah$b = (float) jsonReader.ah$b();
                while (jsonReader.HaptikSDK$a()) {
                    jsonReader.getSignupData();
                }
                jsonReader.ah$a();
                return ah$b;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + HaptikWebView);
        }
        return (float) jsonReader.ah$b();
    }
}
