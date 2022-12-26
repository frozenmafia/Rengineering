package com.facebook.share.internal;

import o.addAddedFragments;
/* loaded from: classes6.dex */
public enum AppInviteDialogFeature implements addAddedFragments {
    APP_INVITES_DIALOG(20140701);
    
    private int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.APPINVITES_DIALOG";
    }

    AppInviteDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }
}
