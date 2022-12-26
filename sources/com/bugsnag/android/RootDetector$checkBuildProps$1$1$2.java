package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes3.dex */
final class RootDetector$checkBuildProps$1$1$2 extends Lambda implements Styleable.ChangeBounds<String, Boolean> {
    public static final RootDetector$checkBuildProps$1$1$2 INSTANCE = new RootDetector$checkBuildProps$1$1$2();

    RootDetector$checkBuildProps$1$1$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(String str) {
        return Boolean.valueOf(invoke2(str));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(String str) {
        runAnimators.valueOf(str, "line");
        return Visibility.Mode.ah$a(str, "ro.debuggable=[1]", false, 2, (Object) null) || Visibility.Mode.ah$a(str, "ro.secure=[0]", false, 2, (Object) null);
    }
}
