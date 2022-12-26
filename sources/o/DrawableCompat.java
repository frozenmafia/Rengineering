package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes3.dex */
public final class DrawableCompat extends Binder {
    private static final int toString;
    private final ImmutableList<Bundle> values;

    static {
        toString = getElevationDegrees.HaptikSDK$b >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public DrawableCompat(List<Bundle> list) {
        this.values = ImmutableList.copyOf((Collection) list);
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.values.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < toString) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.values.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }

    public static ImmutableList<Bundle> toString(IBinder iBinder) {
        int readInt;
        ImmutableList.valueOf builder = ImmutableList.builder();
        int i = 1;
        int i2 = 0;
        while (i != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            builder.toString((ImmutableList.valueOf) ((Bundle) FingerprintManagerCompat.toString(obtain2.readBundle())));
                            i2++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return builder.ah$a();
    }
}
