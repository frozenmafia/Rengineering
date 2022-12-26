package com.apollographql.apollo.coroutines;

import com.apollographql.apollo.ApolloCall;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class CoroutinesExtensionsKt$await$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ ApolloCall $this_await$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$await$$inlined$suspendCancellableCoroutine$lambda$1(ApolloCall apolloCall) {
        super(1);
        this.$this_await$inlined = apolloCall;
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
