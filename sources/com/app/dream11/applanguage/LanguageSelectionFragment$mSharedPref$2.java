package com.app.dream11.applanguage;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.findRealOwner;
/* loaded from: classes.dex */
final class LanguageSelectionFragment$mSharedPref$2 extends Lambda implements Styleable.ArcMotion<findRealOwner> {
    public static final LanguageSelectionFragment$mSharedPref$2 INSTANCE = new LanguageSelectionFragment$mSharedPref$2();

    LanguageSelectionFragment$mSharedPref$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final findRealOwner invoke() {
        return DreamApplication.valueOf().ak$a();
    }
}
