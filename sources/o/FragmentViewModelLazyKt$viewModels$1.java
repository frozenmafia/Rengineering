package o;

import android.graphics.Typeface;
import android.os.Build;
import com.google.logging.type.LogSeverity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class FragmentViewModelLazyKt$viewModels$1 {
    private final boolean valueOf;
    private final int values;

    public FragmentViewModelLazyKt$viewModels$1(int i) {
        i = i == -1 ? 0 : i;
        this.valueOf = (i & 2) != 0;
        this.values = (i & 1) != 0 ? LogSeverity.ALERT_VALUE : 400;
    }

    public FragmentViewModelLazyKt$viewModels$1(int i, int i2) {
        i = i == -1 ? 0 : i;
        this.valueOf = (i & 2) != 0;
        this.values = i2 == -1 ? (i & 1) != 0 ? LogSeverity.ALERT_VALUE : 400 : i2;
    }

    public int ag$a() {
        return this.values < 700 ? this.valueOf ? 2 : 0 : this.valueOf ? 3 : 1;
    }

    public Typeface valueOf(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(typeface, ag$a());
        }
        return Typeface.create(typeface, this.values, this.valueOf);
    }
}
