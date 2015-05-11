package com.serket.cloud.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2015/5/10.
 */
public class Encryption {
    public static String QRCode() {
        String url="http://t.cn/RAkHJel";
        InputStream in= Encryption.class.getClassLoader().getResourceAsStream("download");
        try {
            byte []b= new byte[in.available()];
            url= new String(b);
        } catch (IOException e) {
        }
        String uuid = UUID.randomUUID().toString();
        //ȥ��uuid�е�-
        uuid = uuid.replace("-", "");
        // ��uuid ������һЩ�������
        return url+"/"+addRandomString(uuid,40);
    }
    public static  String accessToken(){
        String uuid = UUID.randomUUID().toString();
        //ȥ��uuid�е�-
        uuid = uuid.replace("-", "");
        return addRandomString(uuid,40);
    }

    private static Random r = new Random();
    //�������ɶ�ά��
    public static char[] cs = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '=', '{', '}', '[', ']', '|', '\'', ':', ';', '"', '<', '>', '.', '?', '/', '"'};
    private static String addRandomString(String uuid,int lenth) {
        StringBuffer sb= new StringBuffer(uuid);
        for (int i = 0; i < lenth-uuid.length(); i++) {
            sb.insert(r.nextInt(31),cs[r.nextInt(30)]);
        }
        return sb.toString();
    }
    public static String SHA(String decript) {
        try {
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("SHA");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // �ֽ�����ת��Ϊ ʮ������ ��
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
