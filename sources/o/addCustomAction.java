package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class addCustomAction implements IResultReceiver<Integer> {
    public static final addCustomAction ah$a = new addCustomAction();

    private addCustomAction() {
    }

    @Override // o.IResultReceiver
    /* renamed from: valueOf */
    public Integer ag$a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(createCustomActionBuilder.values(jsonReader) * f));
    }
}
