package com.appsamurai.storyly.exoplayer2.hls.playlist;

import android.net.Uri;
import java.io.IOException;
import o.SelfDestructiveThread;
import o.getClip;
import o.onTypefaceResult$ah$a;
import o.toContentInfoCompat;
/* loaded from: classes3.dex */
public interface HlsPlaylistTracker {

    /* loaded from: classes3.dex */
    public interface toString {
        void invoke();

        boolean valueOf(Uri uri, SelfDestructiveThread.AnonymousClass3.valueOf valueof, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface valueOf {
        void toString(getClip getclip);
    }

    getClip ag$a(Uri uri, boolean z);

    void ag$a(Uri uri) throws IOException;

    boolean ag$a();

    long ah$a();

    boolean ah$a(Uri uri, long j);

    void invoke();

    boolean toString(Uri uri);

    toContentInfoCompat valueOf();

    void valueOf(Uri uri);

    void valueOf(Uri uri, onTypefaceResult$ah$a ontypefaceresult_ah_a, valueOf valueof);

    void valueOf(toString tostring);

    void values() throws IOException;

    void values(toString tostring);

    /* loaded from: classes3.dex */
    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }
}
