package org.example.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static void takeAScreenshot(WebDriver driver, String fileName){
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + String.format("/Logs/%s.png",fileName);
        try{
            org.apache.commons.io.FileUtils.copyFile(sourceFile, new File(destinationFile));
        }catch (Error | IOException e){
            System.out.print("The exception has been caught and the screenshot has been taken!");
            e.printStackTrace();
        }
    }
}