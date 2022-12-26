package com.google.ads.interactivemedia.v3.internal;

import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
final class ata implements Serializable, asz {
    private static final long serialVersionUID = 0;
    private final List a;

    @Override // com.google.ads.interactivemedia.v3.internal.asz
    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((asz) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ata) {
            return this.a.equals(((ata) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.a;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(StringSet.and);
        sb.append('(');
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
