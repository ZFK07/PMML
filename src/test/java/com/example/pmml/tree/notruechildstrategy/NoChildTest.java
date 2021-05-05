package com.example.pmml.tree.notruechildstrategy;

import com.example.pmml.VerificationHelper;
import org.jpmml.evaluator.EvaluationException;
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NoChildTest {
        @Test
        void testLastPrediction() {
                VerificationHelper.verify("com/example/pmml/tree/notruechildstrategy/lastprediction.xml");
        }

        @Test
        void testNullPrediction() throws JAXBException, SAXException, IOException {
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(new File("src/test/resources/com/example/pmml/tree/notruechildstrategy/nullprediction.xml")).build();
                assertThrows(
                        EvaluationException.class,
                        evaluator::verify,
                        "No PMML data type for Java data type null"
                );


        }
}
