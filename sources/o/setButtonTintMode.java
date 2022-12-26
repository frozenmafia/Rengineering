package o;

import com.conviva.api.ConvivaConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes4.dex */
public class setButtonTintMode {
    private requestStop ag$a;
    private Map<String, Object> ah$a = null;
    private CompoundButtonCompat toString;
    private getCheckMarkTintMode valueOf;
    private Map<String, Object> values;

    public setButtonTintMode(CompoundButtonCompat compoundButtonCompat, requestStop requeststop, getCheckMarkTintMode getcheckmarktintmode, Map<String, Object> map) {
        this.values = null;
        this.ag$a = requeststop;
        this.valueOf = getcheckmarktintmode;
        this.toString = compoundButtonCompat;
        this.values = map;
    }

    public Map<String, Object> values() throws Exception {
        if (this.ah$a == null) {
            valueOf();
        }
        return this.ah$a;
    }

    public void valueOf() throws Exception {
        String ag$a;
        this.ah$a = new HashMap();
        this.valueOf.valueOf(new valueOf(), "SystemMetadata.retrieve");
        if (this.ah$a.containsKey("deviceType") && (ag$a = ag$a(this.ah$a, "deviceType")) != null && ag$a == ConvivaConstants.DeviceType.UNKNOWN.toString()) {
            this.ah$a.remove("deviceType");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class valueOf implements Callable<Void> {
        valueOf() {
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x01b6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* renamed from: valueOf */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 600
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setButtonTintMode.valueOf.call():java.lang.Void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values(String str, Map<String, Object> map, Map<String, Object> map2) {
        String ag$a = ag$a(map, str);
        if (ag$a == null || ag$a.isEmpty() || map2 == null) {
            return;
        }
        map2.put(str, ag$a);
    }

    private String ag$a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || map.isEmpty() || str == null || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }
}
