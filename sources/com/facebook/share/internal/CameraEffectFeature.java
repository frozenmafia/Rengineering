package com.facebook.share.internal;

import java.util.Arrays;
import o.addAddedFragments;
/* loaded from: classes4.dex */
public enum CameraEffectFeature implements addAddedFragments {
    SHARE_CAMERA_EFFECT(20170417);
    
    private final int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    CameraEffectFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CameraEffectFeature[] valuesCustom() {
        CameraEffectFeature[] valuesCustom = values();
        return (CameraEffectFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
