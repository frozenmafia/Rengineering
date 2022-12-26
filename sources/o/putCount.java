package o;

import android.widget.TextView;
import com.app.dream11.core.service.graphql.api.fragment.HallOfFameUsersFragment;
import o.Visibility;
/* loaded from: classes3.dex */
public final class putCount {
    public static final putCount ah$a = new putCount();

    private putCount() {
    }

    @androidx.databinding.BindingAdapter({"stateNumber"})
    public static final void values(TextView textView, HallOfFameUsersFragment hallOfFameUsersFragment) {
        runAnimators.ag$a(textView, "textView");
        if (hallOfFameUsersFragment == null) {
            return;
        }
        HallOfFameUsersFragment.State state = hallOfFameUsersFragment.getState();
        String name = state == null ? null : state.getName();
        HallOfFameUsersFragment.State state2 = hallOfFameUsersFragment.getState();
        String name2 = state2 != null ? state2.getName() : null;
        boolean z = true;
        if (!(name2 == null || name2.length() == 0)) {
            String maskedMobileNumber = hallOfFameUsersFragment.getMaskedMobileNumber();
            if (maskedMobileNumber != null && !Visibility.Mode.ag$a((CharSequence) maskedMobileNumber)) {
                z = false;
            }
            if (!z) {
                name = name + textView.getContext().getString(com.app.dream11Pro.R.string.res_0x7f120982);
            }
        }
        textView.setText(name + hallOfFameUsersFragment.getMaskedMobileNumber());
    }
}
