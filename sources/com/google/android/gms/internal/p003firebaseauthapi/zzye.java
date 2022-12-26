package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.internal.p003firebaseauthapi.zzyd;
import com.google.android.gms.internal.p003firebaseauthapi.zzye;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzye  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzye<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzaaz {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaz
    public final zzyu zzo() {
        try {
            int zzs = zzs();
            zzyu zzyuVar = zzyu.zzb;
            byte[] bArr = new byte[zzs];
            zzze zzG = zzze.zzG(bArr);
            zzG(zzG);
            zzG.zzI();
            return new zzys(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzp(int i) {
        throw null;
    }

    public final void zzq(OutputStream outputStream) throws IOException {
        zzze zzH = zzze.zzH(outputStream, zzze.zzB(zzs()));
        zzG(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaaz
    public final byte[] zzr() {
        try {
            byte[] bArr = new byte[zzs()];
            zzze zzG = zzze.zzG(bArr);
            zzG(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
