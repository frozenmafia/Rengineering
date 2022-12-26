package com.google.gson.internal.bind;

import java.io.IOException;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
abstract class ReflectiveTypeAdapterFactory$ah$a {
    final boolean HaptikSDK$b;
    final String HaptikSDK$c;
    final boolean invoke;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(StaggeredGridLayoutManager.Span span, Object obj) throws IOException, IllegalAccessException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean ag$a(Object obj) throws IOException, IllegalAccessException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ah$a(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1, Object obj) throws IOException, IllegalAccessException;

    /* JADX INFO: Access modifiers changed from: protected */
    public ReflectiveTypeAdapterFactory$ah$a(String str, boolean z, boolean z2) {
        this.HaptikSDK$c = str;
        this.invoke = z;
        this.HaptikSDK$b = z2;
    }
}
