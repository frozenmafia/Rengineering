package o;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.appsamurai.storyly.exoplayer2.extractor.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class rename extends AtomicFile {
    @Override // o.AtomicFile
    protected Metadata ag$a(sync syncVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return values(new getAzimuthDegrees(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static Metadata values(getAzimuthDegrees getazimuthdegrees) {
        getazimuthdegrees.toString(12);
        int valueOf = getazimuthdegrees.valueOf(12);
        int values = getazimuthdegrees.values();
        getazimuthdegrees.toString(44);
        getazimuthdegrees.ah$a(getazimuthdegrees.valueOf(12));
        getazimuthdegrees.toString(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (getazimuthdegrees.values() >= (values + valueOf) - 4) {
                break;
            }
            getazimuthdegrees.toString(48);
            int valueOf2 = getazimuthdegrees.valueOf(8);
            getazimuthdegrees.toString(4);
            int values2 = getazimuthdegrees.values() + getazimuthdegrees.valueOf(12);
            String str2 = null;
            while (getazimuthdegrees.values() < values2) {
                int valueOf3 = getazimuthdegrees.valueOf(8);
                int valueOf4 = getazimuthdegrees.valueOf(8);
                int values3 = getazimuthdegrees.values() + valueOf4;
                if (valueOf3 == 2) {
                    int valueOf5 = getazimuthdegrees.valueOf(16);
                    getazimuthdegrees.toString(8);
                    if (valueOf5 != 3) {
                    }
                    while (getazimuthdegrees.values() < values3) {
                        str = getazimuthdegrees.toString(getazimuthdegrees.valueOf(8), addUpdateOp.values);
                        int valueOf6 = getazimuthdegrees.valueOf(8);
                        for (int i = 0; i < valueOf6; i++) {
                            getazimuthdegrees.ah$a(getazimuthdegrees.valueOf(8));
                        }
                    }
                } else if (valueOf3 == 21) {
                    str2 = getazimuthdegrees.toString(valueOf4, addUpdateOp.values);
                }
                getazimuthdegrees.values(values3 * 8);
            }
            getazimuthdegrees.values(values2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(valueOf2, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
