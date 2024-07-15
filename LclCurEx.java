package localization;
import java.util.Currency;
import java.util.Locale;
public class LclCurEx {
        public static void main(String[] args) {
        	Currency usdCurrency = Currency.getInstance("USD");
			System.out.println(usdCurrency.getDisplayName(Locale.US)+":"+usdCurrency.getSymbol(Locale.US)); // Output: US Dollar
			Currency euroCurrency = Currency.getInstance("EUR");
			System.out.println(euroCurrency.getDisplayName(Locale.GERMANY)+":"+euroCurrency.getSymbol(Locale.GERMANY)); //	Output: Euro
			Currency indCur = Currency.getInstance("INR");
			System.out.println(indCur.getDisplayName(new Locale(" ","IN"))+":"+indCur.getSymbol(new Locale(" ","IN")));
	}

}
