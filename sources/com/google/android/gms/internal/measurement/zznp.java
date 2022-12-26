package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.ViewConfiguration;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.C;
import o.isFirst;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public final class zznp implements zzno {
    private static int ag$a = 1;
    private static int ah$a;
    private static char[] valueOf;
    private static char values;
    public static final zzib zzA;
    public static final zzib zzB;
    public static final zzib zzC;
    public static final zzib zzD;
    public static final zzib zzE;
    public static final zzib zzF;
    public static final zzib zzG;
    public static final zzib zzH;
    public static final zzib zzI;
    public static final zzib zzJ;
    public static final zzib zzK;
    public static final zzib zzL;
    public static final zzib zzM;
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;
    public static final zzib zze;
    public static final zzib zzf;
    public static final zzib zzg;
    public static final zzib zzh;
    public static final zzib zzi;
    public static final zzib zzj;
    public static final zzib zzk;
    public static final zzib zzl;
    public static final zzib zzm;
    public static final zzib zzn;
    public static final zzib zzo;
    public static final zzib zzp;
    public static final zzib zzq;
    public static final zzib zzr;
    public static final zzib zzs;
    public static final zzib zzt;
    public static final zzib zzu;
    public static final zzib zzv;
    public static final zzib zzw;
    public static final zzib zzx;
    public static final zzib zzy;
    public static final zzib zzz;

    static {
        ag$a();
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zzd("measurement.ad_id_cache_time", WorkRequest.MIN_BACKOFF_MILLIS);
        zzb = zza2.zzd("measurement.max_bundles_per_iteration", 100L);
        zzc = zza2.zzd("measurement.config.cache_time", 86400000L);
        zzd = zza2.zze("measurement.log_tag", "FA");
        zze = zza2.zze("measurement.config.url_authority", "app-measurement.com");
        zzf = zza2.zze("measurement.config.url_scheme", ah$a((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 69), new char[]{0, 2, 1, 0, 13871}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4).intern());
        zzg = zza2.zzd("measurement.upload.debug_upload_interval", 1000L);
        zzh = zza2.zzd("measurement.lifetimevalue.max_currency_tracked", 4L);
        zzi = zza2.zzd("measurement.store.max_stored_events_per_app", 100000L);
        zzj = zza2.zzd("measurement.experiment.max_ids", 50L);
        zzk = zza2.zzd("measurement.audience.filter_result_max_count", 200L);
        zzl = zza2.zzd("measurement.alarm_manager.minimum_interval", 60000L);
        zzm = zza2.zzd("measurement.upload.minimum_delay", 500L);
        zzn = zza2.zzd("measurement.monitoring.sample_period_millis", 86400000L);
        zzo = zza2.zzd("measurement.upload.realtime_upload_interval", WorkRequest.MIN_BACKOFF_MILLIS);
        zzp = zza2.zzd("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zzq = zza2.zzd("measurement.config.cache_time.service", 3600000L);
        zzr = zza2.zzd("measurement.service_client.idle_disconnect_millis", 5000L);
        zzs = zza2.zze("measurement.log_tag.service", "FA-SVC");
        zzt = zza2.zzd("measurement.upload.stale_data_deletion_interval", 86400000L);
        zzu = zza2.zzd("measurement.sdk.attribution.cache.ttl", 604800000L);
        zzv = zza2.zzd("measurement.redaction.app_instance_id.ttl", 7200000L);
        zzw = zza2.zzd("measurement.upload.backoff_period", 43200000L);
        zzx = zza2.zzd("measurement.upload.initial_upload_delay_time", C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        zzy = zza2.zzd("measurement.upload.interval", 3600000L);
        zzz = zza2.zzd("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        zzA = zza2.zzd("measurement.upload.max_bundles", 100L);
        zzB = zza2.zzd("measurement.upload.max_conversions_per_day", 500L);
        zzC = zza2.zzd("measurement.upload.max_error_events_per_day", 1000L);
        zzD = zza2.zzd("measurement.upload.max_events_per_bundle", 1000L);
        zzE = zza2.zzd("measurement.upload.max_events_per_day", 100000L);
        zzF = zza2.zzd("measurement.upload.max_public_events_per_day", 50000L);
        zzG = zza2.zzd("measurement.upload.max_queue_time", 2419200000L);
        zzH = zza2.zzd("measurement.upload.max_realtime_events_per_day", 10L);
        zzI = zza2.zzd("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        zzJ = zza2.zzd("measurement.upload.retry_count", 6L);
        zzK = zza2.zzd("measurement.upload.retry_time", 1800000L);
        zzL = zza2.zze("measurement.upload.url", "https://app-measurement.com/a");
        zzM = zza2.zzd("measurement.upload.window_interval", 3600000L);
        int i = ah$a + 75;
        ag$a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    static void ag$a() {
        values = (char) 2;
        valueOf = new char[]{13806, 13802, 13810, 13801};
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzA() {
        int i = ah$a + 63;
        ag$a = i % 128;
        int i2 = i % 2;
        try {
            try {
                long longValue = ((Long) zzF.zzb()).longValue();
                int i3 = ag$a + 93;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return longValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzB() {
        long longValue;
        int i = ag$a + 121;
        ah$a = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? '\n' : '+') != '+') {
            longValue = ((Long) zzG.zzb()).longValue();
            int length = objArr.length;
        } else {
            longValue = ((Long) zzG.zzb()).longValue();
        }
        int i2 = ah$a + 79;
        ag$a = i2 % 128;
        if ((i2 % 2 == 0 ? '&' : '7') != '7') {
            int length2 = objArr.length;
            return longValue;
        }
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzC() {
        int i = ag$a + 35;
        ah$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzH.zzb()).longValue();
        int i3 = ah$a + 43;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzD() {
        try {
            int i = ag$a + 33;
            ah$a = i % 128;
            int i2 = i % 2;
            long longValue = ((Long) zzI.zzb()).longValue();
            int i3 = ah$a + 17;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return longValue;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzE() {
        int i = ah$a + 53;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 18 / 0;
            return ((Long) zzJ.zzb()).longValue();
        }
        try {
            try {
                return ((Long) zzJ.zzb()).longValue();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzF() {
        int i = ah$a + 83;
        ag$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzK.zzb()).longValue();
        try {
            int i3 = ah$a + 123;
            try {
                ag$a = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return longValue;
                }
                return longValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzG() {
        try {
            int i = ah$a + 17;
            try {
                ag$a = i % 128;
                int i2 = i % 2;
                long longValue = ((Long) zzM.zzb()).longValue();
                int i3 = ag$a + 85;
                ah$a = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return longValue;
                }
                return longValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final String zzH() {
        String str;
        int i = ag$a + 21;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 25 : (char) 21) != 21) {
            str = (String) zze.zzb();
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            str = (String) zze.zzb();
        }
        int i2 = ag$a + 73;
        ah$a = i2 % 128;
        if ((i2 % 2 != 0 ? '6' : '\'') != '\'') {
            int i3 = 77 / 0;
            return str;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final String zzI() {
        int i = ah$a + 93;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = (String) zzf.zzb();
        int i3 = ag$a + 79;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final String zzJ() {
        int i = ag$a + 1;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = (String) zzL.zzb();
        try {
            int i3 = ag$a + 109;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zza() {
        int i = ah$a + 87;
        ag$a = i % 128;
        if (!(i % 2 == 0)) {
            try {
                return ((Long) zza.zzb()).longValue();
            } catch (Exception e) {
                throw e;
            }
        }
        long longValue = ((Long) zza.zzb()).longValue();
        Object obj = null;
        super.hashCode();
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzb() {
        int i = ah$a + 23;
        ag$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzb.zzb()).longValue();
        int i3 = ah$a + 7;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzc() {
        long longValue;
        int i = ag$a + 113;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'E' : (char) 24) != 24) {
            longValue = ((Long) zzc.zzb()).longValue();
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            longValue = ((Long) zzc.zzb()).longValue();
        }
        int i2 = ag$a + 93;
        ah$a = i2 % 128;
        int i3 = i2 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzd() {
        long longValue;
        try {
            int i = ah$a + 61;
            ag$a = i % 128;
            Object[] objArr = null;
            if (!(i % 2 != 0)) {
                longValue = ((Long) zzg.zzb()).longValue();
                int length = objArr.length;
            } else {
                longValue = ((Long) zzg.zzb()).longValue();
            }
            int i2 = ag$a + 19;
            ah$a = i2 % 128;
            if (i2 % 2 == 0) {
                return longValue;
            }
            int length2 = objArr.length;
            return longValue;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zze() {
        int i = ah$a + 5;
        ag$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzh.zzb()).longValue();
        int i3 = ag$a + 25;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzf() {
        long longValue;
        int i = ah$a + 5;
        ag$a = i % 128;
        if ((i % 2 == 0 ? '\"' : 'A') != '\"') {
            longValue = ((Long) zzi.zzb()).longValue();
        } else {
            longValue = ((Long) zzi.zzb()).longValue();
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = ag$a + 77;
        ah$a = i2 % 128;
        int i3 = i2 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzg() {
        int i = ah$a + 91;
        ag$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzj.zzb()).longValue();
        try {
            int i3 = ag$a + 17;
            try {
                ah$a = i3 % 128;
                if ((i3 % 2 != 0 ? '<' : (char) 16) != '<') {
                    return longValue;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return longValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzh() {
        int i = ag$a + 37;
        ah$a = i % 128;
        if ((i % 2 != 0 ? Soundex.SILENT_MARKER : '\n') == '\n') {
            try {
                return ((Long) zzk.zzb()).longValue();
            } catch (Exception e) {
                throw e;
            }
        }
        long longValue = ((Long) zzk.zzb()).longValue();
        Object obj = null;
        super.hashCode();
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzi() {
        int i = ah$a + 39;
        ag$a = i % 128;
        if (i % 2 == 0) {
            long longValue = ((Long) zzl.zzb()).longValue();
            Object[] objArr = null;
            int length = objArr.length;
            return longValue;
        }
        return ((Long) zzl.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzj() {
        long longValue;
        int i = ag$a + 41;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 1 : 'H') != 'H') {
            longValue = ((Long) zzm.zzb()).longValue();
            int i2 = 28 / 0;
        } else {
            try {
                longValue = ((Long) zzm.zzb()).longValue();
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = ah$a + 55;
        ag$a = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 21 : 'H') != 'H') {
            Object obj = null;
            super.hashCode();
            return longValue;
        }
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzk() {
        long longValue;
        int i = ag$a + 17;
        ah$a = i % 128;
        Object[] objArr = null;
        if (!(i % 2 == 0)) {
            longValue = ((Long) zzn.zzb()).longValue();
            super.hashCode();
        } else {
            longValue = ((Long) zzn.zzb()).longValue();
        }
        int i2 = ag$a + 87;
        ah$a = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 30 : '\t') != '\t') {
            int length = objArr.length;
            return longValue;
        }
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzl() {
        long longValue;
        try {
            int i = ah$a + 33;
            try {
                ag$a = i % 128;
                Object[] objArr = null;
                if ((i % 2 == 0 ? '%' : (char) 29) != '%') {
                    longValue = ((Long) zzo.zzb()).longValue();
                } else {
                    longValue = ((Long) zzo.zzb()).longValue();
                    super.hashCode();
                }
                int i2 = ag$a + 53;
                ah$a = i2 % 128;
                if ((i2 % 2 != 0 ? '1' : 'G') != 'G') {
                    int length = objArr.length;
                    return longValue;
                }
                return longValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzm() {
        long longValue;
        int i = ag$a + 39;
        ah$a = i % 128;
        if (i % 2 == 0) {
            try {
                try {
                    longValue = ((Long) zzp.zzb()).longValue();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            longValue = ((Long) zzp.zzb()).longValue();
            Object obj = null;
            super.hashCode();
        }
        int i2 = ah$a + 23;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzn() {
        long longValue;
        int i = ah$a + 43;
        ag$a = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? (char) 3 : '?') != 3) {
            longValue = ((Long) zzr.zzb()).longValue();
        } else {
            longValue = ((Long) zzr.zzb()).longValue();
            int length = objArr.length;
        }
        try {
            int i2 = ah$a + 71;
            ag$a = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 22 : 'U') != 'U') {
                int length2 = objArr.length;
                return longValue;
            }
            return longValue;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzo() {
        long longValue;
        int i = ah$a + 103;
        ag$a = i % 128;
        if ((i % 2 == 0 ? '0' : (char) 27) != 27) {
            try {
                longValue = ((Long) zzt.zzb()).longValue();
                int i2 = 66 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            longValue = ((Long) zzt.zzb()).longValue();
        }
        int i3 = ag$a + 113;
        ah$a = i3 % 128;
        if ((i3 % 2 != 0 ? TokenParser.SP : 'b') != ' ') {
            return longValue;
        }
        Object obj = null;
        super.hashCode();
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzp() {
        int i = ah$a + 119;
        ag$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzu.zzb()).longValue();
        int i3 = ah$a + 123;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzq() {
        int i = ag$a + 117;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 11 : '0') != 11) {
            return ((Long) zzv.zzb()).longValue();
        }
        long longValue = ((Long) zzv.zzb()).longValue();
        Object[] objArr = null;
        int length = objArr.length;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzr() {
        int i = ah$a + 113;
        ag$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzw.zzb()).longValue();
        int i3 = ah$a + 123;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzs() {
        int i = ag$a + 101;
        ah$a = i % 128;
        if (i % 2 == 0) {
            try {
                return ((Long) zzx.zzb()).longValue();
            } catch (Exception e) {
                throw e;
            }
        }
        long longValue = ((Long) zzx.zzb()).longValue();
        Object[] objArr = null;
        int length = objArr.length;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzt() {
        try {
            int i = ah$a + 69;
            ag$a = i % 128;
            int i2 = i % 2;
            long longValue = ((Long) zzy.zzb()).longValue();
            try {
                int i3 = ah$a + 41;
                ag$a = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return longValue;
                }
                int i4 = 60 / 0;
                return longValue;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzu() {
        int i = ah$a + 47;
        ag$a = i % 128;
        if ((i % 2 == 0 ? '>' : '\t') != '>') {
            return ((Long) zzz.zzb()).longValue();
        }
        int i2 = 88 / 0;
        return ((Long) zzz.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzv() {
        int i = ag$a + 51;
        ah$a = i % 128;
        int i2 = i % 2;
        long longValue = ((Long) zzA.zzb()).longValue();
        int i3 = ag$a + 29;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzw() {
        int i = ah$a + 105;
        ag$a = i % 128;
        if ((i % 2 == 0 ? (char) 2 : 'V') != 2) {
            return ((Long) zzB.zzb()).longValue();
        }
        try {
            long longValue = ((Long) zzB.zzb()).longValue();
            Object obj = null;
            super.hashCode();
            return longValue;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzx() {
        long longValue;
        int i = ag$a + 21;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 22 : '*') != 22) {
            longValue = ((Long) zzC.zzb()).longValue();
        } else {
            longValue = ((Long) zzC.zzb()).longValue();
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = ah$a + 79;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return longValue;
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzy() {
        int i = ag$a + 65;
        ah$a = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
            return ((Long) zzD.zzb()).longValue();
        }
        return ((Long) zzD.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzno
    public final long zzz() {
        int i = ag$a + 39;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'E' : (char) 31) != 31) {
            long longValue = ((Long) zzE.zzb()).longValue();
            Object obj = null;
            super.hashCode();
            return longValue;
        }
        return ((Long) zzE.zzb()).longValue();
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = values;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
