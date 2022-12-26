package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.Lambda;
import o.ContentInfoCompat;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class c extends Lambda implements Styleable.ChangeBounds<Boolean, setAnimationMatrix> {
    public final /* synthetic */ ContentInfoCompat.Source a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ContentInfoCompat.Source source) {
        super(1);
        this.a = source;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Styleable.ChangeBounds<? super Boolean, setAnimationMatrix> changeBounds = this.a.ah$a;
        if (changeBounds != null) {
            changeBounds.invoke(Boolean.valueOf(booleanValue));
        }
        return setAnimationMatrix.ag$a;
    }
}
