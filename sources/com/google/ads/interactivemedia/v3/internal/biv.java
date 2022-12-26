package com.google.ads.interactivemedia.v3.internal;

import java.util.Set;
/* loaded from: classes4.dex */
public final class biv extends bis {
    private final bke a = new bke();

    public final Set a() {
        return this.a.entrySet();
    }

    public final void b(String str, bis bisVar) {
        this.a.put(str, bisVar);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof biv) && ((biv) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
