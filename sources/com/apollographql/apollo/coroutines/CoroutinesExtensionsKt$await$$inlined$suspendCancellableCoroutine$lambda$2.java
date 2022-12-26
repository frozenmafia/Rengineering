package com.apollographql.apollo.coroutines;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onRetainNonConfigurationInstance;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CoroutinesExtensionsKt$await$$inlined$suspendCancellableCoroutine$lambda$2 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ onRetainNonConfigurationInstance $this_await$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsKt$await$$inlined$suspendCancellableCoroutine$lambda$2(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        super(1);
        this.$this_await$inlined = onretainnonconfigurationinstance;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_await$inlined.ag$a();
    }
}
