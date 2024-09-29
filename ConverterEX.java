class Converter {
    void convert(double value) {
    }
}
class CurrencyConverter extends Converter {
    void convert(double value) {
        System.out.println(value + " dollars is equal to " + (value * 74.83) + " INR");
    }
    void convertINRToDollar(double value) {
        System.out.println(value + " INR is equal to " + (value / 74.83) + " dollars");
    }
}
class DistanceConverter extends Converter {
    void convert(double value) {
        System.out.println(value + " meters is equal to " + (value / 1000) + " KM");
    }
    void convertKMToMeter(double value) {
        System.out.println(value + " KM is equal to " + (value * 1000) + " meters");
    }
}
class TimeConverter extends Converter {
    void convert(double value) {
        System.out.println(value + " hours is equal to " + (value * 60) + " minutes");
    }
    void convertMinutesToHours(double value) {
        System.out.println(value + " minutes is equal to " + (value / 60) + " hours");
    }
}
public class ConverterEX {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();
        double dollar = 100;
        double meter = 1000;
        double hours = 2;
        double inr = 7483;
        double km = 1;
        double minutes = 120;

        currencyConverter.convert(dollar);
        currencyConverter.convertINRToDollar(inr);
        distanceConverter.convert(meter);
        distanceConverter.convertKMToMeter(km);
        timeConverter.convert(hours);
        timeConverter.convertMinutesToHours(minutes);
    }
}
