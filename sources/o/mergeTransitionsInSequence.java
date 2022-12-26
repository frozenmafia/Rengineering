package o;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import o.FragmentLifecycleCallbacksDispatcher;
/* loaded from: classes4.dex */
public class mergeTransitionsInSequence {
    private String ag$a;
    private Uri toString;
    private boolean valueOf;
    private double values;

    public mergeTransitionsInSequence(Context context, String str, double d, double d2) {
        this.ag$a = str;
        this.values = d * d2;
        this.toString = ah$a(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mergeTransitionsInSequence mergetransitionsinsequence = (mergeTransitionsInSequence) obj;
        return Double.compare(mergetransitionsinsequence.values, this.values) == 0 && this.valueOf == mergetransitionsinsequence.valueOf && Objects.equals(this.toString, mergetransitionsinsequence.toString) && Objects.equals(this.ag$a, mergetransitionsinsequence.ag$a);
    }

    public int hashCode() {
        return Objects.hash(this.toString, this.ag$a, Double.valueOf(this.values), Boolean.valueOf(this.valueOf));
    }

    public mergeTransitionsInSequence(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public String getInitSettings() {
        return this.ag$a;
    }

    public Uri ah$a() {
        return (Uri) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.toString);
    }

    public double HaptikSDK$c() {
        return this.values;
    }

    public boolean invoke() {
        return this.valueOf;
    }

    private Uri ah$a(Context context) {
        try {
            Uri parse = Uri.parse(this.ag$a);
            return parse.getScheme() == null ? valueOf(context) : parse;
        } catch (Exception unused) {
            return valueOf(context);
        }
    }

    private Uri valueOf(Context context) {
        this.valueOf = true;
        return scheduleHideFragmentView.ah$a().ah$a(context, this.ag$a);
    }
}
