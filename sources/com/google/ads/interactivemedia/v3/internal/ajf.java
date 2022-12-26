package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* loaded from: classes4.dex */
public final /* synthetic */ class ajf implements OnCompleteListener {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f587b;

    public /* synthetic */ ajf(aij aijVar, int i) {
        this.f587b = i;
        this.a = aijVar;
    }

    public /* synthetic */ ajf(ajg ajgVar, int i) {
        this.f587b = i;
        this.a = ajgVar;
    }

    public /* synthetic */ ajf(ajq ajqVar, int i) {
        this.f587b = i;
        this.a = ajqVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i = this.f587b;
        if (i != 0) {
            if (i == 1) {
                ((aij) this.a).k(task);
                return;
            } else {
                ((ajq) this.a).p();
                return;
            }
        }
        Object obj = this.a;
        if (task.isSuccessful()) {
            ((ajg) obj).setImageBitmap((Bitmap) task.getResult());
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.m.b("Image companion error", task.getException());
    }
}
