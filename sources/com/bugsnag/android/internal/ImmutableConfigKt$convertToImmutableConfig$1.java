package com.bugsnag.android.internal;

import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getTranslationZ;
/* loaded from: classes6.dex */
public final class ImmutableConfigKt$convertToImmutableConfig$1 extends Lambda implements Styleable.ArcMotion<File> {
    final /* synthetic */ getTranslationZ $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImmutableConfigKt$convertToImmutableConfig$1(getTranslationZ gettranslationz) {
        super(0);
        this.$config = gettranslationz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final File invoke() {
        File extraCallbackWithResult = this.$config.extraCallbackWithResult();
        if (extraCallbackWithResult != null) {
            return extraCallbackWithResult;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
