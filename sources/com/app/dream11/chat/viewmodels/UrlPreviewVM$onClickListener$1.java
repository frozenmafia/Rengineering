package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.UrlPreviewVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UrlPreviewVM$onClickListener$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ UrlPreviewVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlPreviewVM$onClickListener$1(UrlPreviewVM urlPreviewVM) {
        super(0);
        this.this$0 = urlPreviewVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UrlPreviewVM.URLPreviewClickListener uRLPreviewClickListener;
        String HaptikSDK$c = this.this$0.getUrlPreview().HaptikSDK$c();
        if (HaptikSDK$c == null) {
            return;
        }
        UrlPreviewVM urlPreviewVM = this.this$0;
        uRLPreviewClickListener = urlPreviewVM.urlPreviewCLickListener;
        if (uRLPreviewClickListener == null) {
            return;
        }
        uRLPreviewClickListener.onUrlPreviewClicked(HaptikSDK$c, urlPreviewVM);
    }
}
