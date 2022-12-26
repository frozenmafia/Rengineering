package kotlinx.serialization;

import o.runAnimators;
/* loaded from: classes5.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(String str) {
        super(str);
    }

    public UnknownFieldException(int i) {
        this(runAnimators.values("An unknown field for index ", (Object) Integer.valueOf(i)));
    }
}
