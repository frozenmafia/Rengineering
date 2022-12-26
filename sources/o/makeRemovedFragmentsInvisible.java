package o;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes4.dex */
public final class makeRemovedFragmentsInvisible {
    private android.app.Fragment ah$a;
    private androidx.fragment.app.Fragment valueOf;

    public final androidx.fragment.app.Fragment ag$a() {
        return this.valueOf;
    }

    public final android.app.Fragment valueOf() {
        return this.ah$a;
    }

    public makeRemovedFragmentsInvisible(androidx.fragment.app.Fragment fragment) {
        runAnimators.ag$a(fragment, "fragment");
        this.valueOf = fragment;
    }

    public makeRemovedFragmentsInvisible(android.app.Fragment fragment) {
        runAnimators.ag$a(fragment, "fragment");
        this.ah$a = fragment;
    }

    public final void ah$a(Intent intent, int i) {
        androidx.fragment.app.Fragment fragment = this.valueOf;
        if (fragment != null) {
            if (fragment == null) {
                return;
            }
            fragment.startActivityForResult(intent, i);
            return;
        }
        android.app.Fragment fragment2 = this.ah$a;
        if (fragment2 == null) {
            return;
        }
        fragment2.startActivityForResult(intent, i);
    }

    public final Activity ah$a() {
        androidx.fragment.app.Fragment fragment = this.valueOf;
        if (fragment != null) {
            return fragment != null ? fragment.getActivity() : null;
        }
        android.app.Fragment fragment2 = this.ah$a;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }
}
