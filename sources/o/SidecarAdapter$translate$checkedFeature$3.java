package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.nodes.Element;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class SidecarAdapter$translate$checkedFeature$3 extends SidecarCompat {
    int ah$a;
    final ArrayList<SidecarCompat> valueOf;

    SidecarAdapter$translate$checkedFeature$3() {
        this.ah$a = 0;
        this.valueOf = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SidecarAdapter$translate$checkedFeature$3(Collection<SidecarCompat> collection) {
        this();
        this.valueOf.addAll(collection);
        ah$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SidecarCompat values() {
        int i = this.ah$a;
        if (i > 0) {
            return this.valueOf.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(SidecarCompat sidecarCompat) {
        this.valueOf.set(this.ah$a - 1, sidecarCompat);
    }

    void ah$a() {
        this.ah$a = this.valueOf.size();
    }

    /* loaded from: classes5.dex */
    static final class toString extends SidecarAdapter$translate$checkedFeature$3 {
        toString(Collection<SidecarCompat> collection) {
            if (this.ah$a > 1) {
                this.valueOf.add(new SidecarAdapter$translate$checkedFeature$3$ah$a(collection));
            } else {
                this.valueOf.addAll(collection);
            }
            ah$a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString(SidecarCompat... sidecarCompatArr) {
            this(Arrays.asList(sidecarCompatArr));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString() {
        }

        public void values(SidecarCompat sidecarCompat) {
            this.valueOf.add(sidecarCompat);
            ah$a();
        }

        @Override // o.SidecarCompat
        public boolean values(Element element, Element element2) {
            for (int i = 0; i < this.ah$a; i++) {
                if (this.valueOf.get(i).values(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String doesreturn;
            doesreturn = doesReturn.toString(this.valueOf.iterator(), ", ");
            return doesreturn;
        }
    }
}
