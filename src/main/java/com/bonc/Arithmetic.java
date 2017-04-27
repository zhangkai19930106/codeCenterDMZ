package com.bonc;

import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
public class Arithmetic {


	public static SecretKeySpec getKey(String seed){
		SecretKeySpec key = null;
		try {
			key = new SecretKeySpec(hex2byte(seed.getBytes()), "AES");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  key;
	}

	/**
	 * 加密String明文输入,String密文输出
	 *
	 * @param strMing
	 * @return
	 */
	public static String getEncString(String strMing, String seed) {
		byte[] byteMi = null;
		byte[] byteMing = null;
		String strMi = "";
		try {
			return byte2hex(getEncCode(strMing.getBytes("GBK"),seed));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			byteMing = null;
			byteMi = null;
		}
		return strMi;
	}

	/**
	 * 解密 以String密文输入,String明文输出
	 *
	 * @param strMi
	 * @return
	 */
	public static String getDesString(String strMi, String seed) {
		byte[] byteMing = null;
		byte[] byteMi = null;
		String strMing = "";
		try {
			return new String(getDesCode(hex2byte(strMi.getBytes()),seed),"GBK");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			byteMing = null;
			byteMi = null;
		}
		return strMing;
	}

	/**
	 * 加密以byte[]明文输入,byte[]密文输出
	 *
	 * @param byteS
	 * @return
	 */
	private static byte[] getEncCode(byte[] byteS, String seed) {
		SecretKeySpec key = getKey(seed);
		byte[] byteFina = null;
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byteFina = cipher.doFinal(byteS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cipher = null;
		}
		return byteFina;
	}

	/**
	 * 解密以byte[]密文输入,以byte[]明文输出
	 *
	 * @param byteD
	 * @return
	 */
	private static byte[] getDesCode(byte[] byteD, String seed) {

		SecretKeySpec key = getKey(seed);
		Cipher cipher;
		byte[] byteFina = null;
		try {
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, key);
			byteFina = cipher.doFinal(byteD);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cipher = null;
		}
		return byteFina;
	}

	/**
	 * 二行制转字符串
	 *
	 * @param b
	 * @return
	 */
	public static String byte2hex(byte[] b) { // 一个字节的数，
		// 转成16进制字符串
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			// 整数转成十六进制表示
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase(); // 转成大写
	}

	public static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0)
			throw new IllegalArgumentException("长度不是偶数");
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item="";
			try {
				item = new String(b, n, 2);
				b2[n / 2] = (byte) Integer.parseInt(item, 16);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 两位一组，表示一个字节,把这样表示的16进制字符串，还原成一个进制字节

		}

		return b2;
	}


	/**
	 * 解密 以String密文输入,String明文输出 将异常抛出等待捕获
	 */
	public static String getDesStringNew(String strMi, String seed) throws Exception {
		String strMing = "";
		return new String(getDesCodeNew(hex2byte(strMi.getBytes()),seed));
	}
	/**
	 * 解密以byte[]密文输入,以byte[]明文输出 ,将异常抛出，等待捕获
	 */
	private static byte[] getDesCodeNew(byte[] byteD, String seed) throws Exception {
		SecretKeySpec key = getKey(seed);
		Cipher cipher;
		byte[] byteFina = null;
		cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byteFina = cipher.doFinal(byteD);
		return byteFina;
	}


//	public static void main(String[] args) throws UnsupportedEncodingException {
//		String seed = "94ECBBD9528526298FCC08BCAA99CA43";
//
//		//String str = Arithmetic.getEncString("")
//		//String str=  Arithmetic.getDesString("D8DC3077F549B6BAADA8D002E6AAA286EE4252FFBD5CFD297CF010E0D6D04490", seed);
//		//System.out.println(new String(str.getBytes("GBK"),"utf-8"));
//		//System.out.println(str);
//	}
}
