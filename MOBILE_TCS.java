import java.util.*;
public class MOBILE_TCS {

    String iMEICode;
    boolean isSingleSIM;
    String processor;
    double price;
    String manufacturer;
    MOBILE_TCS(){}
    MOBILE_TCS(String iMEICode,boolean isSingleSim,String processor,double price,String manufacturer)
    {
        this.iMEICode = iMEICode;
        this.isSingleSIM = isSingleSim;
        this.processor = processor;
        this.price =price;
        this.manufacturer = manufacturer;
    }
    String getIMEICode()
    {
        return iMEICode;
    }
    String getisSingleSim()
    {
        return isSingleSIM;
    } 
    double getPrice()
    {
        return price;
    }
    String getprocessor()
    {
        return processor;
    }
    String getmanufacturer()
    {
        return manufacturer;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
}