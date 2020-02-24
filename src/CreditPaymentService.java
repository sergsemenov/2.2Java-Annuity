import static java.lang.Math.pow; //пришлось гуглить возведение в степень. Лучшее, что нагуглил. Не уверен в универсальности.

public class CreditPaymentService {
    public long calculate(long totalCreditSum, double interestRateYear, int creditPeriod) {
        int creditPeriodInMonths = creditPeriod * 12;
        double interestRateMonth = interestRateYear / 100 / 12;
        long monthlyPayment = (long) ((long) totalCreditSum * (interestRateMonth + interestRateMonth / (Math.pow((1 + interestRateMonth), creditPeriodInMonths) - 1)));
    return monthlyPayment;
    }
}

