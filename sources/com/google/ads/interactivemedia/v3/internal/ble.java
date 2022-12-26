package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ble<T> extends bjf<T> {
    private final bkf a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f878b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ble(bkf bkfVar, Map map) {
        this.a = bkfVar;
        this.f878b = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final T read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        T t = (T) this.a.a();
        try {
            bncVar.j();
            while (bncVar.p()) {
                blf blfVar = (blf) this.f878b.get(bncVar.g());
                if (blfVar != null && blfVar.c) {
                    blfVar.a(bncVar, t);
                }
                bncVar.o();
            }
            bncVar.l();
            return t;
        } catch (IllegalAccessException e) {
            throw bkj.c(e);
        } catch (IllegalStateException e2) {
            throw new biz(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, T t) throws IOException {
        if (t == null) {
            bneVar.g();
            return;
        }
        bneVar.c();
        try {
            for (blf blfVar : this.f878b.values()) {
                blfVar.b(bneVar, t);
            }
            bneVar.e();
        } catch (IllegalAccessException e) {
            throw bkj.c(e);
        }
    }
}
