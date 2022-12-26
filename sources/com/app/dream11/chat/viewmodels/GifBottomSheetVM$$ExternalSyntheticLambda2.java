package com.app.dream11.chat.viewmodels;

import com.giphy.sdk.ui.GPHContentType;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class GifBottomSheetVM$$ExternalSyntheticLambda2 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ GifBottomSheetVM$$ExternalSyntheticLambda2 INSTANCE = new GifBottomSheetVM$$ExternalSyntheticLambda2();

    private /* synthetic */ GifBottomSheetVM$$ExternalSyntheticLambda2() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m921shouldShowSearch$lambda1;
        m921shouldShowSearch$lambda1 = GifBottomSheetVM.m921shouldShowSearch$lambda1((GPHContentType) obj);
        return m921shouldShowSearch$lambda1;
    }
}
