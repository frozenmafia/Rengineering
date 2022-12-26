package o;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;
/* loaded from: classes4.dex */
public interface ZipUtil {
    boolean values(loadExistingExtractions loadexistingextractions, int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException;

    /* loaded from: classes4.dex */
    public final class CentralDirectory {
        private final String toString;

        public static CentralDirectory values(String str) {
            return new CentralDirectory(str);
        }

        public String ag$a() {
            return this.toString;
        }

        private CentralDirectory(String str) {
            Objects.requireNonNull(str, "name is null");
            this.toString = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CentralDirectory) {
                return this.toString.equals(((CentralDirectory) obj).toString);
            }
            return false;
        }

        public int hashCode() {
            return this.toString.hashCode() ^ 1000003;
        }

        public String toString() {
            return "Encoding{name=\"" + this.toString + "\"}";
        }
    }
}
