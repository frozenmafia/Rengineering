package com.facebook.share.internal;

import o.addAddedFragments;
/* loaded from: classes6.dex */
public enum OpenGraphMessageDialogFeature implements addAddedFragments {
    OG_MESSAGE_DIALOG(20140204);
    
    private int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    }

    OpenGraphMessageDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }
}
