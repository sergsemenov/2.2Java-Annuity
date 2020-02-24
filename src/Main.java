public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long totalCreditSum = 1_000_000;
        double interestRateYear = 9.99;

        System.out.println("Сумма кредита в " + totalCreditSum + " руб. " + "при ставке " + interestRateYear + "% " + "сроком на: ");

        long monthlyPayment1Year = service.calculate(totalCreditSum, interestRateYear, 1);
        System.out.println(" * 1 год - " + "ежемесячный платеж составит " + monthlyPayment1Year + " руб.");

        long monthlyPayment2Years = service.calculate(totalCreditSum, interestRateYear, 2);
        System.out.println(" * 2 года - " + "ежемесячный платеж составит " + monthlyPayment2Years + " руб.");

        long monthlyPayment3Years = service.calculate(totalCreditSum, interestRateYear, 3);
        System.out.println(" * 3 года - " + "ежемесячный платеж составит " + monthlyPayment3Years + " руб.");
    }
}
