package com.app.dream11.fclogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
final class D11FCLoginLoaderFragment$onCreateView$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ LayoutInflater $inflater;
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ D11FCLoginLoaderFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11FCLoginLoaderFragment$onCreateView$1(D11FCLoginLoaderFragment d11FCLoginLoaderFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super(0);
        this.this$0 = d11FCLoginLoaderFragment;
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
        FrameLayout ah$b;
        FrameLayout ah$a = this.this$0.ah$a();
        onCreateView = super/*com.dream11.react.D11ReactFragment*/.onCreateView(this.$inflater, this.$container, this.$savedInstanceState);
        ah$a.addView(onCreateView);
        FrameLayout ah$a2 = this.this$0.ah$a();
        ah$b = this.this$0.ah$b();
        ah$a2.addView(ah$b);
    }
}
