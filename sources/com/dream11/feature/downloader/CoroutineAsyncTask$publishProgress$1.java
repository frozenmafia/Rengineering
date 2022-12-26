package com.dream11.feature.downloader;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.needMirroring;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.updateChildrenImportantForAccessibility;
/* loaded from: classes4.dex */
public final class CoroutineAsyncTask$publishProgress$1 extends SuspendLambda implements Transition<needMirroring, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ Progress $progress;
    int label;
    final /* synthetic */ updateChildrenImportantForAccessibility<Params, Progress, Result> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAsyncTask$publishProgress$1(updateChildrenImportantForAccessibility<Params, Progress, Result> updatechildrenimportantforaccessibility, Progress progress, setPatternPath<? super CoroutineAsyncTask$publishProgress$1> setpatternpath) {
        super(2, setpatternpath);
        this.this$0 = updatechildrenimportantforaccessibility;
        this.$progress = progress;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        return new CoroutineAsyncTask$publishProgress$1(this.this$0, this.$progress, setpatternpath);
    }

    @Override // o.Transition
    public final Object invoke(needMirroring needmirroring, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((CoroutineAsyncTask$publishProgress$1) create(needmirroring, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatternPathMotion.values();
        if (this.label == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            this.this$0.ag$a(this.$progress);
            return setAnimationMatrix.ag$a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
