package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public class px implements Comparable {
    public final String c;
    public final pw d;
    public final long e;
    public final int f;
    public final long g;
    public final o h;
    public final String i;
    public final String j;
    public final long k;
    public final long l;
    public final boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ px(String str, pw pwVar, long j, int i, long j2, o oVar, String str2, String str3, long j3, long j4, boolean z) {
        this.c = str;
        this.d = pwVar;
        this.e = j;
        this.f = i;
        this.g = j2;
        this.h = oVar;
        this.i = str2;
        this.j = str3;
        this.k = j3;
        this.l = j4;
        this.m = z;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.g > l.longValue()) {
            return 1;
        }
        return this.g >= l.longValue() ? 0 : -1;
    }
}
