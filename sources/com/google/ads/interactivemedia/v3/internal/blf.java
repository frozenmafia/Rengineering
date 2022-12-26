package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
final class blf {
    final String a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f879b;
    final boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Field e;
    final /* synthetic */ boolean f;
    final /* synthetic */ bjf g;
    final /* synthetic */ bin h;
    final /* synthetic */ bna i;
    final /* synthetic */ boolean j;

    protected blf(String str, boolean z, boolean z2) {
        this.a = str;
        this.f879b = z;
        this.c = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public blf(String str, boolean z, boolean z2, boolean z3, Field field, boolean z4, bjf bjfVar, bin binVar, bna bnaVar, boolean z5) {
        this(str, z, z2);
        this.d = z3;
        this.e = field;
        this.f = z4;
        this.g = bjfVar;
        this.h = binVar;
        this.i = bnaVar;
        this.j = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bnc bncVar, Object obj) throws IOException, IllegalAccessException {
        Object read = this.g.read(bncVar);
        if (read == null && this.j) {
            return;
        }
        if (this.d) {
            blg.b(obj, this.e);
        }
        this.e.set(obj, read);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(bne bneVar, Object obj) throws IOException, IllegalAccessException {
        if (this.f879b) {
            if (this.d) {
                blg.b(obj, this.e);
            }
            Object obj2 = this.e.get(obj);
            if (obj2 == obj) {
                return;
            }
            bneVar.f(this.a);
            (this.f ? this.g : new blk(this.h, this.g, this.i.d())).write(bneVar, obj2);
        }
    }
}
