package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bhw extends ThreadLocal {
    final /* synthetic */ bhx a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bhw(bhx bhxVar) {
        this.a = bhxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            bhq bhqVar = bhq.f838b;
            str = this.a.c;
            Mac mac = (Mac) bhqVar.a(str);
            key = this.a.d;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
