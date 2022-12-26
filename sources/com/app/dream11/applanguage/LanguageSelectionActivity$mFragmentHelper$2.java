package com.app.dream11.applanguage;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.MenuPresenter;
import o.Styleable;
/* loaded from: classes.dex */
final class LanguageSelectionActivity$mFragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ LanguageSelectionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionActivity$mFragmentHelper$2(LanguageSelectionActivity languageSelectionActivity) {
        super(0);
        this.this$0 = languageSelectionActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), R.id.language_selection_container);
    }
}
