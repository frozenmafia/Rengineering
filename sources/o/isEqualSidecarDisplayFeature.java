package o;

import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
/* loaded from: classes5.dex */
public class isEqualSidecarDisplayFeature extends isEqualSidecarDisplayFeatures {
    @Override // o.SidecarAdapter
    public String ah$a() {
        return "#text";
    }

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

    public isEqualSidecarDisplayFeature(String str) {
        this.ag$a = str;
    }

    public String valueOf() {
        return ah$b();
    }

    public boolean HaptikSDK$a() {
        return doesReturn.valueOf(ah$b());
    }

    @Override // o.SidecarAdapter
    protected void toString(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.ah$b() && ((updateVisuals() == 0 && (this.values instanceof Element) && ((Element) this.values).getDefaultImpl().valueOf() && !HaptikSDK$a()) || (outputSettings.invoke() && IPostMessageService().size() > 0 && !HaptikSDK$a()))) {
            ah$a(appendable, i, outputSettings);
        }
        Entities.ag$a(appendable, ah$b(), outputSettings, false, outputSettings.ah$b() && (setDefaultImpl() instanceof Element) && !Element.valueOf(setDefaultImpl()), false);
    }

    @Override // o.SidecarAdapter
    public String toString() {
        return HaptikSDK$c();
    }

    public static boolean ah$a(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }
}
