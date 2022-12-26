package defpackage;

import android.app.Fragment;
import android.os.Bundle;
import o.IMediaSession;
import o.setPlaybackSpeed;
import o.setRepeatMode;
/* renamed from: bu  reason: default package */
/* loaded from: classes6.dex */
public final class bu extends Fragment implements IMediaSession.Stub {
    private setPlaybackSpeed valueOf = new setPlaybackSpeed(this);

    @Override // o.IMediaSession.Stub
    public Object ag$a(Bundle bundle) {
        return getFragmentManager().getFragment(bundle, "wrappedFragment");
    }

    @Override // o.IMediaSession.Stub
    public Object ah$a() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.valueOf.toString(bundle);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.valueOf.ah$a(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // o.IMediaSession.Stub
    public setRepeatMode valueOf() {
        return this.valueOf;
    }
}
