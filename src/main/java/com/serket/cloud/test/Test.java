package com.serket.cloud.test;

import com.serket.cloud.bean.Prescription;
import com.serket.cloud.service.PrescriptionServiceImpl;
import com.serket.cloud.util.Encryption;

import java.util.UUID;

/**
 * Created by Administrator on 2015/5/10.
 */
public class Test {
    public static void main(String [] args){
        System.out.println(UUID.randomUUID());
         System.out.println(Encryption.QRCode());
}}
