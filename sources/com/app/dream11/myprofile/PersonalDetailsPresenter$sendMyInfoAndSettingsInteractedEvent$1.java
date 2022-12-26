package com.app.dream11.myprofile;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addCenterPoint;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class PersonalDetailsPresenter$sendMyInfoAndSettingsInteractedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ addCenterPoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalDetailsPresenter$sendMyInfoAndSettingsInteractedEvent$1(addCenterPoint addcenterpoint) {
        super(0);
        this.this$0 = addcenterpoint;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        readFamily.ag$a(this.this$0.valueOf(), (Boolean) null, (Boolean) null, "profile_update", 6, (Object) null);
    }
}
