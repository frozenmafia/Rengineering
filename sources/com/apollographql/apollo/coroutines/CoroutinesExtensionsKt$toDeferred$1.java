package com.apollographql.apollo.coroutines;

import com.apollographql.apollo.ApolloCall;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.loadPvh;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CoroutinesExtensionsKt$toDeferred$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ loadPvh $deferred;
    final /* synthetic */ ApolloCall $this_toDeferred;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsKt$toDeferred$1(ApolloCall apolloCall, loadPvh loadpvh) {
        super(1);
        this.$this_toDeferred = apolloCall;
        this.$deferred = loadpvh;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (this.$deferred.invoke()) {
            this.$this_toDeferred.ag$a();
        }
    }
}
