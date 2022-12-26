package com.giphy.sdk.ui.views;

import com.giphy.sdk.core.models.Media;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class GPHMediaPreviewDialog$onSelectMedia$1 extends Lambda implements Styleable.ChangeBounds<Media, setAnimationMatrix> {
    public static final GPHMediaPreviewDialog$onSelectMedia$1 INSTANCE = new GPHMediaPreviewDialog$onSelectMedia$1();

    GPHMediaPreviewDialog$onSelectMedia$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Media media) {
        runAnimators.ag$a(media, "it");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Media media) {
        invoke2(media);
        return setAnimationMatrix.ag$a;
    }
}
