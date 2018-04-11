package cogs.driverTooling.frameCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader
{
    public static void loadProperties(String propertyFileName)
    {
        try(InputStream input = new FileInputStream(propertyFileName))
        {
            Properties props = new Properties();
                        props.load(input);
            for(String name:props.stringPropertyNames())
            {
                System.setProperty(name, props.getProperty(name));
            }
        }
        catch(IOException e)
        {
            throw new RuntimeException("could not access properties");

        }
    }
}
