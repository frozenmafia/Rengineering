package com.app.dream11.matchcentre.matchpicker.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TouchResponse;
import o.TouchResponse$2$ah$a;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MatchPickerItemVM$onMatchClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ TouchResponse.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchPickerItemVM$onMatchClick$1(TouchResponse.AnonymousClass2 anonymousClass2) {
        super(0);
        this.this$0 = anonymousClass2;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        TouchResponse$2$ah$a ah$a = this.this$0.ah$a();
        if (ah$a == null) {
            return null;
        }
        ah$a.toString(this.this$0.ag$a());
        return setAnimationMatrix.ag$a;
    }
}
