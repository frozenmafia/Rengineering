package com.giphy.sdk.ui.views;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final class GiphySearchBar$recycle$2 extends Lambda implements Styleable.ChangeBounds<String, setAnimationMatrix> {
    public static final GiphySearchBar$recycle$2 INSTANCE = new GiphySearchBar$recycle$2();

    GiphySearchBar$recycle$2() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        runAnimators.ag$a(str, "it");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(String str) {
        invoke2(str);
        return setAnimationMatrix.ag$a;
    }
}
