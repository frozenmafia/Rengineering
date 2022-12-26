package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* loaded from: classes4.dex */
final class jv {
    public static void a(AudioTrack audioTrack, iv ivVar) {
        LogSessionId a = ivVar.a();
        if (a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(a);
    }
}
