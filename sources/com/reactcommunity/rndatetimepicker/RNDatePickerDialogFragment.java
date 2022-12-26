package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Calendar;
import java.util.Locale;
import o.createFromFile;
import o.fallbackToDestructiveMigration;
/* loaded from: classes7.dex */
public class RNDatePickerDialogFragment extends DialogFragment {
    private static DialogInterface.OnClickListener ag$a;
    private DialogInterface.OnDismissListener ah$a;
    private DatePickerDialog toString;
    private DatePickerDialog.OnDateSetListener valueOf;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog rNDatePickerDialogFragment = toString(getArguments(), getActivity(), this.valueOf);
        this.toString = rNDatePickerDialogFragment;
        return rNDatePickerDialogFragment;
    }

    public void valueOf(Bundle bundle) {
        createFromFile createfromfile = new createFromFile(bundle);
        this.toString.updateDate(createfromfile.HaptikSDK$b(), createfromfile.ag$a(), createfromfile.valueOf());
    }

    static DatePickerDialog ah$a(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        createFromFile createfromfile = new createFromFile(bundle);
        int HaptikSDK$b = createfromfile.HaptikSDK$b();
        int ag$a2 = createfromfile.ag$a();
        int valueOf = createfromfile.valueOf();
        RNDatePickerDisplay valueOf2 = (bundle == null || bundle.getString(ViewProps.DISPLAY, null) == null) ? RNDatePickerDisplay.DEFAULT : RNDatePickerDisplay.valueOf(bundle.getString(ViewProps.DISPLAY).toUpperCase(Locale.US));
        if (Build.VERSION.SDK_INT >= 21) {
            int i = AnonymousClass2.ah$a[valueOf2.ordinal()];
            if (i == 1 || i == 2) {
                return new fallbackToDestructiveMigration(context, context.getResources().getIdentifier(valueOf2 == RNDatePickerDisplay.CALENDAR ? "CalendarDatePickerDialog" : "SpinnerDatePickerDialog", TtmlNode.TAG_STYLE, context.getPackageName()), onDateSetListener, HaptikSDK$b, ag$a2, valueOf, valueOf2);
            }
            return new fallbackToDestructiveMigration(context, onDateSetListener, HaptikSDK$b, ag$a2, valueOf, valueOf2);
        }
        fallbackToDestructiveMigration fallbacktodestructivemigration = new fallbackToDestructiveMigration(context, onDateSetListener, HaptikSDK$b, ag$a2, valueOf, valueOf2);
        int i2 = AnonymousClass2.ah$a[valueOf2.ordinal()];
        if (i2 == 1) {
            fallbacktodestructivemigration.getDatePicker().setCalendarViewShown(true);
            fallbacktodestructivemigration.getDatePicker().setSpinnersShown(false);
        } else if (i2 == 2) {
            fallbacktodestructivemigration.getDatePicker().setCalendarViewShown(false);
        }
        return fallbacktodestructivemigration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactcommunity.rndatetimepicker.RNDatePickerDialogFragment$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[RNDatePickerDisplay.values().length];
            ah$a = iArr;
            try {
                iArr[RNDatePickerDisplay.CALENDAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[RNDatePickerDisplay.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static DatePickerDialog toString(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog ah$a = ah$a(bundle, context, onDateSetListener);
        if (bundle != null && bundle.containsKey("neutralButtonLabel")) {
            ah$a.setButton(-3, bundle.getString("neutralButtonLabel"), ag$a);
        }
        DatePicker datePicker = ah$a.getDatePicker();
        if (bundle != null && bundle.containsKey("minimumDate")) {
            calendar.setTimeInMillis(bundle.getLong("minimumDate"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            datePicker.setMinDate(calendar.getTimeInMillis());
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle != null && bundle.containsKey("maximumDate")) {
            calendar.setTimeInMillis(bundle.getLong("maximumDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis());
        }
        return ah$a;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.ah$a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.valueOf = onDateSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(DialogInterface.OnDismissListener onDismissListener) {
        this.ah$a = onDismissListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(DialogInterface.OnClickListener onClickListener) {
        ag$a = onClickListener;
    }
}
