package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class getErrorMessage implements IResultReceiver<Float> {
    public static final getErrorMessage toString = new getErrorMessage();

    private getErrorMessage() {
    }

    @Override // o.IResultReceiver
    /* renamed from: values */
    public Float ag$a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(createCustomActionBuilder.values(jsonReader) * f);
    }
}
