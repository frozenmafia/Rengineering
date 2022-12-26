package com.appsamurai.storyly.storylypresenter;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class m extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar) {
        super(1);
        this.a = eVar;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.valueOf().setBackgroundColor(0);
        } else {
            this.a.valueOf().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        return setAnimationMatrix.ag$a;
    }
}
