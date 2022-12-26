package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import o.containsPosition;
import o.findFirstPartiallyVisibleItemPosition;
import o.getStartLine;
/* loaded from: classes5.dex */
public class GeneratedMessageLite$ah$a<T extends GeneratedMessageLite<T, ?>> extends findFirstPartiallyVisibleItemPosition<T> {
    private final T ag$a;

    public GeneratedMessageLite$ah$a(T t) {
        this.ag$a = t;
    }

    @Override // o.globalToLocal
    /* renamed from: values */
    public T valueOf(getStartLine getstartline, containsPosition containsposition) throws InvalidProtocolBufferException {
        return (T) GeneratedMessageLite.ag$a(this.ag$a, getstartline, containsposition);
    }
}
