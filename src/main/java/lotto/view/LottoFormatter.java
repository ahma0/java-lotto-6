package lotto.view;

import lotto.model.PurchaseAmount;
import lotto.model.Result;
import lotto.model.value.Matching;

import java.text.NumberFormat;

public class LottoFormatter {

    public static String getStatisticsFormat(Matching matching, int count) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        return String.format(
                "%s (%s원) - %d개",
                matching.getMatchingNumber(),
                numberFormat.format(matching.getPrizeMoney()),
                count
        );
    }

    public static String getStatisticsRateFormat(Result result, PurchaseAmount purchaseAmount) {
        return String.format("총 수익률은 %.1f%%입니다.", result.getRate(purchaseAmount));
    }

}
