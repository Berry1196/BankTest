import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank();
    Konto konto1 = new Konto("Martin",100);
    Konto konto2 = new Konto("Berry",100);

    @Test
    void opret() {
    assertEquals(true,bank.opret(konto1));
    assertEquals(true,bank.opret(konto2));
    }
}