package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* loaded from: classes4.dex */
public final /* synthetic */ class arf implements Continuation {
    public static final /* synthetic */ arf a = new arf();

    private /* synthetic */ arf() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }
}
