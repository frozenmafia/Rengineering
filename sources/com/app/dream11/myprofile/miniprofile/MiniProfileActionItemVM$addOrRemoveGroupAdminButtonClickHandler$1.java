package com.app.dream11.myprofile.miniprofile;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getConstraintWidget;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MiniProfileActionItemVM$addOrRemoveGroupAdminButtonClickHandler$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Boolean $isUserAdmin;
    final /* synthetic */ getConstraintWidget $miniProfileActionClickHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProfileActionItemVM$addOrRemoveGroupAdminButtonClickHandler$1(Boolean bool, getConstraintWidget getconstraintwidget) {
        super(0);
        this.$isUserAdmin = bool;
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
        Boolean bool = this.$isUserAdmin;
        if (bool == null) {
            return;
        }
        getConstraintWidget getconstraintwidget = this.$miniProfileActionClickHandler;
        if (bool.booleanValue()) {
            getconstraintwidget.values();
        } else {
            getconstraintwidget.ag$a();
        }
    }
}
