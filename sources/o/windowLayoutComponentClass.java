package o;

import java.io.IOException;
import org.jsoup.nodes.Document;
/* loaded from: classes5.dex */
public class windowLayoutComponentClass extends isEqualSidecarDisplayFeatures {
    @Override // o.SidecarAdapter
    public String ah$a() {
        return "#doctype";
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

    public windowLayoutComponentClass(String str, String str2, String str3) {
        isWindowLayoutProviderValid.ag$a(str);
        isWindowLayoutProviderValid.ag$a(str2);
        isWindowLayoutProviderValid.ag$a(str3);
        ag$a("name", str);
        ag$a("publicId", str2);
        if (ah$b("publicId")) {
            ag$a("pubSysKey", "PUBLIC");
        }
        ag$a("systemId", str3);
    }

    public void values(String str) {
        if (str != null) {
            ag$a("pubSysKey", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.SidecarAdapter
    protected void toString(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.HaptikSDK$c() == Document.OutputSettings.Syntax.html && !ah$b("publicId") && !ah$b("systemId")) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (ah$b("name")) {
            appendable.append(com.dreampay.commons.constants.Constants.WHITE_SPACE).append(valueOf("name"));
        }
        if (ah$b("pubSysKey")) {
            appendable.append(com.dreampay.commons.constants.Constants.WHITE_SPACE).append(valueOf("pubSysKey"));
        }
        if (ah$b("publicId")) {
            appendable.append(" \"").append(valueOf("publicId")).append('\"');
        }
        if (ah$b("systemId")) {
            appendable.append(" \"").append(valueOf("systemId")).append('\"');
        }
        appendable.append('>');
    }

    private boolean ah$b(String str) {
        return !doesReturn.valueOf(valueOf(str));
    }
}
