package com.coding.test.cp;

import com.coding.module1.cp.Atm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest {
    Atm atm;

    @BeforeEach
    void beforeEach(){
        atm = new Atm();
    }

    @ParameterizedTest
    @CsvSource(
        {
            "30, 120.00, 89.50",
            "200, 120.00, 120.00",
            "42, 120.00, 120.00"
        }
    )
    void withdrawTotal(int amount, double balanceInput, double expected ) throws IOException {
         double balance = atm.withdraw( amount, balanceInput);
         assertEquals(expected, balance );
    }

}