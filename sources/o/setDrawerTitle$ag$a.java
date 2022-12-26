package o;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class setDrawerTitle$ag$a {
    public /* synthetic */ setDrawerTitle$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private setDrawerTitle$ag$a() {
    }

    private final HashMap<Integer, setDrawerTitle> values() {
        setIdentityTransforms setidentitytransforms;
        setidentitytransforms = setDrawerTitle.valueOf;
        return (HashMap) setidentitytransforms.getValue();
    }

    public final setDrawerTitle values(long j, String str) {
        setDrawerTitle setdrawertitle;
        runAnimators.ag$a(str, "cacheFolder");
        int hashCode = str.hashCode() + ChatMessageSectionKey$$ExternalSyntheticBackport0.m(j);
        setDrawerTitle setdrawertitle2 = values().get(Integer.valueOf(hashCode));
        if (setdrawertitle2 == null) {
            synchronized (values()) {
                setDrawerTitle$ag$a setdrawertitle_ag_a = setDrawerTitle.ag$a;
                setdrawertitle = new setDrawerTitle(j, str, null);
                setDrawerTitle.ag$a.values().put(Integer.valueOf(hashCode), setdrawertitle);
            }
            return setdrawertitle;
        }
        return setdrawertitle2;
    }
}
