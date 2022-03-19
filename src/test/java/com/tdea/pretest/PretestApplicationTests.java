package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PretestApplicationTests {

    @Test
    public void isPasswordEqual() {

        String dbPassword = "liah";
        String password = "Liah";

        boolean result = UserUtils.isPasswordEqual(dbPassword, password);

        assertFalse(result);
    }
}
