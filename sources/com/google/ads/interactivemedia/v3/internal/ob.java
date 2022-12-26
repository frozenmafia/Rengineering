package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
/* loaded from: classes4.dex */
final class ob {
    public static void a(MediaDrm mediaDrm, byte[] bArr, iv ivVar) {
        LogSessionId a = ivVar.a();
        if (a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        af.s(playbackComponent);
        playbackComponent.setLogSessionId(a);
    }

    public static boolean b(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }
}
