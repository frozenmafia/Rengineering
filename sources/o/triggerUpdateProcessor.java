package o;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.RecyclerView;
/* loaded from: classes7.dex */
public final class triggerUpdateProcessor {
    public static final long ah$a = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern toString = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static triggerUpdateProcessor values;
    private final hasJumpTarget ag$a;

    private triggerUpdateProcessor(hasJumpTarget hasjumptarget) {
        this.ag$a = hasjumptarget;
    }

    public static triggerUpdateProcessor valueOf() {
        return toString(RecyclerView.SmoothScroller.Action.valueOf());
    }

    public static triggerUpdateProcessor toString(hasJumpTarget hasjumptarget) {
        if (values == null) {
            values = new triggerUpdateProcessor(hasjumptarget);
        }
        return values;
    }

    public boolean ah$a(isPendingInitialRun ispendinginitialrun) {
        return TextUtils.isEmpty(ispendinginitialrun.valueOf()) || ispendinginitialrun.invoke() + ispendinginitialrun.values() < ag$a() + ah$a;
    }

    public long ag$a() {
        return TimeUnit.MILLISECONDS.toSeconds(ah$a());
    }

    public long ah$a() {
        return this.ag$a.ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean values(String str) {
        return toString.matcher(str).matches();
    }

    public long values() {
        return (long) (Math.random() * 1000.0d);
    }
}
