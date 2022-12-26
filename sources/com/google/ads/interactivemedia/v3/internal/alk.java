package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes4.dex */
final class alk implements aye {
    final /* synthetic */ TaskCompletionSource a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f624b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public alk(TaskCompletionSource taskCompletionSource, String str) {
        this.a = taskCompletionSource;
        this.f624b = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aye
    public final void a(Throwable th) {
        this.a.setException(new Exception("Failed to load image from: ".concat(String.valueOf(this.f624b)), th));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aye
    public final /* synthetic */ void b(Object obj) {
        this.a.trySetResult((Bitmap) obj);
    }
}
