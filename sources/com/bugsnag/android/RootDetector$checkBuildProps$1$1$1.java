package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
final class RootDetector$checkBuildProps$1$1$1 extends Lambda implements Styleable.ChangeBounds<String, String> {
    public static final RootDetector$checkBuildProps$1$1$1 INSTANCE = new RootDetector$checkBuildProps$1$1$1();

    RootDetector$checkBuildProps$1$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(String str) {
        runAnimators.valueOf(str, "line");
        return new Regex("\\s").replace(str, "");
    }
}
