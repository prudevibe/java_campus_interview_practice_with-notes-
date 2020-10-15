import java.*;
public class autonomustcs {
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestsPassed;
    String environment;
    String grade;
    autonomustcs()
    {

    }
    autonomustcs(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
    {
        super();
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted= noOfTestsConducted;
        this.noOfTestsPassed =noOfTestsPassed;
        this.environment = environment;
    }
    int getCarId()
    {
        return carId;
    }
    String getbrand()
    {
        return brand;
    }
    int getnoOfTestsConducted()
    {
        return noOfTestsConducted;
    }
    int getnoOfTestsPassed()
    {
        return noOfTestsPassed;
    }
    String getenvironment()
    {
        return environment;
    }
    void setgrade(String grade)
    {
        this.grade = grade;
    }
    String getgrade()
    {
        return grade;
    }
}