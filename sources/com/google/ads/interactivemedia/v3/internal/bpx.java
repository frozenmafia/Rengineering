package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* loaded from: classes4.dex */
final class bpx implements Map.Entry {
    private final Map.Entry a;

    public final bpz a() {
        return (bpz) this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((bpz) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof bqq)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((bpz) this.a.getValue()).d((bqq) obj);
    }
}
