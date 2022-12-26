package com.app.dream11.playerpoints;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.readFamily;
import o.setAnimationMatrix;
import o.setGuidelinePercent;
/* loaded from: classes3.dex */
public final class PreviewPlayerHolderPostRoundLockPresenter$onFpsClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setGuidelinePercent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPlayerHolderPostRoundLockPresenter$onFpsClick$1(setGuidelinePercent setguidelinepercent) {
        super(0);
        this.this$0 = setguidelinepercent;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TrustedWebActivityCallbackRemote ah$a$7ccaadfe = this.this$0.ah$a$7ccaadfe();
        int ah$b = this.this$0.ah$b();
        Integer values = this.this$0.values();
        readFamily.values(ah$a$7ccaadfe, "Player Info", ah$b, values == null ? -1 : values.intValue());
    }
}
