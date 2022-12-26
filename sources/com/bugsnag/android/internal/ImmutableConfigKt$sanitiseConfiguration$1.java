package com.bugsnag.android.internal;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getTranslationZ;
/* loaded from: classes3.dex */
public final class ImmutableConfigKt$sanitiseConfiguration$1 extends Lambda implements Styleable.ArcMotion<File> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ getTranslationZ $configuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmutableConfigKt$sanitiseConfiguration$1(getTranslationZ gettranslationz, Context context) {
        super(0);
        this.$configuration = gettranslationz;
        this.$appContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final File invoke() {
        File extraCallbackWithResult = this.$configuration.extraCallbackWithResult();
        return extraCallbackWithResult != null ? extraCallbackWithResult : this.$appContext.getCacheDir();
    }
}
