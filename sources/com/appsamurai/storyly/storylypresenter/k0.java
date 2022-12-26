package com.appsamurai.storyly.storylypresenter;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getUniqueKey;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class k0 extends Lambda implements Transition<Long, Long, setAnimationMatrix> {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o oVar) {
        super(2);
        this.a = oVar;
    }

    @Override // o.Transition
    public setAnimationMatrix invoke(Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        o oVar = this.a;
        getUniqueKey getuniquekey = oVar.aj$a;
        if (getuniquekey != null) {
            getuniquekey.HaptikSDK$e = longValue;
        }
        oVar.ICustomTabsCallback$Stub$Proxy().toString(Long.valueOf(longValue), Long.valueOf(longValue2));
        return setAnimationMatrix.ag$a;
    }
}
