package androidx.databinding.adapters;

import android.widget.AbsSpinner;
import android.widget.SpinnerAdapter;
import java.util.List;
/* loaded from: classes.dex */
public class AbsSpinnerBindingAdapter {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends java.lang.CharSequence> void setEntries(android.widget.AbsSpinner r5, T[] r6) {
        /*
            if (r6 == 0) goto L3d
            android.widget.SpinnerAdapter r0 = r5.getAdapter()
            r1 = 0
            if (r0 == 0) goto L24
            int r2 = r0.getCount()
            int r3 = r6.length
            if (r2 != r3) goto L24
            r2 = 0
        L11:
            int r3 = r6.length
            if (r2 >= r3) goto L25
            r3 = r6[r2]
            java.lang.Object r4 = r0.getItem(r2)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L21
            goto L24
        L21:
            int r2 = r2 + 1
            goto L11
        L24:
            r1 = 1
        L25:
            if (r1 == 0) goto L41
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            android.content.Context r1 = r5.getContext()
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r0.<init>(r1, r2, r6)
            r6 = 17367049(0x1090009, float:2.516295E-38)
            r0.setDropDownViewResource(r6)
            r5.setAdapter(r0)
            goto L41
        L3d:
            r6 = 0
            r5.setAdapter(r6)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.adapters.AbsSpinnerBindingAdapter.setEntries(android.widget.AbsSpinner, java.lang.CharSequence[]):void");
    }

    public static <T> void setEntries(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof ObservableListAdapter) {
                ((ObservableListAdapter) adapter).setList(list);
                return;
            } else {
                absSpinner.setAdapter((SpinnerAdapter) new ObservableListAdapter(absSpinner.getContext(), list, 17367048, 17367049, 0));
                return;
            }
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }
}
