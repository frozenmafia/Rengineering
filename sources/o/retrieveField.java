package o;

import android.os.Process;
import android.view.ViewConfiguration;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class retrieveField implements getViewHorizontalDragRange {
    private static char HaptikSDK$b = 20253;
    private static int HaptikSDK$c = 1;
    private static int ag$a;
    private static int invoke;
    private static long values;
    private final setPhoneNumber ah$a;
    private final setCurrentTabTag toString;
    private final onRatingChanged valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof retrieveField) {
            retrieveField retrievefield = (retrieveField) obj;
            if (!runAnimators.values(this.valueOf, retrievefield.valueOf)) {
                int i = invoke + 69;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                return false;
            }
            if ((!runAnimators.values(this.toString, retrievefield.toString) ? 'G' : '\'') != 'G') {
                try {
                    return (!runAnimators.values(this.ah$a, retrievefield.ah$a) ? 'O' : (char) 24) == 24;
                } catch (Exception e) {
                    throw e;
                }
            }
            try {
                int i3 = invoke + 53;
                HaptikSDK$c = i3 % 128;
                return i3 % 2 == 0;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = invoke + 9;
        HaptikSDK$c = i % 128;
        int hashCode = !(i % 2 != 0) ? (((this.valueOf.hashCode() / 43) + this.toString.hashCode()) - 49) >>> this.ah$a.hashCode() : (((this.valueOf.hashCode() * 31) + this.toString.hashCode()) * 31) + this.ah$a.hashCode();
        int i2 = invoke + 17;
        HaptikSDK$c = i2 % 128;
        if ((i2 % 2 == 0 ? ']' : '\t') != '\t') {
            int i3 = 34 / 0;
            return hashCode;
        }
        return hashCode;
    }

    public String toString() {
        String str = "FantasyPointsSystemPageOpened(_roundId=" + this.valueOf + ", _source=" + this.toString + ", _tourId=" + this.ah$a + ')';
        int i = invoke + 13;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? 'Z' : (char) 23) != 23) {
            int i2 = 14 / 0;
            return str;
        }
        return str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x001b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public retrieveField(o.onRatingChanged r2, o.setCurrentTabTag r3, o.setPhoneNumber r4) {
        /*
            r1 = this;
            java.lang.String r0 = "_roundId"
            o.runAnimators.ag$a(r2, r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = "_source"
            o.runAnimators.ag$a(r3, r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = "_tourId"
            o.runAnimators.ag$a(r4, r0)     // Catch: java.lang.Exception -> L19
            r1.<init>()     // Catch: java.lang.Exception -> L19
            r1.valueOf = r2     // Catch: java.lang.Exception -> L19
            r1.toString = r3     // Catch: java.lang.Exception -> L19
            r1.ah$a = r4     // Catch: java.lang.Exception -> L19
            return
        L19:
            r2 = move-exception
            throw r2
        L1b:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.retrieveField.<init>(o.onRatingChanged, o.setCurrentTabTag, o.setPhoneNumber):void");
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FantasyPointsSystemPageOpened");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.valueOf.values()));
        hashMap.put(toString(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{55198, 54319, 43892, 38318}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44714), new char[]{24391, 35848, 23068, 34450, 50722, 44390}).intern(), this.toString.ah$a());
        hashMap.put("tourId", Integer.valueOf(this.ah$a.values()));
        int i = HaptikSDK$c + 49;
        invoke = i % 128;
        if (!(i % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
            return hashMap;
        }
        return hashMap;
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ ag$a) ^ HaptikSDK$b);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
