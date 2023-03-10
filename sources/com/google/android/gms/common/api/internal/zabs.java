package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import com.sendbird.android.constant.StringSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zabs {
    private final ApiKey zaa;
    private final Feature zab;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Feature zaa(zabs zabsVar) {
        return zabsVar.zab;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ ApiKey zab(zabs zabsVar) {
        return zabsVar.zaa;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zabs)) {
            return false;
        }
        zabs zabsVar = (zabs) obj;
        return Objects.equal(this.zaa, zabsVar.zaa) && Objects.equal(this.zab, zabsVar.zab);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.zab);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(StringSet.key, this.zaa).add("feature", this.zab).toString();
    }
}
