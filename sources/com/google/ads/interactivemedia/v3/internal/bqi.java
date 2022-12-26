package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class bqi implements bqo {
    private final bqo[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqi(bqo... bqoVarArr) {
        this.a = bqoVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqo
    public final bqn a(Class cls) {
        bqo[] bqoVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            bqo bqoVar = bqoVarArr[i];
            if (bqoVar.b(cls)) {
                return bqoVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqo
    public final boolean b(Class cls) {
        bqo[] bqoVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (bqoVarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
