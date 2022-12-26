package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
public final class bog extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    bog() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bog(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bog(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
