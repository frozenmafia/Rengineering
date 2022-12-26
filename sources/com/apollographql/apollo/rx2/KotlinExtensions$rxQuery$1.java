package com.apollographql.apollo.rx2;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeOnContextAvailableListener;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class KotlinExtensions$rxQuery$1 extends Lambda implements Styleable.ChangeBounds<removeOnContextAvailableListener<T>, removeOnContextAvailableListener<T>> {
    public static final KotlinExtensions$rxQuery$1 INSTANCE = new KotlinExtensions$rxQuery$1();

    public KotlinExtensions$rxQuery$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final removeOnContextAvailableListener<T> invoke(removeOnContextAvailableListener<T> removeoncontextavailablelistener) {
        runAnimators.valueOf(removeoncontextavailablelistener, "$receiver");
        return removeoncontextavailablelistener;
    }
}
