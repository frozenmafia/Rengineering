package o;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/* loaded from: classes5.dex */
public class getWindowLayoutComponent extends Element {
    private final Elements ah$a;

    public getWindowLayoutComponent(SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$1, String str, windowExtensionsProviderClass windowextensionsproviderclass) {
        super(sidecarAdapter$translate$checkedFeature$1, str, windowextensionsproviderclass);
        this.ah$a = new Elements();
    }

    public getWindowLayoutComponent values(Element element) {
        this.ah$a.add(element);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SidecarAdapter
    public void HaptikSDK$b(SidecarAdapter sidecarAdapter) {
        super.HaptikSDK$b(sidecarAdapter);
        this.ah$a.remove(sidecarAdapter);
    }
}
