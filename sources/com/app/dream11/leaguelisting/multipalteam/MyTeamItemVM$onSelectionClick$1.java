package com.app.dream11.leaguelisting.multipalteam;

import kotlin.jvm.internal.Lambda;
import o.KeyCycleOscillator$RotationYset$ag$a;
import o.Styleable;
import o.access$900;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MyTeamItemVM$onSelectionClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ access$900 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTeamItemVM$onSelectionClick$1(access$900 access_900) {
        super(0);
        this.this$0 = access_900;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        KeyCycleOscillator$RotationYset$ag$a ah$a = this.this$0.ah$a();
        if (ah$a == null) {
            return null;
        }
        ah$a.toString(this.this$0);
        return setAnimationMatrix.ag$a;
    }
}
