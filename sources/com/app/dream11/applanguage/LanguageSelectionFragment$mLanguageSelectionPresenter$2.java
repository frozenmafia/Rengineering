package com.app.dream11.applanguage;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.RequiresOptIn;
import o.Styleable;
/* loaded from: classes.dex */
final class LanguageSelectionFragment$mLanguageSelectionPresenter$2 extends Lambda implements Styleable.ArcMotion<RequiresOptIn> {
    public static final LanguageSelectionFragment$mLanguageSelectionPresenter$2 INSTANCE = new LanguageSelectionFragment$mLanguageSelectionPresenter$2();

    LanguageSelectionFragment$mLanguageSelectionPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final RequiresOptIn invoke() {
        return ActionMenuItem.valueOf().getSmallIconBitmap();
    }
}
