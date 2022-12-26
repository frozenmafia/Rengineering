package com.appsamurai.storyly.storylypresenter.storylylayer;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPager2;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class b$c extends Lambda implements Styleable.ChangeBounds<ViewPager2.DataSetChangeObserver, setAnimationMatrix> {
    public static final b$c a = new b$c();

    public b$c() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(ViewPager2.DataSetChangeObserver dataSetChangeObserver) {
        ViewPager2.DataSetChangeObserver dataSetChangeObserver2 = dataSetChangeObserver;
        runAnimators.ag$a(dataSetChangeObserver2, "$this$Json");
        dataSetChangeObserver2.ah$a(true);
        return setAnimationMatrix.ag$a;
    }
}
