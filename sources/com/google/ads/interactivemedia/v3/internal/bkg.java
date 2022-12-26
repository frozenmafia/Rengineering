package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* loaded from: classes4.dex */
final class bkg extends bki {
    final /* synthetic */ Method a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkg(Method method) {
        this.a = method;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bki
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.a.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
