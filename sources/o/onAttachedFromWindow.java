package o;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
/* loaded from: classes.dex */
public final class onAttachedFromWindow {
    private int ag$a;
    private String ah$a = SessionDescription.SUPPORTED_SDP_VERSION;
    private int toString;

    public final int ag$a() {
        return this.ag$a;
    }

    public final void ah$a(int i) {
        this.ag$a = i;
    }

    public final void valueOf(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }
}
