package o;

import android.widget.ExpandableListView;
import com.bugsnag.android.Thread;
import com.bugsnag.android.ThreadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.ViewCompat;
/* loaded from: classes6.dex */
class addAccessibilityPane {
    private static int ag$a = 1;
    private static int toString = 0;
    private static long values = -2907906301048411322L;
    private final setImportantForAccessibility ah$a;
    private final ViewCompat.AnonymousClass4 valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public addAccessibilityPane(ViewCompat.AnonymousClass4 anonymousClass4, setImportantForAccessibility setimportantforaccessibility) {
        this.valueOf = anonymousClass4;
        this.ah$a = setimportantforaccessibility;
    }

    public Thread ag$a(Map<String, Object> map) {
        boolean booleanValue;
        String str = (String) setNextClusterForwardId.valueOf(map, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) setNextClusterForwardId.valueOf(map, "stacktrace")).iterator();
        while (true) {
            if ((it.hasNext() ? '\t' : 'b') == 'b') {
                break;
            }
            arrayList.add(this.valueOf.toString((Map) it.next()));
            int i = toString + 7;
            ag$a = i % 128;
            int i2 = i % 2;
        }
        Boolean bool = (Boolean) setNextClusterForwardId.toString(map, "errorReportingThread");
        if ((bool == null ? '5' : (char) 0) == 0) {
            booleanValue = bool.booleanValue();
        } else {
            int i3 = ag$a + 11;
            toString = i3 % 128;
            int i4 = i3 % 2;
            booleanValue = false;
        }
        return new Thread(((Number) setNextClusterForwardId.valueOf(map, valueOf(new char[]{43823, 46247}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8070).intern())).longValue(), (String) setNextClusterForwardId.valueOf(map, "name"), ThreadType.valueOf(str.toUpperCase(Locale.US)), Boolean.valueOf(booleanValue).booleanValue(), Thread.State.byDescriptor((String) setNextClusterForwardId.valueOf(map, "state")), new ViewCompat.AnonymousClass2(arrayList), this.ah$a);
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ values);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
