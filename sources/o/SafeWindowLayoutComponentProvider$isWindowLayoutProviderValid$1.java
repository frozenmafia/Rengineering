package o;

import java.io.IOException;
import java.util.Iterator;
import org.apache.http.message.TokenParser;
import org.jsoup.nodes.Document;
/* loaded from: classes5.dex */
public class SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 extends isEqualSidecarDisplayFeatures {
    private final boolean ah$a;

    @Override // o.SidecarAdapter
    public String ah$a() {
        return "#declaration";
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

    public SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(String str, boolean z) {
        isWindowLayoutProviderValid.ag$a(str);
        this.ag$a = str;
        this.ah$a = z;
    }

    public String valueOf() {
        return ah$b();
    }

    private void ah$a(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        Iterator<windowExtensionsClass> it = HaptikSDK$d().iterator();
        while (it.hasNext()) {
            windowExtensionsClass next = it.next();
            if (!next.values().equals(ah$a())) {
                appendable.append(TokenParser.SP);
                next.values(appendable, outputSettings);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.SidecarAdapter
    protected void toString(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<").append(this.ah$a ? "!" : "?").append(ah$b());
        ah$a(appendable, outputSettings);
        appendable.append(this.ah$a ? "!" : "?").append(">");
    }

    @Override // o.SidecarAdapter
    public String toString() {
        return HaptikSDK$c();
    }
}
