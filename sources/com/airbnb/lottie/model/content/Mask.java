package com.airbnb.lottie.model.content;

import o.sendMetadata;
import o.sendSessionDestroyed;
/* loaded from: classes.dex */
public class Mask {
    private final boolean ag$a;
    private final sendSessionDestroyed ah$a;
    private final sendMetadata toString;
    private final MaskMode valueOf;

    /* loaded from: classes.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, sendSessionDestroyed sendsessiondestroyed, sendMetadata sendmetadata, boolean z) {
        this.valueOf = maskMode;
        this.ah$a = sendsessiondestroyed;
        this.toString = sendmetadata;
        this.ag$a = z;
    }

    public MaskMode ag$a() {
        return this.valueOf;
    }

    public sendSessionDestroyed ah$a() {
        return this.ah$a;
    }

    public sendMetadata valueOf() {
        return this.toString;
    }

    public boolean values() {
        return this.ag$a;
    }
}
