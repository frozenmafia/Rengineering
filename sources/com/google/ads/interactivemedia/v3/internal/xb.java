package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
/* loaded from: classes4.dex */
public final /* synthetic */ class xb implements Comparator {
    private final /* synthetic */ int c;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ xb f1338b = new xb(1);
    public static final /* synthetic */ xb a = new xb(0);

    private /* synthetic */ xb(int i) {
        this.c = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.c == 0) {
            return Float.compare(((xc) obj).c, ((xc) obj2).c);
        }
        return ((xc) obj).a - ((xc) obj2).a;
    }
}
