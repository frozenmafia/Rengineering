package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public abstract class aho extends ahp {
    protected final HashSet a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f562b;
    protected final long c;

    public aho(aln alnVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(alnVar, null);
        this.a = new HashSet(hashSet);
        this.f562b = jSONObject;
        this.c = j;
    }
}
