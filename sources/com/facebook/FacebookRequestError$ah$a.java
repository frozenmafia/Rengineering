package com.facebook;
/* loaded from: classes4.dex */
public final class FacebookRequestError$ah$a {
    private final int valueOf;
    private final int values;

    public FacebookRequestError$ah$a(int i, int i2) {
        this.valueOf = i;
        this.values = i2;
    }

    public final boolean values(int i) {
        return i <= this.values && this.valueOf <= i;
    }
}
