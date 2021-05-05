package com.example.pmml.regression;

import com.example.pmml.VerificationHelper;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.IOException;

class RegressionTest {

        @Test
        void testPmml_INVALIDVALUETREATMENTMETHODisAsIs() {
                VerificationHelper.verify("com/example/pmml/regression/linear_regression.xml");
        }
}
