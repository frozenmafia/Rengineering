package com.appsamurai.storyly;

import kotlin.jvm.internal.Lambda;
import o.PorterDuffKt;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.unaryMinus;
/* loaded from: classes3.dex */
public final class c extends Lambda implements Styleable.ChangeBounds<PorterDuffKt, setAnimationMatrix> {
    public final /* synthetic */ StorylyView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StorylyView storylyView) {
        super(1);
        this.a = storylyView;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(PorterDuffKt porterDuffKt) {
        PorterDuffKt porterDuffKt2 = porterDuffKt;
        runAnimators.ag$a(porterDuffKt2, "storylyAdListener");
        unaryMinus values = this.a.values();
        if (values != null) {
            values.valueOf(porterDuffKt2);
        }
        return setAnimationMatrix.ag$a;
    }
}
