package com.iab.omid.library.giphy.publisher;

import o.Delete;
import o.Embedded;
/* loaded from: classes7.dex */
public abstract class AdSessionStatePublisher {
    private Embedded ag$a;
    private a ah$a;
    private double values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_HIDDEN
    }

    public AdSessionStatePublisher() {
        ag$a();
        this.ag$a = new Embedded(null);
    }

    public void ag$a() {
        this.values = Delete.valueOf();
        this.ah$a = a.AD_STATE_IDLE;
    }
}
