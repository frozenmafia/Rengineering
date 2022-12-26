package com.appsamurai.storyly;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getFontFamily;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class f extends Lambda implements Styleable.ChangeBounds<List<? extends getFontFamily>, setAnimationMatrix> {
    public final /* synthetic */ StorylyView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StorylyView storylyView) {
        super(1);
        this.a = storylyView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(List<? extends getFontFamily> list) {
        List<? extends getFontFamily> list2 = list;
        runAnimators.ag$a(list2, "it");
        StorylyView.toString(this.a).valueOf((List<getFontFamily>) list2);
        return setAnimationMatrix.ag$a;
    }
}
