package com.bugsnag.android.internal.dag;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class DependencyModule$future$lazy$1 extends Lambda implements Styleable.ArcMotion<T> {
    final /* synthetic */ Styleable.ArcMotion $initializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependencyModule$future$lazy$1(Styleable.ArcMotion arcMotion) {
        super(0);
        this.$initializer = arcMotion;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final T invoke() {
        return this.$initializer.invoke();
    }
}
