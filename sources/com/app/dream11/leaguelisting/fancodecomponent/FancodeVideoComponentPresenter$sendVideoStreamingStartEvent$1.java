package com.app.dream11.leaguelisting.fancodecomponent;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.access$1200;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class FancodeVideoComponentPresenter$sendVideoStreamingStartEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $source;
    final /* synthetic */ access$1200 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancodeVideoComponentPresenter$sendVideoStreamingStartEvent$1(access$1200 access_1200, String str) {
        super(0);
        this.this$0 = access_1200;
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
        setType valueOf = access$1200.valueOf(this.this$0);
        if (valueOf == null) {
            return;
        }
        int a = this.this$0.a();
        int onPostMessage = this.this$0.onPostMessage();
        String extraCallbackWithResult = this.this$0.extraCallbackWithResult();
        int HaptikSDK$e = this.this$0.HaptikSDK$e();
        String str = this.$source;
        if (str == null) {
            str = "";
        }
        valueOf.ag$a(a, onPostMessage, extraCallbackWithResult, HaptikSDK$e, str);
    }
}
