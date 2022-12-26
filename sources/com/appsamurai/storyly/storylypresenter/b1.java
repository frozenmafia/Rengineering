package com.appsamurai.storyly.storylypresenter;

import com.appsamurai.storyly.storylypresenter.o;
import com.appsamurai.storyly.storylypresenter.storylyheader.a;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class b1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(o oVar) {
        super(0);
        this.a = oVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        o oVar = this.a;
        if (oVar.getInitSettings == o.a.Started) {
            a.toString tostring = oVar.ICustomTabsService().ah$a;
            if (tostring == null) {
                runAnimators.valueOf("headerView");
                tostring = null;
            }
            tostring.values();
        }
        return setAnimationMatrix.ag$a;
    }
}
