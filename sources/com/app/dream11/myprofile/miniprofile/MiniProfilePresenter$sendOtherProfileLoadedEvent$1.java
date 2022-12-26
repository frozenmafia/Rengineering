package com.app.dream11.myprofile.miniprofile;

import com.app.dream11.myprofile.profilerevamp.profilemapper.UserType;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addCentering;
import o.getVerticalChainStyle;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MiniProfilePresenter$sendOtherProfileLoadedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getVerticalChainStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProfilePresenter$sendOtherProfileLoadedEvent$1(getVerticalChainStyle getverticalchainstyle) {
        super(0);
        this.this$0 = getverticalchainstyle;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        addCentering ak$a = this.this$0.ak$a();
        String ak = this.this$0.ak();
        int ak$b = this.this$0.ak$b();
        UserType extraCallbackWithResult = this.this$0.extraCallbackWithResult();
        readFamily.toString(ak$a, ak, String.valueOf(ak$b), extraCallbackWithResult == null ? null : extraCallbackWithResult.name(), this.this$0.extraCallback());
    }
}
