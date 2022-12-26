package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.dispatch;
import o.setRootViewData;
import o.setSystemWindowInsets;
/* loaded from: classes3.dex */
public class SupportRequestManagerFragment extends Fragment {
    private SupportRequestManagerFragment HaptikSDK$c;
    private final Set<SupportRequestManagerFragment> ag$a;
    private final setRootViewData ah$a;
    private Fragment toString;
    private dispatch valueOf;
    private final setSystemWindowInsets values;

    public SupportRequestManagerFragment() {
        this(new setRootViewData());
    }

    public SupportRequestManagerFragment(setRootViewData setrootviewdata) {
        this.values = new toString();
        this.ag$a = new HashSet();
        this.ah$a = setrootviewdata;
    }

    public void ah$a(dispatch dispatchVar) {
        this.valueOf = dispatchVar;
    }

    public setRootViewData valueOf() {
        return this.ah$a;
    }

    public dispatch ag$a() {
        return this.valueOf;
    }

    public setSystemWindowInsets values() {
        return this.values;
    }

    private void toString(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.ag$a.add(supportRequestManagerFragment);
    }

    private void valueOf(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.ag$a.remove(supportRequestManagerFragment);
    }

    Set<SupportRequestManagerFragment> ah$a() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.HaptikSDK$c;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.ag$a);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.HaptikSDK$c.ah$a()) {
            if (values(supportRequestManagerFragment2.HaptikSDK$c())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void ag$a(Fragment fragment) {
        FragmentManager ah$a;
        this.toString = fragment;
        if (fragment == null || fragment.getContext() == null || (ah$a = ah$a(fragment)) == null) {
            return;
        }
        toString(fragment.getContext(), ah$a);
    }

    private static FragmentManager ah$a(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private Fragment HaptikSDK$c() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.toString;
    }

    private boolean values(Fragment fragment) {
        Fragment HaptikSDK$c = HaptikSDK$c();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(HaptikSDK$c)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void toString(Context context, FragmentManager fragmentManager) {
        HaptikSDK$b();
        SupportRequestManagerFragment ah$a = Glide.ag$a(context).HaptikSDK$a().ah$a(fragmentManager);
        this.HaptikSDK$c = ah$a;
        if (equals(ah$a)) {
            return;
        }
        this.HaptikSDK$c.toString(this);
    }

    private void HaptikSDK$b() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.HaptikSDK$c;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.valueOf(this);
            this.HaptikSDK$c = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager ah$a = ah$a(this);
        if (ah$a == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            toString(getContext(), ah$a);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.toString = null;
        HaptikSDK$b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.ah$a.valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.ah$a.ag$a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.ah$a.ah$a();
        HaptikSDK$b();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + HaptikSDK$c() + "}";
    }

    /* loaded from: classes3.dex */
    class toString implements setSystemWindowInsets {
        toString() {
        }

        @Override // o.setSystemWindowInsets
        public Set<dispatch> values() {
            Set<SupportRequestManagerFragment> ah$a = SupportRequestManagerFragment.this.ah$a();
            HashSet hashSet = new HashSet(ah$a.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : ah$a) {
                if (supportRequestManagerFragment.ag$a() != null) {
                    hashSet.add(supportRequestManagerFragment.ag$a());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }
}
