package o;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/* loaded from: classes5.dex */
public class access$getSidecarAdapter$p {
    public static Elements values(final SidecarCompat sidecarCompat, final Element element) {
        final Elements elements = new Elements();
        SidecarAdapter$translate$checkedFeature$4.ah$a(new access$getExtensionCallback$p(element, elements, sidecarCompat) { // from class: o.access$getSidecarAdapter$p$ah$a
            private final Elements ag$a;
            private final SidecarCompat ah$a;
            private final Element valueOf;

            @Override // o.access$getExtensionCallback$p
            public void toString(SidecarAdapter sidecarAdapter, int i) {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.valueOf = element;
                this.ag$a = elements;
                this.ah$a = sidecarCompat;
            }

            @Override // o.access$getExtensionCallback$p
            public void valueOf(SidecarAdapter sidecarAdapter, int i) {
                if (sidecarAdapter instanceof Element) {
                    Element element2 = (Element) sidecarAdapter;
                    if (this.ah$a.values(this.valueOf, element2)) {
                        this.ag$a.add(element2);
                    }
                }
            }
        }, element);
        return elements;
    }
}
