package com.app.dream11.reaction.models;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactionsConfig$ReactionsConfigBuilder$withReactionTexts$2$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<Integer, String> {
    ReactionsConfig$ReactionsConfigBuilder$withReactionTexts$2$1(Object obj) {
        super(1, obj, Object[].class, "get", "get(I)Ljava/lang/Object;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final String invoke(int i) {
        return ((String[]) this.receiver)[i];
    }
}
