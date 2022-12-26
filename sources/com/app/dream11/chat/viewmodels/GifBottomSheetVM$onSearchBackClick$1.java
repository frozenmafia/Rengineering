package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.GifBottomSheetVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Visibility;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GifBottomSheetVM$onSearchBackClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ GifBottomSheetVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifBottomSheetVM$onSearchBackClick$1(GifBottomSheetVM gifBottomSheetVM) {
        super(0);
        this.this$0 = gifBottomSheetVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z = false;
        this.this$0.getShouldShowSearchBack().set(false);
        String str = this.this$0.getTypingTextField().get();
        if (!((str == null || Visibility.Mode.ag$a((CharSequence) str)) ? true : true)) {
            this.this$0.clearSearchText();
        }
        GifBottomSheetVM.GifBottomSheetHandler handler = this.this$0.getHandler();
        if (handler == null) {
            return;
        }
        handler.onSearchBackClicked();
    }
}
