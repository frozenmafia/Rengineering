package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
/* loaded from: classes5.dex */
public class PhoneAuthProvider {

    /* loaded from: classes5.dex */
    public static class ForceResendingToken extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new Parcelable.Creator<ForceResendingToken>() { // from class: o.ListAdapter.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PhoneAuthProvider.ForceResendingToken createFromParcel(Parcel parcel) {
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    SafeParcelReader.getFieldId(readHeader);
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new PhoneAuthProvider.ForceResendingToken();
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ PhoneAuthProvider.ForceResendingToken[] newArray(int i) {
                return new PhoneAuthProvider.ForceResendingToken[i];
            }
        };

        public static ForceResendingToken valueOf() {
            return new ForceResendingToken();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class toString {
        private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.i("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, ForceResendingToken forceResendingToken) {
        }

        public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

        public abstract void onVerificationFailed(FirebaseException firebaseException);
    }
}
