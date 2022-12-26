package com.appsamurai.storyly.storylypresenter;

import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class l extends Lambda implements Styleable.ChangeBounds<Float, setAnimationMatrix> {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar) {
        super(1);
        this.a = eVar;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Float f) {
        this.a.valueOf().setBackgroundColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, 255 - ((int) (255 * (f.floatValue() / this.a.getHeight())))));
        return setAnimationMatrix.ag$a;
    }
}
