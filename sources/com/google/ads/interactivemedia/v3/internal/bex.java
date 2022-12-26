package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
public final class bex {
    private final bes a;

    /* renamed from: b  reason: collision with root package name */
    private final List f818b;
    private final Integer c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bex(bes besVar, List list, Integer num) {
        this.a = besVar;
        this.f818b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bex) {
            bex bexVar = (bex) obj;
            if (this.a.equals(bexVar.a) && this.f818b.equals(bexVar.f818b)) {
                Integer num = this.c;
                Integer num2 = bexVar.c;
                if (num == num2) {
                    return true;
                }
                if (num != null && num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f818b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.f818b, this.c);
    }
}
