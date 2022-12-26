package o;

import java.util.List;
/* loaded from: classes5.dex */
abstract class isEqualSidecarDisplayFeatures extends SidecarAdapter {
    Object ag$a;

    @Override // o.SidecarAdapter
    protected void HaptikSDK$e(String str) {
    }

    @Override // o.SidecarAdapter
    public int values() {
        return 0;
    }

    @Override // o.SidecarAdapter
    protected final boolean ak$b() {
        return this.ag$a instanceof windowExtensionsProviderClass;
    }

    @Override // o.SidecarAdapter
    public final windowExtensionsProviderClass HaptikSDK$d() {
        valueOf();
        return (windowExtensionsProviderClass) this.ag$a;
    }

    private void valueOf() {
        if (ak$b()) {
            return;
        }
        Object obj = this.ag$a;
        windowExtensionsProviderClass windowextensionsproviderclass = new windowExtensionsProviderClass();
        this.ag$a = windowextensionsproviderclass;
        if (obj != null) {
            windowextensionsproviderclass.toString(ah$a(), (String) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$b() {
        return valueOf(ah$a());
    }

    @Override // o.SidecarAdapter
    public String valueOf(String str) {
        isWindowLayoutProviderValid.ag$a(str);
        if (ak$b()) {
            return super.valueOf(str);
        }
        return str.equals(ah$a()) ? (String) this.ag$a : "";
    }

    @Override // o.SidecarAdapter
    public SidecarAdapter ag$a(String str, String str2) {
        if (!ak$b() && str.equals(ah$a())) {
            this.ag$a = str2;
        } else {
            valueOf();
            super.ag$a(str, str2);
        }
        return this;
    }

    @Override // o.SidecarAdapter
    public boolean toString(String str) {
        valueOf();
        return super.toString(str);
    }

    @Override // o.SidecarAdapter
    public SidecarAdapter ag$a(String str) {
        valueOf();
        return super.ag$a(str);
    }

    @Override // o.SidecarAdapter
    public String ah$a(String str) {
        valueOf();
        return super.ah$a(str);
    }

    @Override // o.SidecarAdapter
    public String ag$a() {
        return postMessage() ? setDefaultImpl().ag$a() : "";
    }

    @Override // o.SidecarAdapter
    protected List<SidecarAdapter> a() {
        throw new UnsupportedOperationException("Leaf Nodes do not have child nodes.");
    }
}
