package com.app.dream11.contest;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.ActionBar;
import o.Styleable;
/* loaded from: classes.dex */
public final class ContestHomePresenter$isFantasyLiveMatchAvailable$2 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ ActionBar.Tab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestHomePresenter$isFantasyLiveMatchAvailable$2(ActionBar.Tab tab) {
        super(0);
        this.this$0 = tab;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        FlowState HaptikSDK$a = ActionBar.Tab.HaptikSDK$a(this.this$0);
        return (Boolean) (HaptikSDK$a == null ? null : HaptikSDK$a.getExtra("isLiveMatchAvailable"));
    }
}
