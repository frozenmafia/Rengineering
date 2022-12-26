package o;

import com.facebook.react.bridge.Promise;
/* loaded from: classes7.dex */
public class addTypeConverter {
    public static void ah$a(androidx.fragment.app.FragmentActivity fragmentActivity, String str, Promise promise) {
        if (fragmentActivity == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
            boolean z = dialogFragment != null;
            if (z) {
                dialogFragment.dismiss();
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
