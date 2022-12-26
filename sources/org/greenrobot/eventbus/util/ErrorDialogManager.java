package org.greenrobot.eventbus.util;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import o.FoldingFeature;
import o.access$windowExtensionsProviderClass;
import o.isFoldingFeatureValid;
/* loaded from: classes8.dex */
public class ErrorDialogManager {
    public static access$windowExtensionsProviderClass<?> valueOf;

    /* loaded from: classes8.dex */
    public static class SupportManagerFragment extends Fragment {
        private Object ag$a;
        private boolean ah$a;
        protected boolean toString;
        private FoldingFeature.State.Companion valueOf;
        protected Bundle values;

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            FoldingFeature.State.Companion valueOf = ErrorDialogManager.valueOf.ah$a.valueOf();
            this.valueOf = valueOf;
            valueOf.ah$a(this);
            this.ah$a = true;
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            if (this.ah$a) {
                this.ah$a = false;
                return;
            }
            FoldingFeature.State.Companion valueOf = ErrorDialogManager.valueOf.ah$a.valueOf();
            this.valueOf = valueOf;
            valueOf.ah$a(this);
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            this.valueOf.values(this);
            super.onPause();
        }

        public void onEventMainThread(isFoldingFeatureValid isfoldingfeaturevalid) {
            if (ErrorDialogManager.toString(this.ag$a, isfoldingfeaturevalid)) {
                ErrorDialogManager.valueOf(isfoldingfeaturevalid);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                DialogFragment dialogFragment2 = (DialogFragment) ErrorDialogManager.valueOf.toString(isfoldingfeaturevalid, this.toString, this.values);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, "de.greenrobot.eventbus.error_dialog");
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class HoneycombManagerFragment extends android.app.Fragment {
        protected Bundle ag$a;
        private FoldingFeature.State.Companion ah$a;
        protected boolean valueOf;
        private Object values;

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            FoldingFeature.State.Companion valueOf = ErrorDialogManager.valueOf.ah$a.valueOf();
            this.ah$a = valueOf;
            valueOf.ah$a(this);
        }

        @Override // android.app.Fragment
        public void onPause() {
            this.ah$a.values(this);
            super.onPause();
        }

        public void onEventMainThread(isFoldingFeatureValid isfoldingfeaturevalid) {
            if (ErrorDialogManager.toString(this.values, isfoldingfeaturevalid)) {
                ErrorDialogManager.valueOf(isfoldingfeaturevalid);
                android.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                android.app.DialogFragment dialogFragment = (android.app.DialogFragment) fragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                android.app.DialogFragment dialogFragment2 = (android.app.DialogFragment) ErrorDialogManager.valueOf.toString(isfoldingfeaturevalid, this.valueOf, this.ag$a);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, "de.greenrobot.eventbus.error_dialog");
                }
            }
        }
    }

    protected static void valueOf(isFoldingFeatureValid isfoldingfeaturevalid) {
        if (valueOf.ah$a.HaptikSDK$c) {
            String str = valueOf.ah$a.HaptikSDK$b;
            if (str == null) {
                str = FoldingFeature.State.Companion.toString;
            }
            Log.i(str, "Error dialog manager received exception", isfoldingfeaturevalid.ag$a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean toString(Object obj, isFoldingFeatureValid isfoldingfeaturevalid) {
        Object ag$a;
        return isfoldingfeaturevalid == null || (ag$a = isfoldingfeaturevalid.ag$a()) == null || ag$a.equals(obj);
    }
}
