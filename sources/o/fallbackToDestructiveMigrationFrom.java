package o;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TimePicker;
import com.reactcommunity.rndatetimepicker.RNTimePickerDisplay;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* loaded from: classes7.dex */
public class fallbackToDestructiveMigrationFrom extends enableMultiInstanceInvalidation {
    @Override // o.enableMultiInstanceInvalidation, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // o.enableMultiInstanceInvalidation, android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        super.onClick(dialogInterface, i);
    }

    @Override // o.enableMultiInstanceInvalidation, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // o.enableMultiInstanceInvalidation, android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public /* bridge */ /* synthetic */ void onTimeChanged(TimePicker timePicker, int i, int i2) {
        super.onTimeChanged(timePicker, i, i2);
    }

    @Override // o.enableMultiInstanceInvalidation, android.app.TimePickerDialog
    public /* bridge */ /* synthetic */ void updateTime(int i, int i2) {
        super.updateTime(i, i2);
    }

    public fallbackToDestructiveMigrationFrom(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, int i3, boolean z, RNTimePickerDisplay rNTimePickerDisplay) {
        super(context, onTimeSetListener, i, i2, i3, z, rNTimePickerDisplay);
        toString(context, i, i2, z, rNTimePickerDisplay);
    }

    public fallbackToDestructiveMigrationFrom(Context context, int i, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, int i4, boolean z, RNTimePickerDisplay rNTimePickerDisplay) {
        super(context, i, onTimeSetListener, i2, i3, i4, z, rNTimePickerDisplay);
        toString(context, i2, i3, z, rNTimePickerDisplay);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    private void toString(Context context, int i, int i2, boolean z, RNTimePickerDisplay rNTimePickerDisplay) {
        if (Build.VERSION.SDK_INT == 24 && rNTimePickerDisplay == RNTimePickerDisplay.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get(null), 16843933, 0).recycle();
                TimePicker timePicker = (TimePicker) setJournalMode.toString(TimePickerDialog.class, TimePicker.class, "mTimePicker").get(this);
                Field setjournalmode = setJournalMode.toString(TimePicker.class, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = setjournalmode.get(timePicker);
                Class<?> cls = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls) {
                    setjournalmode.set(timePicker, null);
                    timePicker.removeAllViews();
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE);
                    constructor.setAccessible(true);
                    setjournalmode.set(timePicker, constructor.newInstance(timePicker, context, null, 16843933, 0));
                    timePicker.setIs24HourView(Boolean.valueOf(z));
                    timePicker.setCurrentHour(Integer.valueOf(i));
                    timePicker.setCurrentMinute(Integer.valueOf(i2));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
