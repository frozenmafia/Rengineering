package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes4.dex */
public final class bev {
    private ArrayList a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private bes f816b = bes.a;
    private Integer c = null;

    public final bex a() throws GeneralSecurityException {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((bew) arrayList.get(i)).a() != intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        bex bexVar = new bex(this.f816b, Collections.unmodifiableList(this.a), this.c);
        this.a = null;
        return bexVar;
    }

    public final void b(bes besVar) {
        if (this.a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f816b = besVar;
    }

    public final void c(int i) {
        if (this.a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.c = Integer.valueOf(i);
    }

    public final void d(azo azoVar, int i, aza azaVar) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new bew(azoVar, i, azaVar, null));
    }
}
