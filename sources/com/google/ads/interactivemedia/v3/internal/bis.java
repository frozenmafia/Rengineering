package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes4.dex */
public class bis {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            bne bneVar = new bne(stringWriter);
            bneVar.n(true);
            bkj.f(this, bneVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
