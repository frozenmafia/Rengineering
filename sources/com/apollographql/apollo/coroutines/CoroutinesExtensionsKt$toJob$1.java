package com.apollographql.apollo.coroutines;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.loadPvh;
import o.onRetainNonConfigurationInstance;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CoroutinesExtensionsKt$toJob$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ loadPvh $deferred;
    final /* synthetic */ onRetainNonConfigurationInstance $this_toJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsKt$toJob$1(onRetainNonConfigurationInstance onretainnonconfigurationinstance, loadPvh loadpvh) {
        super(1);
        this.$this_toJob = onretainnonconfigurationinstance;
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
            this.$this_toJob.ag$a();
        }
    }
}
