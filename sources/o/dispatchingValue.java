package o;

import com.fancode.payment.GetPaymentPassesQuery;
import com.fancode.payment.GetPaymentPassesQuery$HaptikSDK$d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class dispatchingValue {
    public static final dispatchingValue valueOf = new dispatchingValue();

    private dispatchingValue() {
    }

    public final ArrayList<isLifecycleParent> ah$a(List<GetPaymentPassesQuery.invoke> list) {
        runAnimators.ag$a(list, "passes");
        ArrayList<isLifecycleParent> arrayList = new ArrayList<>();
        for (GetPaymentPassesQuery.invoke invokeVar : list) {
            if (invokeVar.values() != null) {
                arrayList.add(new isLifecycleParent(invokeVar.values().invoke(), invokeVar.values().valueOf()));
            } else if (invokeVar.valueOf() != null) {
                for (GetPaymentPassesQuery$HaptikSDK$d getPaymentPassesQuery$HaptikSDK$d : invokeVar.valueOf().values()) {
                    if (getPaymentPassesQuery$HaptikSDK$d.HaptikSDK$c() != null) {
                        String ag$a = invokeVar.valueOf().ag$a();
                        String HaptikSDK$c = getPaymentPassesQuery$HaptikSDK$d.HaptikSDK$c();
                        arrayList.add(new isLifecycleParent(ag$a + ": " + HaptikSDK$c, getPaymentPassesQuery$HaptikSDK$d.ah$a()));
                    }
                }
            }
        }
        return arrayList;
    }
}
