package com.zx;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

/**
 * @author： zhangxin
 * @date： 2021-07-11 19:54
 */
public class TesseractTest {

    public static void main(String[] args) {

        ITesseract iTesseract=new Tesseract();

        //语言包,加进来
        iTesseract.setDatapath("D:\\tessdata\\tessdata");
        iTesseract.setLanguage("chi_sim");


    }
}
