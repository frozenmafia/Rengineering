package o;

import java.util.Arrays;
import java.util.Collection;
import org.jsoup.nodes.Element;
/* loaded from: classes5.dex */
final class SidecarAdapter$translate$checkedFeature$3$ah$a extends SidecarAdapter$translate$checkedFeature$3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SidecarAdapter$translate$checkedFeature$3$ah$a(Collection<SidecarCompat> collection) {
        super(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SidecarAdapter$translate$checkedFeature$3$ah$a(SidecarCompat... sidecarCompatArr) {
        this(Arrays.asList(sidecarCompatArr));
    }

    @Override // o.SidecarCompat
    public boolean values(Element element, Element element2) {
        for (int i = 0; i < this.ah$a; i++) {
            if (!this.valueOf.get(i).values(element, element2)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String doesreturn;
        doesreturn = doesReturn.toString(this.valueOf.iterator(), com.dreampay.commons.constants.Constants.WHITE_SPACE);
        return doesreturn;
    }
}
