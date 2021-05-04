package com.example.pmml.tree.notruechildstrategy;

import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

public class NoChildTest {
        @Test
        void testLastPrediction() throws JAXBException, SAXException, IOException {
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(new File("src/test/java/com/example/pmml/tree/notruechildstrategy/lastprediction.xml")).build();
                evaluator.verify();
        }

        @Test
        void testNullPrediction() throws JAXBException, SAXException, IOException {
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(new File("src/test/java/com/example/pmml/tree/notruechildstrategy/nullprediction.xml")).build();
                evaluator.verify();
        }
}
