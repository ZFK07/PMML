package com.example.pmml.tree.notruechildstrategy;

import com.example.pmml.VerificationHelper;
import org.jpmml.evaluator.EvaluationException;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NoChildTest {
        @Test
        void testLastPrediction() {
                VerificationHelper.verify("com/example/pmml/tree/notruechildstrategy/lastprediction.xml");
        }

        @Test
        void testNullPrediction() throws JAXBException, SAXException, IOException {
                assertThrows(EvaluationException.class, () -> VerificationHelper.verify("com/example/pmml/tree/notruechildstrategy/nullprediction.xml"), "No PMML data type for Java data type null");
        }
}
