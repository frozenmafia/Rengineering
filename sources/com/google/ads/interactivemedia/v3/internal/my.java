package com.google.ads.interactivemedia.v3.internal;

import java.util.UUID;
/* loaded from: classes4.dex */
public final class my extends Exception {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ my(UUID uuid) {
        super("Media does not support uuid: ".concat(String.valueOf(String.valueOf(uuid))));
    }
}
