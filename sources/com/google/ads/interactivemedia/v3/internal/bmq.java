package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
final class bmq extends bjf {
    private final Map a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f888b = new HashMap();
    private final Map c = new HashMap();

    public bmq(Class cls) {
        Field[] fieldArr;
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new bmp(cls))) {
                Enum r4 = (Enum) field.get(null);
                String name = r4.name();
                String str = r4.toString();
                bji bjiVar = (bji) field.getAnnotation(bji.class);
                if (bjiVar != null) {
                    name = bjiVar.a();
                    for (String str2 : bjiVar.b()) {
                        this.a.put(str2, r4);
                    }
                }
                this.a.put(name, r4);
                this.f888b.put(str, r4);
                this.c.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        String h = bncVar.h();
        Enum r0 = (Enum) this.a.get(h);
        return r0 != null ? r0 : (Enum) this.f888b.get(h);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        bneVar.k(r3 == null ? null : (String) this.c.get(r3));
    }
}
