package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.dream11.react.D11ReactFragment;
import o.FragmentManager;
import o.getNonConfig;
import o.onFragmentViewDestroyed;
import o.resetActiveFragments;
/* loaded from: classes6.dex */
public class ReactFragment extends Fragment implements getNonConfig {
    private resetActiveFragments ag$a;
    private FragmentManager.LifecycleAwareResultListener ah$a;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        String str = null;
        if (getArguments() != null) {
            str = getArguments().getString(D11ReactFragment.ARG_COMPONENT_NAME);
            bundle2 = getArguments().getBundle("arg_launch_options");
        } else {
            bundle2 = null;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot loadApp if component name is null");
        }
        this.ah$a = new FragmentManager.LifecycleAwareResultListener(getActivity(), values(), str, bundle2);
    }

    protected FragmentManager.PopBackStackState values() {
        return ((onFragmentViewDestroyed) getActivity().getApplication()).ICustomTabsCallback();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ah$a.ag$a();
        return this.ah$a.ah$a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.ah$a.ah$b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.ah$a.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.ah$a.HaptikSDK$a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.ah$a.ag$a(i, i2, intent, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        resetActiveFragments resetactivefragments = this.ag$a;
        if (resetactivefragments == null || !resetactivefragments.onRequestPermissionsResult(i, strArr, iArr)) {
            return;
        }
        this.ag$a = null;
    }

    @Override // o.getNonConfig
    public void requestPermissions(String[] strArr, int i, resetActiveFragments resetactivefragments) {
        this.ag$a = resetactivefragments;
        requestPermissions(strArr, i);
    }
}
