package com.google.ads.interactivemedia.v3.internal;

import java.util.UUID;
/* loaded from: classes4.dex */
public final /* synthetic */ class nz {
    public static final /* synthetic */ nz a = new nz();

    private /* synthetic */ nz() {
    }

    public final nx a(UUID uuid) {
        try {
            return oc.o(uuid);
        } catch (oh unused) {
            String valueOf = String.valueOf(uuid);
            cc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + valueOf + ".");
            return new nu();
        }
    }
}
