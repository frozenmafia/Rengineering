package com.facebook.share.internal;

import o.addAddedFragments;
/* loaded from: classes4.dex */
public enum MessageDialogFeature implements addAddedFragments {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    
    private int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    MessageDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }
}
