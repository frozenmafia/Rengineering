package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public abstract class apj extends apd implements apk {
    public apj() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apd
    protected final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(j());
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ape.b(parcel);
                n(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 3:
                arb b2 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                boolean p = p(b2);
                parcel2.writeNoException();
                ape.c(parcel2, p);
                return true;
            case 4:
                arb b3 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                boolean q = q(b3);
                parcel2.writeNoException();
                ape.c(parcel2, q);
                return true;
            case 5:
                String readString3 = parcel.readString();
                ape.b(parcel);
                o(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                arb b4 = ara.b(parcel.readStrongBinder());
                arb b5 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                arb d = d(b4, b5);
                parcel2.writeNoException();
                ape.e(parcel2, d);
                return true;
            case 7:
                arb b6 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                String f = f(b6);
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 8:
                arb b7 = ara.b(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                ape.b(parcel);
                String e = e(b7, readString4);
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 9:
                arb b8 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                l(b8);
                parcel2.writeNoException();
                return true;
            case 10:
                arb b9 = ara.b(parcel.readStrongBinder());
                arb b10 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                arb c = c(b9, b10);
                parcel2.writeNoException();
                ape.e(parcel2, c);
                return true;
            case 11:
                String readString5 = parcel.readString();
                boolean f2 = ape.f(parcel);
                ape.b(parcel);
                boolean s = s(readString5, f2);
                parcel2.writeNoException();
                ape.c(parcel2, s);
                return true;
            case 12:
                arb b11 = ara.b(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                ape.b(parcel);
                String g = g(b11, createByteArray);
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 13:
                arb b12 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                String i2 = i(b12);
                parcel2.writeNoException();
                parcel2.writeString(i2);
                return true;
            case 14:
                arb b13 = ara.b(parcel.readStrongBinder());
                arb b14 = ara.b(parcel.readStrongBinder());
                arb b15 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                String k = k(b13, b14, b15);
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 15:
                arb b16 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                m(b16);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                arb b17 = ara.b(parcel.readStrongBinder());
                arb b18 = ara.b(parcel.readStrongBinder());
                arb b19 = ara.b(parcel.readStrongBinder());
                arb b20 = ara.b(parcel.readStrongBinder());
                ape.b(parcel);
                String h = h(b17, b18, b19, b20);
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 18:
                boolean r = r();
                parcel2.writeNoException();
                ape.c(parcel2, r);
                return true;
            case 19:
                boolean t = t();
                parcel2.writeNoException();
                ape.c(parcel2, t);
                return true;
            case 20:
                int b21 = b();
                parcel2.writeNoException();
                parcel2.writeInt(b21);
                return true;
        }
    }
}
