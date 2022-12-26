package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.util.List;
/* loaded from: classes4.dex */
public final class pw extends px {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final List f1222b;

    public pw(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, avb.o());
    }

    public pw(String str, pw pwVar, String str2, long j, int i, long j2, o oVar, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, pwVar, j, i, j2, oVar, str3, str4, j3, j4, z);
        this.a = str2;
        this.f1222b = avb.m(list);
    }
}
