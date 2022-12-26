package o;

import com.app.dream11.ui.CountDownTimerTextView;
import java.util.Date;
/* loaded from: classes3.dex */
public final class getShortcuts {
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"endTimeForCountDown", "shouldAddSuffix", "suffixText"})
    public static final void valueOf(CountDownTimerTextView countDownTimerTextView, Date date, Boolean bool, String str) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (countDownTimerTextView != null) {
                countDownTimerTextView.setShouldShowSuffix(booleanValue);
            }
        }
        if (date != null) {
            if (countDownTimerTextView != null) {
                countDownTimerTextView.setEndTime(date);
            }
            if (countDownTimerTextView != null) {
                countDownTimerTextView.ag$a();
            }
        }
        if (str == null || countDownTimerTextView == null) {
            return;
        }
        countDownTimerTextView.setSuffixText(str);
    }

    @androidx.databinding.BindingAdapter({"timerEndListener"})
    public static final void ah$a(CountDownTimerTextView countDownTimerTextView, setShortcutInfoChangeListeners setshortcutinfochangelisteners) {
        if (countDownTimerTextView == null) {
            return;
        }
        countDownTimerTextView.setOnCountDownTimerListener(setshortcutinfochangelisteners);
    }
}
