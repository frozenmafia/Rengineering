package o;

import java.util.Iterator;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
/* loaded from: classes5.dex */
public class SidecarAdapter$translate$checkedFeature$4 {
    public static void ah$a(access$getExtensionCallback$p access_getextensioncallback_p, SidecarAdapter sidecarAdapter) {
        SidecarAdapter sidecarAdapter2 = sidecarAdapter;
        int i = 0;
        while (sidecarAdapter2 != null) {
            access_getextensioncallback_p.valueOf(sidecarAdapter2, i);
            if (sidecarAdapter2.values() > 0) {
                sidecarAdapter2 = sidecarAdapter2.ah$a(0);
                i++;
            } else {
                while (sidecarAdapter2.receiveFile() == null && i > 0) {
                    access_getextensioncallback_p.toString(sidecarAdapter2, i);
                    sidecarAdapter2 = sidecarAdapter2.warmup();
                    i--;
                }
                access_getextensioncallback_p.toString(sidecarAdapter2, i);
                if (sidecarAdapter2 == sidecarAdapter) {
                    return;
                }
                sidecarAdapter2 = sidecarAdapter2.receiveFile();
            }
        }
    }

    public static void toString(access$getExtensionCallback$p access_getextensioncallback_p, Elements elements) {
        isWindowLayoutProviderValid.ag$a(access_getextensioncallback_p);
        isWindowLayoutProviderValid.ag$a(elements);
        Iterator<Element> it = elements.iterator();
        while (it.hasNext()) {
            ah$a(access_getextensioncallback_p, it.next());
        }
    }

    public static NodeFilter.FilterResult toString(NodeFilter nodeFilter, SidecarAdapter sidecarAdapter) {
        SidecarAdapter sidecarAdapter2 = sidecarAdapter;
        int i = 0;
        while (sidecarAdapter2 != null) {
            NodeFilter.FilterResult values = nodeFilter.values(sidecarAdapter2, i);
            if (values == NodeFilter.FilterResult.STOP) {
                return values;
            }
            if (values == NodeFilter.FilterResult.CONTINUE && sidecarAdapter2.values() > 0) {
                sidecarAdapter2 = sidecarAdapter2.ah$a(0);
                i++;
            } else {
                while (sidecarAdapter2.receiveFile() == null && i > 0) {
                    if ((values == NodeFilter.FilterResult.CONTINUE || values == NodeFilter.FilterResult.SKIP_CHILDREN) && (values = nodeFilter.valueOf(sidecarAdapter2, i)) == NodeFilter.FilterResult.STOP) {
                        return values;
                    }
                    SidecarAdapter warmup = sidecarAdapter2.warmup();
                    i--;
                    if (values == NodeFilter.FilterResult.REMOVE) {
                        sidecarAdapter2.requestPostMessageChannelWithExtras();
                    }
                    values = NodeFilter.FilterResult.CONTINUE;
                    sidecarAdapter2 = warmup;
                }
                if ((values == NodeFilter.FilterResult.CONTINUE || values == NodeFilter.FilterResult.SKIP_CHILDREN) && (values = nodeFilter.valueOf(sidecarAdapter2, i)) == NodeFilter.FilterResult.STOP) {
                    return values;
                }
                if (sidecarAdapter2 == sidecarAdapter) {
                    return values;
                }
                SidecarAdapter receiveFile = sidecarAdapter2.receiveFile();
                if (values == NodeFilter.FilterResult.REMOVE) {
                    sidecarAdapter2.requestPostMessageChannelWithExtras();
                }
                sidecarAdapter2 = receiveFile;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    public static void values(NodeFilter nodeFilter, Elements elements) {
        isWindowLayoutProviderValid.ag$a(nodeFilter);
        isWindowLayoutProviderValid.ag$a(elements);
        Iterator<Element> it = elements.iterator();
        while (it.hasNext() && toString(nodeFilter, it.next()) != NodeFilter.FilterResult.STOP) {
        }
    }
}
