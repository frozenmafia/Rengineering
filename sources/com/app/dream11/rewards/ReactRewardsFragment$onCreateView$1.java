package com.app.dream11.rewards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
final class ReactRewardsFragment$onCreateView$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ LayoutInflater $inflater;
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ ReactRewardsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactRewardsFragment$onCreateView$1(ReactRewardsFragment reactRewardsFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super(0);
        this.this$0 = reactRewardsFragment;
        this.$inflater = layoutInflater;
        this.$container = viewGroup;
        this.$savedInstanceState = bundle;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View onCreateView;
        FrameLayout HaptikSDK$a;
        FrameLayout ah$a = this.this$0.ah$a();
        onCreateView = super/*com.dream11.react.D11ReactFragment*/.onCreateView(this.$inflater, this.$container, this.$savedInstanceState);
        ah$a.addView(onCreateView);
        FrameLayout ah$a2 = this.this$0.ah$a();
        HaptikSDK$a = this.this$0.HaptikSDK$a();
        ah$a2.addView(HaptikSDK$a);
    }
}
