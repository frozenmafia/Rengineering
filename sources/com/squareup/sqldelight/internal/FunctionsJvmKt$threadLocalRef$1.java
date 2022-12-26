package com.squareup.sqldelight.internal;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class FunctionsJvmKt$threadLocalRef$1 extends Lambda implements Styleable.ArcMotion<T> {
    final /* synthetic */ ThreadLocal $threadLocal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionsJvmKt$threadLocalRef$1(ThreadLocal threadLocal) {
        super(0);
        this.$threadLocal = threadLocal;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final T invoke() {
        return this.$threadLocal.get();
    }
}
