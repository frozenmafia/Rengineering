package com.app.dream11.onboarding;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.MenuPresenter;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OnBoardingSportsSelectionFragment$fragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ OnBoardingSportsSelectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingSportsSelectionFragment$fragmentHelper$2(OnBoardingSportsSelectionFragment onBoardingSportsSelectionFragment) {
        super(0);
        this.this$0 = onBoardingSportsSelectionFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getChildFragmentManager(), R.id.fl_on_boarding_match_center);
    }
}
