package o;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import com.reactcommunity.rndatetimepicker.RNDatePickerDisplay;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes7.dex */
public class fallbackToDestructiveMigration extends DatePickerDialog {
    public fallbackToDestructiveMigration(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3, RNDatePickerDisplay rNDatePickerDisplay) {
        super(context, onDateSetListener, i, i2, i3);
        values(context, i, i2, i3, rNDatePickerDisplay);
    }

    public fallbackToDestructiveMigration(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4, RNDatePickerDisplay rNDatePickerDisplay) {
        super(context, i, onDateSetListener, i2, i3, i4);
        values(context, i2, i3, i4, rNDatePickerDisplay);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    private void values(Context context, int i, int i2, int i3, RNDatePickerDisplay rNDatePickerDisplay) {
        if (Build.VERSION.SDK_INT == 24 && rNDatePickerDisplay == RNDatePickerDisplay.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get(null), 16843612, 0).recycle();
                DatePicker datePicker = (DatePicker) setJournalMode.toString(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field setjournalmode = setJournalMode.toString(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                if (setjournalmode.get(datePicker).getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    setjournalmode.set(datePicker, null);
                    datePicker.removeAllViews();
                    Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    setjournalmode.set(datePicker, declaredMethod.invoke(datePicker, context, null, 16843612, 0));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i, i2, i3, this);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
