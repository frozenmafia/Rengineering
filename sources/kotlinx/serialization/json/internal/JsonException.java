package kotlinx.serialization.json.internal;

import kotlinx.serialization.SerializationException;
import o.runAnimators;
/* loaded from: classes5.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        runAnimators.ag$a(str, "message");
    }
}
