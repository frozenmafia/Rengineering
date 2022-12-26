package o;

import com.apollographql.apollo.api.internal.json.JsonReader;
import java.io.IOException;
import o.R;
/* loaded from: classes6.dex */
public final class resultCodeToString extends R.drawable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resultCodeToString(JsonReader jsonReader) {
        super(jsonReader);
        runAnimators.valueOf(jsonReader, "jsonReader");
    }

    @Override // o.R.drawable
    public Object ag$a(boolean z) throws IOException {
        Object ag$a = super.ag$a(z);
        if (ag$a instanceof String) {
            String str = (String) ag$a;
            return ContextAwareHelper.valueOf.ah$a(str) ? ContextAwareHelper.valueOf.toString(str) : ag$a;
        }
        return ag$a;
    }
}
