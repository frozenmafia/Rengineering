package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bri extends brp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bri(int i) {
        super(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brp
    public final void a() {
        if (!j()) {
            for (int i = 0; i < b(); i++) {
                Map.Entry g = g(i);
                if (((bpa) g.getKey()).e()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((bpa) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
