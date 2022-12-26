package androidx.fragment.app;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class FragmentKt {
    public static final void setFragmentResult(Fragment fragment, String str, Bundle bundle) {
        runAnimators.ag$a(fragment, "$this$setFragmentResult");
        runAnimators.ag$a(str, "requestKey");
        runAnimators.ag$a(bundle, Constants.RESULT);
        fragment.getParentFragmentManager().setFragmentResult(str, bundle);
    }

    public static final void clearFragmentResult(Fragment fragment, String str) {
        runAnimators.ag$a(fragment, "$this$clearFragmentResult");
        runAnimators.ag$a(str, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(str);
    }

    public static final void setFragmentResultListener(Fragment fragment, String str, final Transition<? super String, ? super Bundle, setAnimationMatrix> transition) {
        runAnimators.ag$a(fragment, "$this$setFragmentResultListener");
        runAnimators.ag$a(str, "requestKey");
        runAnimators.ag$a(transition, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0
            @Override // androidx.fragment.app.FragmentResultListener
            public final /* synthetic */ void onFragmentResult(String str2, Bundle bundle) {
                runAnimators.ag$a(str2, "p0");
                runAnimators.ag$a(bundle, "p1");
                runAnimators.ah$a(Transition.this.invoke(str2, bundle), "invoke(...)");
            }
        });
    }

    public static final void clearFragmentResultListener(Fragment fragment, String str) {
        runAnimators.ag$a(fragment, "$this$clearFragmentResultListener");
        runAnimators.ag$a(str, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
    }
}
