package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import o.IMediaSession;
import o.setPlaybackSpeed;
import o.setRepeatMode;
/* renamed from: bv  reason: default package */
/* loaded from: classes.dex */
public final class bv extends Fragment implements IMediaSession.Stub {
    private setPlaybackSpeed values = new setPlaybackSpeed(this);

    @Override // o.IMediaSession.Stub
    public Object ag$a(Bundle bundle) {
        return getFragmentManager().getFragment(bundle, "wrappedFragment");
    }

    @Override // o.IMediaSession.Stub
    public Object ah$a() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.values.toString(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.values.ah$a(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // o.IMediaSession.Stub
    public setRepeatMode valueOf() {
        return this.values;
    }
}
