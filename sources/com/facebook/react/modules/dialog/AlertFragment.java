package com.facebook.react.modules.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.modules.dialog.DialogModule;
import o.move;
/* loaded from: classes4.dex */
public class AlertFragment extends DialogFragment implements DialogInterface.OnClickListener {
    private static char[] ag$a = {'t', 63190, 60682, 58449, 55961};
    private static int ah$a = 1;
    private static long toString = -4656642016707414337L;
    private static int valueOf;
    private final DialogModule.valueOf values;

    public AlertFragment() {
        this.values = null;
    }

    public AlertFragment(DialogModule.valueOf valueof, Bundle bundle) {
        this.values = valueof;
        setArguments(bundle);
    }

    public static Dialog toString(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        try {
            AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString(ag$a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 5, ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()));
            if (bundle.containsKey("button_positive")) {
                int i = valueOf + 113;
                ah$a = i % 128;
                if (i % 2 != 0) {
                    title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
                } else {
                    title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
                    int i2 = 98 / 0;
                }
            }
            if (bundle.containsKey("button_negative")) {
                int i3 = valueOf + 71;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
            }
            if (bundle.containsKey("button_neutral")) {
                title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
            }
            if (!(bundle.containsKey("message") ? false : true)) {
                title.setMessage(bundle.getString("message"));
            }
            if ((bundle.containsKey("items") ? '+' : '/') == '+') {
                title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
                int i5 = valueOf + 63;
                ah$a = i5 % 128;
                int i6 = i5 % 2;
            }
            return title.create();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i = ah$a + 17;
        valueOf = i % 128;
        if (!(i % 2 != 0)) {
            return toString(getActivity(), getArguments(), this);
        }
        Dialog alertFragment = toString(getActivity(), getArguments(), this);
        Object obj = null;
        super.hashCode();
        return alertFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        if ((r0 != null) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
        if ((r0 != null ? 5 : 6) != 6) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0.onClick(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
        r5 = com.facebook.react.modules.dialog.AlertFragment.ah$a + 5;
        com.facebook.react.modules.dialog.AlertFragment.valueOf = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        return;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.content.DialogInterface r5, int r6) {
        /*
            r4 = this;
            int r0 = com.facebook.react.modules.dialog.AlertFragment.ah$a
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.facebook.react.modules.dialog.AlertFragment.valueOf = r1
            int r0 = r0 % 2
            r1 = 5
            if (r0 == 0) goto L1f
            com.facebook.react.modules.dialog.DialogModule$valueOf r0 = r4.values     // Catch: java.lang.Exception -> L1d
            r2 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L2e
            goto L29
        L1b:
            r5 = move-exception
            throw r5
        L1d:
            r5 = move-exception
            goto L2d
        L1f:
            com.facebook.react.modules.dialog.DialogModule$valueOf r0 = r4.values
            r2 = 6
            if (r0 == 0) goto L26
            r3 = 5
            goto L27
        L26:
            r3 = 6
        L27:
            if (r3 == r2) goto L2e
        L29:
            r0.onClick(r5, r6)     // Catch: java.lang.Exception -> L1d
            goto L2e
        L2d:
            throw r5
        L2e:
            int r5 = com.facebook.react.modules.dialog.AlertFragment.ah$a
            int r5 = r5 + r1
            int r6 = r5 % 128
            com.facebook.react.modules.dialog.AlertFragment.valueOf = r6
            int r5 = r5 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.dialog.AlertFragment.onClick(android.content.DialogInterface, int):void");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        DialogModule.valueOf valueof;
        int i = valueOf + 93;
        ah$a = i % 128;
        if (i % 2 == 0) {
            super.onDismiss(dialogInterface);
            valueof = this.values;
            Object[] objArr = null;
            int length = objArr.length;
            if (valueof == null) {
                return;
            }
        } else {
            super.onDismiss(dialogInterface);
            valueof = this.values;
            if (valueof == null) {
                return;
            }
        }
        valueof.onDismiss(dialogInterface);
        try {
            int i2 = valueOf + 95;
            try {
                ah$a = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ag$a[move.values + i2] ^ (move.values * toString)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
