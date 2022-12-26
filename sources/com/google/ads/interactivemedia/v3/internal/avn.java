package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
/* loaded from: classes7.dex */
final class avn extends ave {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avn(avo avoVar) {
        super(avoVar);
        this.a = avoVar.comparator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    final /* synthetic */ avd a(int i) {
        return new avm(this.a);
    }
}
