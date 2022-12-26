package kotlinx.serialization.json.internal;

import o.runAnimators;
/* loaded from: classes5.dex */
public final class JsonDecodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(String str) {
        super(str);
        runAnimators.ag$a(str, "message");
    }
}
