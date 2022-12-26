package com.bugsnag.android;

import java.io.IOException;
import o.runAnimators;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public enum Severity implements setBackgroundTintMode.toString {
    ERROR("error"),
    WARNING("warning"),
    INFO("info");
    
    public static final Severity$ah$a Companion = new Severity$ah$a(null);
    private final String str;

    Severity(String str) {
        this.str = str;
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        setbackgroundtintmode.valueOf(this.str);
    }
}
