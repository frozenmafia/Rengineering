package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class setActions implements IResultReceiver<PointF> {
    public static final setActions ah$a = new setActions();

    private setActions() {
    }

    @Override // o.IResultReceiver
    /* renamed from: values */
    public PointF ag$a(JsonReader jsonReader, float f) throws IOException {
        return createCustomActionBuilder.toString(jsonReader, f);
    }
}
