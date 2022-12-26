package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.dispatch;
import o.setRootViewData;
import o.setSystemWindowInsets;
@Deprecated
/* loaded from: classes3.dex */
public class RequestManagerFragment extends Fragment {
    private dispatch ag$a;
    private final Set<RequestManagerFragment> ah$a;
    private RequestManagerFragment ah$b;
    private final setSystemWindowInsets toString;
    private final setRootViewData valueOf;
    private Fragment values;

    public RequestManagerFragment() {
        this(new setRootViewData());
    }

    RequestManagerFragment(setRootViewData setrootviewdata) {
        this.toString = new valueOf();
        this.ah$a = new HashSet();
        this.valueOf = setrootviewdata;
    }

    public void toString(dispatch dispatchVar) {
        this.ag$a = dispatchVar;
    }

    public setRootViewData valueOf() {
        return this.valueOf;
    }

    public dispatch values() {
        return this.ag$a;
    }

    public setSystemWindowInsets ag$a() {
        return this.toString;
    }

    private void toString(RequestManagerFragment requestManagerFragment) {
        this.ah$a.add(requestManagerFragment);
    }

    private void ag$a(RequestManagerFragment requestManagerFragment) {
        this.ah$a.remove(requestManagerFragment);
    }

    Set<RequestManagerFragment> ah$a() {
        if (equals(this.ah$b)) {
            return Collections.unmodifiableSet(this.ah$a);
        }
        if (this.ah$b == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.ah$b.ah$a()) {
            if (valueOf(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void toString(Fragment fragment) {
        this.values = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        ag$a(fragment.getActivity());
    }

    private Fragment HaptikSDK$c() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.values;
    }

    private boolean valueOf(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void ag$a(Activity activity) {
        HaptikSDK$a();
        RequestManagerFragment builderImpl20 = Glide.ag$a(activity).HaptikSDK$a().toString(activity);
        this.ah$b = builderImpl20;
        if (equals(builderImpl20)) {
            return;
        }
        this.ah$b.toString(this);
    }

    private void HaptikSDK$a() {
        RequestManagerFragment requestManagerFragment = this.ah$b;
        if (requestManagerFragment != null) {
            requestManagerFragment.ag$a(this);
            this.ah$b = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            ag$a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        HaptikSDK$a();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.valueOf.valueOf();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.valueOf.ag$a();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.valueOf.ah$a();
        HaptikSDK$a();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + HaptikSDK$c() + "}";
    }

    /* loaded from: classes3.dex */
    class valueOf implements setSystemWindowInsets {
        valueOf() {
        }

        @Override // o.setSystemWindowInsets
        public Set<dispatch> values() {
            Set<RequestManagerFragment> ah$a = RequestManagerFragment.this.ah$a();
            HashSet hashSet = new HashSet(ah$a.size());
            for (RequestManagerFragment requestManagerFragment : ah$a) {
                if (requestManagerFragment.values() != null) {
                    hashSet.add(requestManagerFragment.values());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }
}
