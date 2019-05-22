package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

 public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes a){
        ImageReader b=null                ;
        if(a==ImageTypes.BMP) b=new BmpReader();
        else if(a==ImageTypes.JPG) b=new JpgReader();
        else if(a==ImageTypes.PNG) b=new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
        return b;
    }
}
