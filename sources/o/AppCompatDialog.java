package o;

import java.util.List;
import o.AppCompatDelegateImpl;
/* loaded from: classes.dex */
public final class AppCompatDialog {
    private final m<readFromParcel> ag$a;
    private final List<readFromParcel> ah$a;
    private final AppCompatDelegateImpl.PanelMenuPresenterCallback toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppCompatDialog) {
            AppCompatDialog appCompatDialog = (AppCompatDialog) obj;
            return runAnimators.values(this.toString, appCompatDialog.toString) && runAnimators.values(this.ah$a, appCompatDialog.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        AppCompatDelegateImpl.PanelMenuPresenterCallback panelMenuPresenterCallback = this.toString;
        List<readFromParcel> list = this.ah$a;
        return "TableRowModel(playerDetailsModel=" + panelMenuPresenterCallback + ", attributesList=" + list + ")";
    }

    /* renamed from: o.AppCompatDialog$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 {
        private final String ag$a;
        private final List<dismiss> toString;
        private final m<dismiss> valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnonymousClass1) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) obj;
                return runAnimators.values((Object) this.ag$a, (Object) anonymousClass1.ag$a) && runAnimators.values(this.toString, anonymousClass1.toString);
            }
            return false;
        }

        public int hashCode() {
            return (this.ag$a.hashCode() * 31) + this.toString.hashCode();
        }

        public String toString() {
            String str = this.ag$a;
            List<dismiss> list = this.toString;
            return "TableHeaderModel(leftHeaderLabel=" + str + ", rightHeaderItems=" + list + ")";
        }

        public AnonymousClass1(String str, List<dismiss> list) {
            runAnimators.ag$a(str, "leftHeaderLabel");
            runAnimators.ag$a(list, "rightHeaderItems");
            this.ag$a = str;
            this.toString = list;
            m<dismiss> mVar = m.toString(getThemeResId.valueOf);
            runAnimators.ah$a(mVar, "of { itemBinding, _, _ -…recard_header_item)\n    }");
            this.valueOf = mVar;
        }

        public final String ah$a() {
            return this.ag$a;
        }

        public final List<dismiss> ag$a() {
            return this.toString;
        }

        public final m<dismiss> values() {
            return this.valueOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ah$a(m mVar, int i, dismiss dismissVar) {
            runAnimators.ag$a(mVar, "itemBinding");
            mVar.ah$a(263, com.app.dream11Pro.R.layout.res_0x7f0d010b);
        }
    }

    public AppCompatDialog(AppCompatDelegateImpl.PanelMenuPresenterCallback panelMenuPresenterCallback, List<readFromParcel> list) {
        runAnimators.ag$a(panelMenuPresenterCallback, "playerDetailsModel");
        runAnimators.ag$a(list, "attributesList");
        this.toString = panelMenuPresenterCallback;
        this.ah$a = list;
        m<readFromParcel> mVar = m.toString(superDispatchKeyEvent.toString);
        runAnimators.ah$a(mVar, "of { itemBinding, _, _ -…orecard_value_item)\n    }");
        this.ag$a = mVar;
    }

    public final AppCompatDelegateImpl.PanelMenuPresenterCallback valueOf() {
        return this.toString;
    }

    public final List<readFromParcel> values() {
        return this.ah$a;
    }

    public final m<readFromParcel> ag$a() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah$a(m mVar, int i, readFromParcel readfromparcel) {
        runAnimators.ag$a(mVar, "itemBinding");
        mVar.ah$a(263, com.app.dream11Pro.R.layout.res_0x7f0d010f);
    }
}
