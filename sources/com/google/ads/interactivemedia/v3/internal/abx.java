package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
final class abx extends abz {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final List f453b;
    public final List c;

    public abx(int i, long j) {
        super(i);
        this.a = j;
        this.f453b = new ArrayList();
        this.c = new ArrayList();
    }

    public final abx a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            abx abxVar = (abx) this.c.get(i2);
            if (abxVar.d == i) {
                return abxVar;
            }
        }
        return null;
    }

    public final aby b(int i) {
        int size = this.f453b.size();
        for (int i2 = 0; i2 < size; i2++) {
            aby abyVar = (aby) this.f453b.get(i2);
            if (abyVar.d == i) {
                return abyVar;
            }
        }
        return null;
    }

    public final void c(abx abxVar) {
        this.c.add(abxVar);
    }

    public final void d(aby abyVar) {
        this.f453b.add(abyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abz
    public final String toString() {
        String g = g(this.d);
        String arrays = Arrays.toString(this.f453b.toArray());
        String arrays2 = Arrays.toString(this.c.toArray());
        return g + " leaves: " + arrays + " containers: " + arrays2;
    }
}
