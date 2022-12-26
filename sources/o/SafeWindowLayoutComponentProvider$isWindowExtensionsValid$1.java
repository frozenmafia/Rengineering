package o;

import java.io.IOException;
import org.jsoup.nodes.Document;
/* loaded from: classes5.dex */
public class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends isEqualSidecarDisplayFeatures {
    @Override // o.SidecarAdapter
    public String ah$a() {
        return "#comment";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.SidecarAdapter
    protected void values(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ String ag$a() {
        return super.ag$a();
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ SidecarAdapter ag$a(String str) {
        return super.ag$a(str);
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ SidecarAdapter ag$a(String str, String str2) {
        return super.ag$a(str, str2);
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ String ah$a(String str) {
        return super.ah$a(str);
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ boolean toString(String str) {
        return super.toString(str);
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ String valueOf(String str) {
        return super.valueOf(str);
    }

    @Override // o.isEqualSidecarDisplayFeatures, o.SidecarAdapter
    public /* bridge */ /* synthetic */ int values() {
        return super.values();
    }

    public SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(String str) {
        this.ag$a = str;
    }

    public String valueOf() {
        return ah$b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.SidecarAdapter
    protected void toString(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.ah$b()) {
            ah$a(appendable, i, outputSettings);
        }
        appendable.append("<!--").append(valueOf()).append("-->");
    }

    @Override // o.SidecarAdapter
    public String toString() {
        return HaptikSDK$c();
    }
}
