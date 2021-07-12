package com.zx.code;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Random;

/**
 * @author： zhangxin
 * @date： 2021-07-11 19:09
 */
public class ImageCode {

    public  static  ImageCode getInstance(){

        return new ImageCode();
    }

    private String code;

    private ByteArrayInputStream image;

    private  int width=400;

    private int height=100;

    private ImageCode(){
        //图形缓冲区 给个黑板
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);
        //给一支画笔
        Graphics graphics=image.getGraphics();

        graphics.setColor(new Color(17,47,37));

        graphics.fillRect(0,0,width,height);

        //字体
        graphics.setFont(new Font("宋体",Font.PLAIN,30));

        Random random=new Random();

        code ="";

        for (int i=0;i<6;i++){
            String s=String.valueOf(random.nextInt(10));

        }

    }


}
