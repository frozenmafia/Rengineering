package com.app.dream11.leaguelisting.brightcovepip;

import kotlin.jvm.internal.Lambda;
import o.Animatable;
import o.Styleable;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCovePipPresenter$sendVideoStreamingStartEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $source;
    final /* synthetic */ Animatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCovePipPresenter$sendVideoStreamingStartEvent$1(Animatable animatable, String str) {
        super(0);
        this.this$0 = animatable;
        this.$source = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setType ag$a = Animatable.ag$a(this.this$0);
        if (ag$a == null) {
            return;
        }
        int HaptikWebView = this.this$0.HaptikWebView();
        int extraCallbackWithResult = this.this$0.extraCallbackWithResult();
        String aj$a = this.this$0.aj$a();
        int HaptikSDK$d = this.this$0.HaptikSDK$d();
        String str = this.$source;
        if (str == null) {
            str = "";
        }
        ag$a.ag$a(HaptikWebView, extraCallbackWithResult, aj$a, HaptikSDK$d, str);
    }
}
