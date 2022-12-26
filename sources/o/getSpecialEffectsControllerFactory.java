package o;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;
/* loaded from: classes4.dex */
public final /* synthetic */ class getSpecialEffectsControllerFactory implements Comparator {
    public static final /* synthetic */ getSpecialEffectsControllerFactory values = new getSpecialEffectsControllerFactory();

    private /* synthetic */ getSpecialEffectsControllerFactory() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int values2;
        values2 = getContainer.values((InstrumentData) obj, (InstrumentData) obj2);
        return values2;
    }
}
