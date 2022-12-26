package com.appsamurai.storyly;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.record;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class h extends Lambda implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    public final /* synthetic */ StorylyView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StorylyView storylyView) {
        super(1);
        this.a = storylyView;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(String str) {
        String str2 = str;
        runAnimators.ag$a(str2, "errorMessage");
        record HaptikSDK$b = this.a.HaptikSDK$b();
        if (HaptikSDK$b != null) {
            HaptikSDK$b.values(this.a, str2);
        }
        return setAnimationMatrix.ag$a;
    }
}
