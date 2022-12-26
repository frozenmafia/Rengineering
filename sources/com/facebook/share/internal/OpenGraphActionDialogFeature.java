package com.facebook.share.internal;

import java.util.Arrays;
import o.addAddedFragments;
/* loaded from: classes4.dex */
public enum OpenGraphActionDialogFeature implements addAddedFragments {
    OG_ACTION_DIALOG(20130618);
    
    private final int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    OpenGraphActionDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OpenGraphActionDialogFeature[] valuesCustom() {
        OpenGraphActionDialogFeature[] valuesCustom = values();
        return (OpenGraphActionDialogFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
