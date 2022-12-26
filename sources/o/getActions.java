package o;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class getActions implements IResultReceiver<Integer> {
    public static final getActions ag$a = new getActions();

    private getActions() {
    }

    @Override // o.IResultReceiver
    /* renamed from: toString */
    public Integer ag$a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.HaptikWebView() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.valueOf();
        }
        double ah$b = jsonReader.ah$b();
        double ah$b2 = jsonReader.ah$b();
        double ah$b3 = jsonReader.ah$b();
        double ah$b4 = jsonReader.HaptikWebView() == JsonReader.Token.NUMBER ? jsonReader.ah$b() : 1.0d;
        if (z) {
            jsonReader.ah$a();
        }
        if (ah$b <= 1.0d && ah$b2 <= 1.0d && ah$b3 <= 1.0d) {
            ah$b *= 255.0d;
            ah$b2 *= 255.0d;
            ah$b3 *= 255.0d;
            if (ah$b4 <= 1.0d) {
                ah$b4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) ah$b4, (int) ah$b, (int) ah$b2, (int) ah$b3));
    }
}
