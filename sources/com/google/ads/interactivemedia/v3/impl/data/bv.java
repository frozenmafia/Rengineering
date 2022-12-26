package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = am.class)
/* loaded from: classes4.dex */
public abstract class bv {
    public static bu builder() {
        return new ak();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean attached();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ay bounds();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String detailedReason();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean hidden();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract FriendlyObstructionPurpose purpose();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String type();
}
