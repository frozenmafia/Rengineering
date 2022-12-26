package com.app.dream11.addemail;

import android.os.SystemClock;
import android.view.View;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getShort;
import o.runAnimators;
/* loaded from: classes.dex */
public final class AddEmailFlowState extends FlowState {
    private static int ag$a = 0;
    private static char toString = 0;
    private static long valueOf = 1596970236568527825L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddEmailFlowState(String str) {
        super(FlowStates.ADD_EMAIL, null, 2, null);
        runAnimators.ag$a(str, toString((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{34801, 35606, 24785, 44350}, new char[]{58321, 5001, 37880, 5673}, (char) (View.MeasureSpec.getSize(0) + 15968), new char[]{53737, 37404, 51084, 59461, 54495, 63724}).intern());
        putExtra("arg_add_email_source", str);
    }

    private static String toString(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ valueOf) ^ ag$a) ^ toString);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
