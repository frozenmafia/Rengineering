package droidninja.filepicker.models.sort;

import droidninja.filepicker.models.Document;
import java.util.Comparator;
/* loaded from: classes5.dex */
public enum SortingTypes {
    name(new Comparator<Document>() { // from class: o.getOrCreate
        @Override // java.util.Comparator
        /* renamed from: ag$a */
        public int compare(Document document, Document document2) {
            return document.HaptikSDK$a().toLowerCase().compareTo(document2.HaptikSDK$a().toLowerCase());
        }
    }),
    none(null);
    
    private final Comparator<Document> comparator;

    SortingTypes(Comparator comparator) {
        this.comparator = comparator;
    }

    public Comparator<Document> getComparator() {
        return this.comparator;
    }
}
