package com.appsamurai.storyly;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.getFontFamily;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class j extends Lambda implements Transition<getFontFamily, Integer, setAnimationMatrix> {
    public final /* synthetic */ StorylyView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StorylyView storylyView, Context context) {
        super(2);
        this.a = storylyView;
        this.f108b = context;
    }

    @Override // o.Transition
    public setAnimationMatrix invoke(getFontFamily getfontfamily, Integer num) {
        int intValue = num.intValue();
        runAnimators.ag$a(getfontfamily, "$noName_0");
        StorylyView.HaptikSDK$e(this.a);
        if (this.f108b.getResources().getConfiguration().orientation == 1 && !StorylyView.getSignupData(this.a)) {
            StorylyView.valueOf(this.a, intValue, null, null, 6);
        }
        return setAnimationMatrix.ag$a;
    }
}
