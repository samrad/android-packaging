package com.packagingmidsweden.packaging;

public class DownloaderService extends com.google.android.vending.expansion.downloader.impl.DownloaderService {
	
	// You must use the public key belonging to your publisher account
    public static final String BASE64_PUBLIC_KEY = 
    		"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkpVcma9u4rboLs" +
    		"GkyoB1UQnGW3VlsdBPvYbc40M4lio6kNcYTzUROEjwGIl/cC60nCqgW7xL" +
    		"KukYwmEOsvcGIrKXFTSgqmNRCgkqEVScEc2e+llPQaKNUr9oPOc+1U/ZYR" +
    		"OEfcFs2x5F3OgJ2WENh+7JBoKWNIJoHRR5AdbYI6264VVaxbbb8/7k6KZw" +
    		"32Cfipaa3ul3KmPiOBlMZjil4Z4WQxm3xISqNSCzTtsNWHFMD/16bouhyd" +
    		"KjBObpqcv/TSfcLsWzY0lvit1i7SxqiTljJvsbC2WYccg1HeYVw0VxAnwH" +
    		"8BfkarEG8/X55X1eSh0DjKqqLMOb2HhvbFMt9wIDAQAB";
    
    // You should also modify this salt
    public static final byte[] SALT = new byte[] { 13, -13, -12, -7, 54, 98,
            -17, -12, 49, 28, -86, -4, 9, 5, -113, -107, -69, 45, -1, 84
    };

	@Override
	public String getPublicKey() {
		return BASE64_PUBLIC_KEY;
	}

	@Override
	public byte[] getSALT() {
		return SALT;
	}

	@Override
	public String getAlarmReceiverClassName() {
		return AlarmReceiver.class.getName();
	}

}
