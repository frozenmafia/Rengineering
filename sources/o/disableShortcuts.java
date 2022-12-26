package o;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.widget.DatePicker;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes3.dex */
public class disableShortcuts implements DatePickerDialog.OnDateSetListener {
    private Dialog HaptikSDK$b = ah$a();
    String ag$a;
    private Activity ah$a;
    toString toString;
    String valueOf;
    String values;

    /* loaded from: classes3.dex */
    public interface toString {
        void ag$a(int i, int i2, int i3, Date date);
    }

    public disableShortcuts(Activity activity, toString tostring) {
        this.ah$a = activity;
        this.toString = tostring;
    }

    public Dialog ah$a() {
        int i;
        int i2;
        int i3;
        Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        String str = this.ag$a;
        if (str != null && this.values != null && this.valueOf != null) {
            int intValue = Integer.valueOf(str).intValue();
            i2 = intValue;
            i3 = Integer.valueOf(this.valueOf).intValue();
            i = Integer.valueOf(this.values).intValue();
        } else {
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            i = calendar.get(5);
            i2 = i4;
            i3 = i5;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.ah$a, this, i2, i3, i);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(1) - 18, calendar2.get(2), calendar2.get(5));
        datePickerDialog.getDatePicker().setMaxDate(calendar2.getTimeInMillis());
        return datePickerDialog;
    }

    public void valueOf() {
        this.HaptikSDK$b.show();
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        toString(i, i2 + 1, i3);
    }

    public void toString(int i, int i2, int i3) {
        this.ag$a = Integer.toString(i);
        this.valueOf = Integer.toString(i2);
        this.values = Integer.toString(i3);
        int intValue = Integer.valueOf(this.ag$a).intValue();
        int intValue2 = Integer.valueOf(this.valueOf).intValue();
        int intValue3 = Integer.valueOf(this.values).intValue();
        this.toString.ag$a(intValue, intValue2, intValue3, new Date(intValue - 1900, intValue2 - 1, intValue3));
    }
}
