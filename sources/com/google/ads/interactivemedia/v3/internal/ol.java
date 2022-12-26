package com.google.ads.interactivemedia.v3.internal;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes4.dex */
final class ol extends LinkedHashMap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ol() {
        super(5, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
