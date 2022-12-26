package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class onCreatePanelView {
    private String ah$a;
    private final values toString;
    private final m<calculateTwilight> valueOf;
    private final ArrayList<calculateTwilight> values;

    /* loaded from: classes2.dex */
    public interface values {
        void ah$a();
    }

    public onCreatePanelView(enableHomeButtonByDefault enablehomebuttonbydefault, values valuesVar) {
        runAnimators.ag$a(enablehomebuttonbydefault, "iResourceProvider");
        runAnimators.ag$a(valuesVar, "handler");
        this.toString = valuesVar;
        this.values = new ArrayList<>();
        this.ah$a = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120682, new Object[0]);
        m<calculateTwilight> mVar = m.toString(getLastKnownLocationForProvider.valueOf);
        runAnimators.ah$a(mVar, "of { itemBinding, _, _ -…e_team_select_team)\n    }");
        this.valueOf = mVar;
    }

    public final values values() {
        return this.toString;
    }

    public final ArrayList<calculateTwilight> valueOf() {
        return this.values;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }

    public final m<calculateTwilight> ah$a() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(m mVar, int i, calculateTwilight calculatetwilight) {
        runAnimators.ag$a(mVar, "itemBinding");
        mVar.ah$a(263, com.app.dream11Pro.R.layout.res_0x7f0d0081);
    }

    public final void values(List<calculateTwilight> list) {
        runAnimators.ag$a(list, "teamsInfoList");
        this.values.addAll(list);
    }
}
