package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.AsyncTask;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes7.dex */
public class MultiDexExtractor {
    public static Drawable ag$a(String str, int i, int i2) {
        try {
            return new values().execute(str, Integer.toString(i), Integer.toString(i2)).get();
        } catch (Exception e) {
            e.printStackTrace();
            return new ShapeDrawable();
        }
    }

    /* loaded from: classes4.dex */
    public interface ExtractedDex extends IInterface {
        void toString(boolean z) throws RemoteException;

        /* loaded from: classes4.dex */
        public static abstract class toString extends loadExistingExtractions implements ExtractedDex {
            public toString() {
                super("com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayServiceCallback");
            }

            @Override // o.loadExistingExtractions
            protected boolean valueOf(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                if (i == 1) {
                    toString(AnonymousClass1.valueOf(parcel));
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class values extends AsyncTask<String, Void, Drawable> {
        values() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: toString */
        public Drawable doInBackground(String... strArr) {
            try {
                int parseInt = Integer.parseInt(strArr[1]);
                int parseInt2 = Integer.parseInt(strArr[2]);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.connect();
                return new BitmapDrawable(Resources.getSystem(), Bitmap.createScaledBitmap(BitmapFactory.decodeStream(httpURLConnection.getInputStream()), parseInt, parseInt2, true));
            } catch (IOException e) {
                e.printStackTrace();
                return new ShapeDrawable();
            }
        }
    }

    /* renamed from: o.MultiDexExtractor$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 {
        private static final ClassLoader ah$a = AnonymousClass1.class.getClassLoader();

        private AnonymousClass1() {
        }

        public static boolean valueOf(Parcel parcel) {
            return parcel.readInt() != 0;
        }

        public static void values(Parcel parcel, Parcelable parcelable) {
            if (parcelable == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }

        public static void ah$a(Parcel parcel, IInterface iInterface) {
            if (iInterface == null) {
                parcel.writeStrongBinder(null);
            } else {
                parcel.writeStrongBinder(iInterface.asBinder());
            }
        }
    }
}
