package com.dream11.design.utils;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class StringUtilKt$toTitleCase$1 extends Lambda implements Styleable.ChangeBounds<String, CharSequence> {
    public static final StringUtilKt$toTitleCase$1 INSTANCE = new StringUtilKt$toTitleCase$1();

    StringUtilKt$toTitleCase$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(String str) {
        runAnimators.ag$a(str, "it");
        return Visibility.Mode.HaptikSDK$a(str);
    }
}
