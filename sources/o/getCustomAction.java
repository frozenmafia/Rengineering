package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class getCustomAction implements IResultReceiver<PointF> {
    public static final getCustomAction ah$a = new getCustomAction();

    private getCustomAction() {
    }

    @Override // o.IResultReceiver
    /* renamed from: toString */
    public PointF ag$a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token HaptikWebView = jsonReader.HaptikWebView();
        if (HaptikWebView == JsonReader.Token.BEGIN_ARRAY) {
            return createCustomActionBuilder.toString(jsonReader, f);
        }
        if (HaptikWebView == JsonReader.Token.BEGIN_OBJECT) {
            return createCustomActionBuilder.toString(jsonReader, f);
        }
        if (HaptikWebView == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.ah$b()) * f, ((float) jsonReader.ah$b()) * f);
            while (jsonReader.HaptikSDK$a()) {
                jsonReader.getSignupData();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + HaptikWebView);
    }
}
