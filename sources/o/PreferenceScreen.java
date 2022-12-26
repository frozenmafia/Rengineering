package o;

import o.PreferenceManager;
/* loaded from: classes5.dex */
public final class PreferenceScreen {
    private createInstanceForTests ah$a;

    private PreferenceScreen() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ PreferenceScreen(getItemDelegate getitemdelegate) {
    }

    public final PreferenceScreen ag$a(createInstanceForTests createinstancefortests) {
        this.ah$a = createinstancefortests;
        return this;
    }

    public final PreferenceManager.SimplePreferenceComparisonCallback valueOf() {
        createInstanceForTests createinstancefortests = this.ah$a;
        if (createinstancefortests != null) {
            return new updateLabelValue(createinstancefortests, null);
        }
        throw new IllegalStateException(String.valueOf(createInstanceForTests.class.getCanonicalName()).concat(" must be set"));
    }
}
