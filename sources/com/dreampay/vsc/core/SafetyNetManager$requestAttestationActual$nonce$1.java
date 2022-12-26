package com.dreampay.vsc.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SafetyNetManager$requestAttestationActual$nonce$1 extends Lambda implements Styleable.ChangeBounds<String, String> {
    public static final SafetyNetManager$requestAttestationActual$nonce$1 INSTANCE = new SafetyNetManager$requestAttestationActual$nonce$1();

    SafetyNetManager$requestAttestationActual$nonce$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(String str) {
        runAnimators.valueOf(str, "it");
        return "|";
    }
}
