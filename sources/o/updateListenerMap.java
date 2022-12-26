package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class updateListenerMap {
    private List<getMainExecutor> values;

    public updateListenerMap(List<getMainExecutor> list) {
        runAnimators.ag$a(list, "listOfPlayerTypes");
        this.values = list;
    }

    public final List<getMainExecutor> ah$a() {
        return this.values;
    }

    public final String values() {
        String lowerCase;
        int size = this.values.size();
        String str = "Now you can select upto ";
        for (int i = 0; i < size; i++) {
            getMainExecutor getmainexecutor = this.values.get(i);
            int HaptikSDK$a = getmainexecutor.HaptikSDK$a();
            String ah$a = getmainexecutor.ah$a();
            if (ah$a == null) {
                lowerCase = null;
            } else {
                lowerCase = ah$a.toLowerCase();
                runAnimators.ah$a(lowerCase, "this as java.lang.String).toLowerCase()");
            }
            str = str + HaptikSDK$a + com.dreampay.commons.constants.Constants.WHITE_SPACE + lowerCase;
            if (i < this.values.size() - 2) {
                str = str + ", ";
            } else if (i == this.values.size() - 2) {
                str = str + " & ";
            }
        }
        return str + ".";
    }
}
