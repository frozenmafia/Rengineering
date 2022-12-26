package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Locale;
import o.createFromFile;
import o.enableMultiInstanceInvalidation;
import o.fallbackToDestructiveMigrationFrom;
/* loaded from: classes7.dex */
public class RNTimePickerDialogFragment extends DialogFragment {
    private static DialogInterface.OnClickListener values;
    private TimePickerDialog ah$a;
    private TimePickerDialog.OnTimeSetListener toString;
    private DialogInterface.OnDismissListener valueOf;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        TimePickerDialog ag$a = ag$a(getArguments(), getActivity(), this.toString);
        this.ah$a = ag$a;
        return ag$a;
    }

    public void values(Bundle bundle) {
        createFromFile createfromfile = new createFromFile(bundle);
        this.ah$a.updateTime(createfromfile.ah$a(), createfromfile.values());
    }

    static TimePickerDialog ah$a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        int i;
        createFromFile createfromfile = new createFromFile(bundle);
        int ah$a = createfromfile.ah$a();
        int values2 = createfromfile.values();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        int i2 = (bundle == null || !enableMultiInstanceInvalidation.ah$a(bundle.getInt("minuteInterval"))) ? 1 : bundle.getInt("minuteInterval");
        RNTimePickerDisplay rNTimePickerDisplay = RNTimePickerDisplay.DEFAULT;
        if (bundle != null && bundle.getString(ViewProps.DISPLAY, null) != null) {
            rNTimePickerDisplay = RNTimePickerDisplay.valueOf(bundle.getString(ViewProps.DISPLAY).toUpperCase(Locale.US));
        }
        RNTimePickerDisplay rNTimePickerDisplay2 = rNTimePickerDisplay;
        boolean z = bundle != null ? bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context)) : is24HourFormat;
        if (Build.VERSION.SDK_INT >= 21 && ((i = AnonymousClass3.valueOf[rNTimePickerDisplay2.ordinal()]) == 1 || i == 2)) {
            return new fallbackToDestructiveMigrationFrom(context, context.getResources().getIdentifier(rNTimePickerDisplay2 == RNTimePickerDisplay.CLOCK ? "ClockTimePickerDialog" : "SpinnerTimePickerDialog", TtmlNode.TAG_STYLE, context.getPackageName()), onTimeSetListener, ah$a, values2, i2, z, rNTimePickerDisplay2);
        }
        return new fallbackToDestructiveMigrationFrom(context, onTimeSetListener, ah$a, values2, i2, z, rNTimePickerDisplay2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactcommunity.rndatetimepicker.RNTimePickerDialogFragment$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[RNTimePickerDisplay.values().length];
            valueOf = iArr;
            try {
                iArr[RNTimePickerDisplay.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[RNTimePickerDisplay.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static TimePickerDialog ag$a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        TimePickerDialog ah$a = ah$a(bundle, context, onTimeSetListener);
        if (bundle != null && bundle.containsKey("neutralButtonLabel")) {
            ah$a.setButton(-3, bundle.getString("neutralButtonLabel"), values);
        }
        return ah$a;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.valueOf;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void ag$a(DialogInterface.OnDismissListener onDismissListener) {
        this.valueOf = onDismissListener;
    }

    public void ah$a(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.toString = onTimeSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(DialogInterface.OnClickListener onClickListener) {
        values = onClickListener;
    }
}
