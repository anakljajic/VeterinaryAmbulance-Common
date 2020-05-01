package listeners;

import java.math.BigDecimal;

/**
 *
 * @author anakl
 */
public interface PayBillDialogListener {
    public void confirmBill();
    
    public void addDebt(BigDecimal debt);
}
