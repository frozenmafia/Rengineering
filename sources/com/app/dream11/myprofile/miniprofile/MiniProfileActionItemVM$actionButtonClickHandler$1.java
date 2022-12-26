package com.app.dream11.myprofile.miniprofile;

import com.app.dream11.myprofile.profilerevamp.profilemapper.UserType;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.endToStart;
import o.getConstraintWidget;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MiniProfileActionItemVM$actionButtonClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ getConstraintWidget $miniProfileActionClickHandler;
    final /* synthetic */ endToStart this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProfileActionItemVM$actionButtonClickHandler$1(endToStart endtostart, getConstraintWidget getconstraintwidget) {
        super(0);
        this.this$0 = endtostart;
        this.$miniProfileActionClickHandler = getconstraintwidget;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.HaptikSDK$a() == null || this.this$0.HaptikSDK$a() == UserType.DELETED) {
            this.$miniProfileActionClickHandler.ah$a();
        } else {
            this.$miniProfileActionClickHandler.ah$b();
        }
    }
}
