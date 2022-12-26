package com.google.ads.interactivemedia.v3.internal;

import android.media.metrics.LogSessionId;
/* loaded from: classes4.dex */
final class re {
    public static void a(qz qzVar, iv ivVar) {
        LogSessionId a = ivVar.a();
        if (a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        qzVar.f1240b.setString("log-session-id", a.getStringId());
    }
}
