package o;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.reactcommunity.rndatetimepicker.RNTimePickerDisplay;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public class enableMultiInstanceInvalidation extends TimePickerDialog {
    private static int HaptikSDK$a = 154;
    private static boolean HaptikSDK$c = true;
    private static int HaptikSDK$d = 0;
    private static boolean HaptikWebView = true;
    private static char[] ah$b = {259, 254};
    private static int getInitSettings = 1;
    private Runnable HaptikSDK$b;
    private Context ag$a;
    private TimePicker ah$a;
    private final TimePickerDialog.OnTimeSetListener invoke;
    private Handler toString;
    private int valueOf;
    private RNTimePickerDisplay values;

    static /* synthetic */ boolean toString(enableMultiInstanceInvalidation enablemultiinstanceinvalidation) {
        int i = HaptikSDK$d + 77;
        getInitSettings = i % 128;
        boolean z = i % 2 == 0;
        boolean ag$a = enablemultiinstanceinvalidation.ag$a();
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = getInitSettings + 79;
        HaptikSDK$d = i2 % 128;
        int i3 = i2 % 2;
        return ag$a;
    }

    public enableMultiInstanceInvalidation(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, int i3, boolean z, RNTimePickerDisplay rNTimePickerDisplay) {
        super(context, onTimeSetListener, i, i2, z);
        this.toString = new Handler();
        this.valueOf = i3;
        this.invoke = onTimeSetListener;
        this.values = rNTimePickerDisplay;
        this.ag$a = context;
    }

    public enableMultiInstanceInvalidation(Context context, int i, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i2, int i3, int i4, boolean z, RNTimePickerDisplay rNTimePickerDisplay) {
        super(context, i, onTimeSetListener, i2, i3, z);
        try {
            this.toString = new Handler();
            try {
                this.valueOf = i4;
                this.invoke = onTimeSetListener;
                this.values = rNTimePickerDisplay;
                this.ag$a = context;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4 <= 88) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 > 30) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        if ((60 % r4) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean ah$a(int r4) {
        /*
            int r0 = o.enableMultiInstanceInvalidation.getInitSettings
            int r0 = r0 + 83
            int r1 = r0 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r1
            int r0 = r0 % 2
            r0 = 0
            r1 = 1
            if (r4 < r1) goto L10
            r2 = 0
            goto L11
        L10:
            r2 = 1
        L11:
            if (r2 == r1) goto L34
            int r2 = o.enableMultiInstanceInvalidation.getInitSettings
            int r2 = r2 + 97
            int r3 = r2 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L24
            r2 = 88
            if (r4 > r2) goto L34
            goto L2d
        L24:
            r2 = 30
            if (r4 > r2) goto L2a
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r2 == r1) goto L34
        L2d:
            r2 = 60
            int r2 = r2 % r4
            if (r2 != 0) goto L34
            r0 = 1
            goto L3e
        L34:
            int r4 = o.enableMultiInstanceInvalidation.getInitSettings     // Catch: java.lang.Exception -> L3f
            int r4 = r4 + 75
            int r1 = r4 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r1     // Catch: java.lang.Exception -> L3f
            int r4 = r4 % 2
        L3e:
            return r0
        L3f:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableMultiInstanceInvalidation.ah$a(int):boolean");
    }

    private boolean ah$b() {
        int i = HaptikSDK$d + 85;
        getInitSettings = i % 128;
        if (!(i % 2 == 0)) {
            try {
                if (this.valueOf != 1) {
                    return true;
                }
            } catch (Exception e) {
                throw e;
            }
        } else if (this.valueOf != 0) {
            return false;
        }
        int i2 = HaptikSDK$d + 113;
        getInitSettings = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    private boolean values() {
        try {
            if (this.values == RNTimePickerDisplay.SPINNER) {
                int i = getInitSettings + 97;
                HaptikSDK$d = i % 128;
                return !(i % 2 != 0);
            }
            int i2 = HaptikSDK$d + 123;
            getInitSettings = i2 % 128;
            int i3 = i2 % 2;
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    private int ag$a(int i) {
        try {
            int i2 = getInitSettings + 91;
            HaptikSDK$d = i2 % 128;
            if (i2 % 2 != 0) {
                RNTimePickerDisplay rNTimePickerDisplay = this.values;
                RNTimePickerDisplay rNTimePickerDisplay2 = RNTimePickerDisplay.SPINNER;
                Object[] objArr = null;
                int length = objArr.length;
                if ((rNTimePickerDisplay == rNTimePickerDisplay2 ? 'F' : (char) 28) != 'F') {
                    return i;
                }
            } else if (this.values != RNTimePickerDisplay.SPINNER) {
                return i;
            }
            int i3 = i * this.valueOf;
            int i4 = getInitSettings + 29;
            HaptikSDK$d = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    private int valueOf() {
        int ag$a;
        int i = getInitSettings + 69;
        HaptikSDK$d = i % 128;
        if (!(i % 2 != 0)) {
            ag$a = ag$a(this.ah$a.getCurrentMinute().intValue());
        } else {
            ag$a = ag$a(this.ah$a.getCurrentMinute().intValue());
            Object obj = null;
            super.hashCode();
        }
        int i2 = HaptikSDK$d + 41;
        getInitSettings = i2 % 128;
        if ((i2 % 2 == 0 ? TokenParser.ESCAPE : 'K') != '\\') {
            return ag$a;
        }
        int i3 = 59 / 0;
        return ag$a;
    }

    private int valueOf(int i) {
        int i2 = HaptikSDK$d + 65;
        getInitSettings = i2 % 128;
        int i3 = i2 % 2;
        int round = Math.round(i / this.valueOf);
        int i4 = this.valueOf;
        int i5 = round * i4;
        if ((i5 == 60 ? 'K' : (char) 23) != 23) {
            i5 -= i4;
        }
        int i6 = getInitSettings + 111;
        HaptikSDK$d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 33 / 0;
            return i5;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (values() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        r3 = o.enableMultiInstanceInvalidation.getInitSettings + 39;
        o.enableMultiInstanceInvalidation.HaptikSDK$d = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new java.lang.RuntimeException(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void values(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = o.enableMultiInstanceInvalidation.getInitSettings
            int r0 = r0 + 29
            int r1 = r0 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r1
            int r0 = r0 % 2
            r1 = 24
            if (r0 == 0) goto L11
            r0 = 12
            goto L13
        L11:
            r0 = 24
        L13:
            if (r0 == r1) goto L20
            boolean r0 = r2.values()
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L31
            goto L26
        L1e:
            r3 = move-exception
            throw r3
        L20:
            boolean r0 = r2.values()
            if (r0 != 0) goto L31
        L26:
            int r3 = o.enableMultiInstanceInvalidation.getInitSettings
            int r3 = r3 + 39
            int r0 = r3 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r0
            int r3 = r3 % 2
            return
        L31:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableMultiInstanceInvalidation.values(java.lang.String):void");
    }

    private boolean values(int i) {
        int i2 = HaptikSDK$d + 67;
        getInitSettings = i2 % 128;
        if (i2 % 2 != 0) {
            values("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
            if (!ah$b()) {
                return false;
            }
        } else {
            values("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
            int i3 = 11 / 0;
            if (!ah$b()) {
                return false;
            }
        }
        if (!(i == valueOf(i))) {
            int i4 = getInitSettings + 51;
            HaptikSDK$d = i4 % 128;
            int i5 = i4 % 2;
            int i6 = getInitSettings + 95;
            HaptikSDK$d = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        return false;
    }

    private boolean ag$a() {
        int i = HaptikSDK$d + 51;
        getInitSettings = i % 128;
        int i2 = i % 2;
        View findViewById = findViewById(this.ag$a.getResources().getIdentifier("input_mode", values(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-126, -127}).intern(), "android"));
        if (findViewById == null) {
            return false;
        }
        int i3 = getInitSettings + 37;
        HaptikSDK$d = i3 % 128;
        int i4 = i3 % 2;
        if (findViewById.hasFocus()) {
            int i5 = HaptikSDK$d + 67;
            getInitSettings = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        return false;
    }

    private void valueOf(final TimePicker timePicker, final int i, final int i2) {
        values("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
        Runnable runnable = new Runnable() { // from class: o.enableMultiInstanceInvalidation.1
            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT >= 23) {
                    timePicker.setHour(i);
                    timePicker.setMinute(i2);
                } else {
                    timePicker.setCurrentHour(Integer.valueOf(i));
                    timePicker.setCurrentMinute(0);
                    timePicker.setCurrentMinute(Integer.valueOf(i2));
                }
                if (enableMultiInstanceInvalidation.toString(enableMultiInstanceInvalidation.this)) {
                    View findFocus = timePicker.findFocus();
                    if (findFocus instanceof EditText) {
                        EditText editText = (EditText) findFocus;
                        editText.setSelection(editText.getText().length());
                        return;
                    }
                    Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
                }
            }
        };
        try {
            this.HaptikSDK$b = runnable;
            this.toString.postDelayed(runnable, 500L);
            int i3 = HaptikSDK$d + 43;
            try {
                getInitSettings = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((!values() ? 3 : '`') != '`') goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (values() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (values(r0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r1 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        valueOf(r5, r6, valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        super.onTimeChanged(r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        r5 = o.enableMultiInstanceInvalidation.HaptikSDK$d + 53;
        o.enableMultiInstanceInvalidation.getInitSettings = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        return;
     */
    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTimeChanged(android.widget.TimePicker r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = o.enableMultiInstanceInvalidation.getInitSettings
            int r0 = r0 + 71
            int r1 = r0 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L2c
            int r0 = r4.ag$a(r7)
            android.os.Handler r2 = r4.toString
            java.lang.Runnable r3 = r4.HaptikSDK$b
            r2.removeCallbacks(r3)
            boolean r2 = r4.values()
            r3 = 38
            int r3 = r3 / r1
            r3 = 96
            if (r2 != 0) goto L25
            r2 = 3
            goto L27
        L25:
            r2 = 96
        L27:
            if (r2 == r3) goto L4e
            goto L3d
        L2a:
            r5 = move-exception
            throw r5
        L2c:
            int r0 = r4.ag$a(r7)
            android.os.Handler r2 = r4.toString
            java.lang.Runnable r3 = r4.HaptikSDK$b
            r2.removeCallbacks(r3)
            boolean r2 = r4.values()
            if (r2 != 0) goto L4e
        L3d:
            boolean r2 = r4.values(r0)
            if (r2 == 0) goto L44
            r1 = 1
        L44:
            if (r1 == 0) goto L4e
            int r7 = r4.valueOf(r0)
            r4.valueOf(r5, r6, r7)
            goto L51
        L4e:
            super.onTimeChanged(r5, r6, r7)
        L51:
            int r5 = o.enableMultiInstanceInvalidation.HaptikSDK$d
            int r5 = r5 + 53
            int r6 = r5 % 128
            o.enableMultiInstanceInvalidation.getInitSettings = r6
            int r5 = r5 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableMultiInstanceInvalidation.onTimeChanged(android.widget.TimePicker, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r5.ah$a != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
        if (r7 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        r0 = ')';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        r0 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        if (r0 == ')') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
        if (ah$b() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        r6 = o.enableMultiInstanceInvalidation.getInitSettings + 79;
        o.enableMultiInstanceInvalidation.HaptikSDK$d = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
        r6 = r5.ah$a.getCurrentHour().intValue();
        r7 = valueOf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (values() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        r7 = valueOf(r7);
        r0 = o.enableMultiInstanceInvalidation.HaptikSDK$d + 49;
        o.enableMultiInstanceInvalidation.getInitSettings = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
        r0 = r5.invoke;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
        if (r3 == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        r3 = o.enableMultiInstanceInvalidation.getInitSettings + 11;
        o.enableMultiInstanceInvalidation.HaptikSDK$d = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
        if ((r3 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
        if (r1 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
        r0.onTimeSet(r5.ah$a, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
        r0.onTimeSet(r5.ah$a, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        r6 = 19 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
        super.onClick(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.content.DialogInterface r6, int r7) {
        /*
            r5 = this;
            int r0 = o.enableMultiInstanceInvalidation.HaptikSDK$d
            int r0 = r0 + 69
            int r1 = r0 % 128
            o.enableMultiInstanceInvalidation.getInitSettings = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L21
            android.widget.TimePicker r0 = r5.ah$a     // Catch: java.lang.Exception -> L1e
            r3 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L92
            goto L25
        L1c:
            r6 = move-exception
            throw r6
        L1e:
            r6 = move-exception
            goto L91
        L21:
            android.widget.TimePicker r0 = r5.ah$a
            if (r0 == 0) goto L92
        L25:
            r0 = -1
            r3 = 41
            if (r7 != r0) goto L2d
            r0 = 41
            goto L2f
        L2d:
            r0 = 84
        L2f:
            if (r0 == r3) goto L32
            goto L92
        L32:
            boolean r0 = r5.ah$b()
            if (r0 == 0) goto L92
            int r6 = o.enableMultiInstanceInvalidation.getInitSettings     // Catch: java.lang.Exception -> L1e
            int r6 = r6 + 79
            int r7 = r6 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r7
            int r6 = r6 % 2
            android.widget.TimePicker r6 = r5.ah$a     // Catch: java.lang.Exception -> L8f
            java.lang.Integer r6 = r6.getCurrentHour()     // Catch: java.lang.Exception -> L8f
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L8f
            int r7 = r5.valueOf()     // Catch: java.lang.Exception -> L8f
            boolean r0 = r5.values()     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L57
            goto L65
        L57:
            int r7 = r5.valueOf(r7)
            int r0 = o.enableMultiInstanceInvalidation.HaptikSDK$d
            int r0 = r0 + 49
            int r3 = r0 % 128
            o.enableMultiInstanceInvalidation.getInitSettings = r3
            int r0 = r0 % 2
        L65:
            android.app.TimePickerDialog$OnTimeSetListener r0 = r5.invoke
            if (r0 == 0) goto L6b
            r3 = 1
            goto L6c
        L6b:
            r3 = 0
        L6c:
            if (r3 == r1) goto L6f
            goto L95
        L6f:
            int r3 = o.enableMultiInstanceInvalidation.getInitSettings
            int r3 = r3 + 11
            int r4 = r3 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L7c
            r1 = 0
        L7c:
            if (r1 == 0) goto L84
            android.widget.TimePicker r1 = r5.ah$a
            r0.onTimeSet(r1, r6, r7)
            goto L95
        L84:
            android.widget.TimePicker r1 = r5.ah$a
            r0.onTimeSet(r1, r6, r7)
            r6 = 19
            int r6 = r6 / r2
            goto L95
        L8d:
            r6 = move-exception
            throw r6
        L8f:
            r6 = move-exception
            throw r6
        L91:
            throw r6
        L92:
            super.onClick(r6, r7)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableMultiInstanceInvalidation.onClick(android.content.DialogInterface, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (values() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r0 ? false : true) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        super.updateTime(r5, valueOf(valueOf()) / r4.valueOf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        super.updateTime(r5, valueOf(r6));
     */
    @Override // android.app.TimePickerDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateTime(int r5, int r6) {
        /*
            r4 = this;
            int r0 = o.enableMultiInstanceInvalidation.HaptikSDK$d     // Catch: java.lang.Exception -> L5d
            int r0 = r0 + 27
            int r1 = r0 % 128
            o.enableMultiInstanceInvalidation.getInitSettings = r1     // Catch: java.lang.Exception -> L5d
            int r0 = r0 % 2
            boolean r0 = r4.ah$b()
            if (r0 == 0) goto L4f
            int r0 = o.enableMultiInstanceInvalidation.HaptikSDK$d
            int r0 = r0 + 35
            int r1 = r0 % 128
            o.enableMultiInstanceInvalidation.getInitSettings = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == r2) goto L2a
            boolean r0 = r4.values()
            if (r0 == 0) goto L45
            goto L36
        L2a:
            boolean r0 = r4.values()
            r3 = 0
            int r3 = r3.length     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L33
            goto L34
        L33:
            r1 = 1
        L34:
            if (r1 == r2) goto L45
        L36:
            int r6 = r4.valueOf()
            int r6 = r4.valueOf(r6)
            int r0 = r4.valueOf
            int r6 = r6 / r0
            super.updateTime(r5, r6)
            goto L52
        L45:
            int r6 = r4.valueOf(r6)
            super.updateTime(r5, r6)
            goto L52
        L4d:
            r5 = move-exception
            throw r5
        L4f:
            super.updateTime(r5, r6)
        L52:
            int r5 = o.enableMultiInstanceInvalidation.getInitSettings
            int r5 = r5 + 115
            int r6 = r5 % 128
            o.enableMultiInstanceInvalidation.HaptikSDK$d = r6
            int r5 = r5 % 2
            return
        L5d:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableMultiInstanceInvalidation.updateTime(int, int):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(!ah$b())) {
            int i = getInitSettings + 91;
            HaptikSDK$d = i % 128;
            if ((i % 2 != 0 ? '^' : 'F') != 'F') {
                HaptikSDK$c();
                int i2 = 45 / 0;
            } else {
                HaptikSDK$c();
            }
        }
        int i3 = HaptikSDK$d + 55;
        getInitSettings = i3 % 128;
        int i4 = i3 % 2;
    }

    private void HaptikSDK$c() {
        int i = getInitSettings + 9;
        HaptikSDK$d = i % 128;
        int i2 = i % 2;
        TimePicker timePicker = (TimePicker) findViewById(this.ag$a.getResources().getIdentifier("timePicker", values(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-126, -127}).intern(), "android"));
        this.ah$a = timePicker;
        int intValue = timePicker.getCurrentMinute().intValue();
        if ((values() ? (char) 17 : 'V') == 17) {
            int i3 = HaptikSDK$d + 45;
            getInitSettings = i3 % 128;
            int i4 = i3 % 2;
            ah$a();
            this.ah$a.setCurrentMinute(Integer.valueOf(valueOf(intValue) / this.valueOf));
            return;
        }
        this.ah$a.setCurrentMinute(Integer.valueOf(valueOf(intValue)));
    }

    private void ah$a() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.ag$a.getResources().getIdentifier("minute", values(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, new byte[]{-126, -127}).intern(), "android"));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.valueOf) - 1);
        ArrayList arrayList = new ArrayList(60 / this.valueOf);
        int i = 0;
        while (true) {
            if ((i < 60 ? (char) 19 : 'U') != 19) {
                numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
                int i2 = getInitSettings + 77;
                HaptikSDK$d = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = getInitSettings + 5;
            HaptikSDK$d = i4 % 128;
            if ((i4 % 2 != 0 ? '6' : ',') == ',') {
                arrayList.add(String.format("%02d", Integer.valueOf(i)));
                i += this.valueOf;
            } else {
                Object[] objArr = new Object[0];
                objArr[1] = Integer.valueOf(i);
                arrayList.add(String.format("%02d", objArr));
                i <<= this.valueOf;
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        try {
            int i = HaptikSDK$d + 33;
            getInitSettings = i % 128;
            if (!(i % 2 != 0)) {
                this.toString.removeCallbacks(this.HaptikSDK$b);
                super.onDetachedFromWindow();
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                this.toString.removeCallbacks(this.HaptikSDK$b);
                super.onDetachedFromWindow();
            }
            int i2 = HaptikSDK$d + 71;
            getInitSettings = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ah$b;
            int i2 = HaptikSDK$a;
            if (HaptikWebView) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (HaptikSDK$c) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
