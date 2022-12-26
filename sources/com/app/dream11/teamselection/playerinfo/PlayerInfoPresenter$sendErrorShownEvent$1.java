package com.app.dream11.teamselection.playerinfo;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readFamily;
import o.setAnimationMatrix;
import o.withStyledAttributes;
/* loaded from: classes3.dex */
public final class PlayerInfoPresenter$sendErrorShownEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $errorMsg;
    final /* synthetic */ withStyledAttributes this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInfoPresenter$sendErrorShownEvent$1(withStyledAttributes withstyledattributes, String str) {
        super(0);
        this.this$0 = withstyledattributes;
        this.$errorMsg = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readFamily.ag$a(this.this$0.valueOf$7ccaadfe(), this.$errorMsg, this.this$0.HaptikSDK$b(), this.this$0.ah$a());
    }
}
