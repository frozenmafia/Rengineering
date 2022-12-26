package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bow {
    final bqq a;

    /* renamed from: b  reason: collision with root package name */
    final bpj f920b;

    public bow() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bow(bqq bqqVar, bqq bqqVar2, bpj bpjVar) {
        this();
        if (bqqVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (bpjVar.c == bsg.MESSAGE && bqqVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = bqqVar2;
        this.f920b = bpjVar;
    }

    public final bsg a() {
        return this.f920b.c;
    }

    public final boolean b() {
        return this.f920b.d;
    }
}
