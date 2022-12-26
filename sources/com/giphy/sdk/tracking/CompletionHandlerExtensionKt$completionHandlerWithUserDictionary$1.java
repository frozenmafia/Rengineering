package com.giphy.sdk.tracking;

import com.giphy.sdk.core.network.response.ListMediaResponse;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.postResult;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
public final class CompletionHandlerExtensionKt$completionHandlerWithUserDictionary$1 extends Lambda implements Transition<ListMediaResponse, Throwable, setAnimationMatrix> {
    final /* synthetic */ postResult $this_completionHandlerWithUserDictionary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompletionHandlerExtensionKt$completionHandlerWithUserDictionary$1(postResult postresult) {
        super(2);
        this.$this_completionHandlerWithUserDictionary = postresult;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(ListMediaResponse listMediaResponse, Throwable th) {
        invoke2(listMediaResponse, th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ListMediaResponse listMediaResponse, Throwable th) {
        this.$this_completionHandlerWithUserDictionary.onComplete(listMediaResponse, th);
    }
}
