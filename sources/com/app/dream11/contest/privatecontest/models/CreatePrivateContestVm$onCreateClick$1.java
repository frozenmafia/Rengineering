package com.app.dream11.contest.privatecontest.models;

import kotlin.jvm.internal.Lambda;
import o.AppCompatDelegateImpl;
import o.AppCompatDelegateImpl$7$ah$a;
import o.Styleable;
import o.Visibility;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class CreatePrivateContestVm$onCreateClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ AppCompatDelegateImpl.AnonymousClass7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePrivateContestVm$onCreateClick$1(AppCompatDelegateImpl.AnonymousClass7 anonymousClass7) {
        super(0);
        this.this$0 = anonymousClass7;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Integer mode;
        Integer mode2;
        AppCompatDelegateImpl$7$ah$a HaptikSDK$e = this.this$0.HaptikSDK$e();
        String str = this.this$0.values().get();
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.this$0.HaptikSDK$b().get();
        int intValue = (str3 == null || (mode2 = Visibility.Mode.toString(str3)) == null) ? -1 : mode2.intValue();
        Double d = this.this$0.ICustomTabsCallback().get();
        if (d == null) {
            d = Double.valueOf(0.0d);
        }
        double doubleValue = d.doubleValue();
        String str4 = this.this$0.valueOf().get();
        HaptikSDK$e.toString(str2, intValue, doubleValue, (str4 == null || (mode = Visibility.Mode.toString(str4)) == null) ? -1 : mode.intValue(), this.this$0.extraCommand(), this.this$0.asBinder());
    }
}
